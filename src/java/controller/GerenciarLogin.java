/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Menu;
import model.Usuario;
import persistencia.UsuarioDAO;

/**
 *
 * @author Livia
 */
public class GerenciarLogin extends HttpServlet {

    private static HttpServletResponse response;

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getSession().removeAttribute("ulogado");
        response.sendRedirect("login.jsp");
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        GerenciarLogin.response = response;
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");
        ArrayList<String> erros = new ArrayList<String>();
        if (login==null || login.trim().isEmpty()) {
            erros.add("Preencha o login");
        }
        if (senha==null || senha.trim().isEmpty()) {
            erros.add("Preencha a senha");
        }
        if (erros.size() > 0) {
            String campos = "";
            for (String erro : erros) {
                campos = campos + "\\n"+erro;
            }
            exibirMensagem("Prencha os campo(s): "+campos);
        } else {
            try {
                UsuarioDAO uDAO = new UsuarioDAO();
                Usuario u = uDAO.getRecuperarUsuario(login);
                if (u.getIdusuario() > 0 && u.getSenha().equals(senha)) {
                    HttpSession sessao = request.getSession();
                    sessao.setAttribute("ulogado", u);
                    response.sendRedirect("index.jsp");
                }else{
                    exibirMensagem("Login ou senha invalidos!");
                }
            } catch (Exception e) {
                exibirMensagem("Usuário ou Perfil não encontrados!");
            }
        }
    }
    
    private static void exibirMensagem(String mensagem){
        try{
            PrintWriter out = response.getWriter();
            out.print("<script>");
            out.print("alert('"+mensagem+"');");
            out.print("history.back();");
            out.print("</script>");
            out.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static Usuario verificarAcesso(HttpServletRequest request, HttpServletResponse response){
        Usuario u = null;
        GerenciarLogin.response = response;
        try {
            HttpSession sessao = request.getSession();
            if (sessao.getAttribute("ulogado")==null) {
                response.sendRedirect("login.jsp");
            }else{
                String uri = request.getRequestURI();
                String queryString = request.getQueryString();
                if (queryString!=null) {
                    uri += "?" + queryString;
                }
                u = (Usuario) request.getSession().getAttribute("ulogado");
                if (u==null) {
                    sessao.setAttribute("mensagem", "Você não esta autenticado!");
                    response.sendRedirect("login.jsp");
                }else{
                    boolean possuiAcesso = false;
                    for (Menu m : u.getPerfil().getMenu()) {
                        if (uri.contains(m.getLink())) {
                            possuiAcesso = true;
                            break;
                        }
                    }
                    if (!possuiAcesso) {
                        exibirMensagem("Acesso negado!!!");
                    }
                }
            }
        } catch (Exception e) {
            exibirMensagem("Exceção: "+e.getMessage());
        }
        return u;
    }

    public static boolean verificarPermissao(HttpServletRequest request, HttpServletResponse response){
        Usuario u = null;
        GerenciarLogin.response = response;
        boolean possuiAcesso = false;
        try {
            HttpSession sessao = request.getSession();
            if (sessao.getAttribute("ulogado")==null) {
                response.sendRedirect("login.jsp");
            }else{
                String uri = request.getRequestURI();
                String queryString = request.getQueryString();
                if (queryString!=null) {
                    uri += "?" +queryString;
                }
                u = (Usuario) request.getSession().getAttribute("ulogado");
                if (u==null) {
                    sessao.setAttribute("mensagem", "Você não esta autenticado!");
                    response.sendRedirect("login.jsp");
                }else{
                    for (Menu m : u.getPerfil().getMenu()) {
                        if (uri.contains(m.getLink())) {
                            possuiAcesso = true;
                            break;
                        }
                    }
                }
            }
        } catch (Exception e) {
            exibirMensagem("Exceção: "+e.getMessage());
        }
        return possuiAcesso;
    }
    
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
