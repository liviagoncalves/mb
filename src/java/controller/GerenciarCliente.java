package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Cliente;
import persistencia.ClienteDAO;

/**
 *
 * @author Livia
 */
public class GerenciarCliente extends HttpServlet {


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
        try {
            int idcliente = Integer.parseInt(request.getParameter("idcliente"));
            ClienteDAO cDAO = new ClienteDAO();
            if (request.getParameter("acao").equals("alterar")) {
                Cliente c = cDAO.getClientePorIdCliente(idcliente);
                if (c.getIdCliente() > 0) {
                    RequestDispatcher disp = getServletContext().getRequestDispatcher("/form_cliente.jsp");
                    request.setAttribute("cli", c);
                    disp.forward(request, response);
                } else {
                    PrintWriter out = response.getWriter();
                    out.println("<script type='text/javascript'>");
                    out.println("alert('Cliente não encontrado!');");
                    out.println("location.href='listar_cliente.jsp';");
                    out.println("</script>");
                }
            }
            if (request.getParameter("acao").equals("excluir")) {
                PrintWriter out = response.getWriter();
                if (cDAO.excluir(idcliente)) {
                    out.println("<script type='text/javascript'>");
                    out.println("alert('Cliente excluido com sucesso!');");
                    out.println("location.href='listar_cliente.jsp';");
                    out.println("</script>");
                } else {
                    out.println("<script type='text/javascript'>");
                    out.println("alert('Não foi possível excluir Cliente!');");
                    out.println("location.href='listar_cliente.jsp';");
                    out.println("</script>");
                }
            }
        } catch (Exception e) {
            System.out.println("Erro ao recuperar dados!");
        }
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
        request.setCharacterEncoding("UTF-8");
        String mensagem;
        try {
            Cliente c = new Cliente();
            if (!request.getParameter("idcliente").isEmpty()) {
                c.setIdCliente(Integer.parseInt(request.getParameter("idcliente")));
            }
            c.setNome(request.getParameter("nome"));
            c.setEmail(request.getParameter("email"));
            c.setCpf(request.getParameter("cpf"));
            c.setRg(request.getParameter("rg"));
            c.setData_nasc(request.getParameter("data_nasc"));
            c.setSexo(request.getParameter("sexo"));
            c.setTelefone(request.getParameter("telefone"));
            c.setCep(request.getParameter("cep"));
            c.setEndereco(request.getParameter("endereco"));
            c.setNumero(Integer.parseInt(request.getParameter("numero")));
            c.setComplemento(request.getParameter("complemento"));
            c.setBairro(request.getParameter("bairro"));
            c.setCidade(request.getParameter("cidade"));
            c.setUf(request.getParameter("uf"));
            c.setCliente_desde(request.getParameter("cliente_desde"));
            c.setFidelidade(request.getParameter("fidelidade"));
            c.setPromocao(request.getParameter("promocao"));
            ClienteDAO cDAO = new ClienteDAO();
            if (cDAO.gravar(c)) {
                mensagem = "Cliente gravado com sucesso!";
            } else {
                mensagem = "Erro ao gravar Cliente!";
            }
        } catch (Exception e) {
            mensagem = "Erro ao gravar Cliente!";
            System.out.println("Erro ao Gravar Cliente: " + e.getMessage());
        }
        PrintWriter out = response.getWriter();
        out.println("<script type='text/javascript'>");
        out.println("alert('"+mensagem+"');");
        out.println("location.href='listar_cliente.jsp';");
        out.println("</script>");
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
