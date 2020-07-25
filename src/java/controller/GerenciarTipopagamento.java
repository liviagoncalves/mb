package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.TipoPagamento;
import persistencia.TipoPagamentoDAO;

/**
 *
 * @author Livia
 */
public class GerenciarTipopagamento extends HttpServlet {

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
            int idtipo_pagamento = Integer.parseInt(request.getParameter("idtipo_pagamento"));
            TipoPagamentoDAO tpDAO = new TipoPagamentoDAO();
            if (request.getParameter("acao").equals("alterar")) {
                TipoPagamento tp = tpDAO.getTipoPagamentoPorIdtipo_pagamento(idtipo_pagamento);
                if (tp.getIdtipo_pagamento() > 0) {
                    RequestDispatcher disp = getServletContext().getRequestDispatcher("/form_tipoPagamento.jsp");
                    request.setAttribute("tp", tp);
                    disp.forward(request, response);
                } else {
                    PrintWriter out = response.getWriter();
                    out.println("<script type='text/javascript'>");
                    out.println("alert('Tipo Pagamento não encontrado!');");
                    out.println("location.href='listar_tipoPagamento.jsp';");
                    out.println("</script>");
                }
            }
            if (request.getParameter("acao").equals("excluir")) {
                PrintWriter out = response.getWriter();
                if (tpDAO.excluir(idtipo_pagamento)) {
                    out.println("<script type='text/javascript'>");
                    out.println("alert('Tipo Pagamento excluido com sucesso!');");
                    out.println("location.href='listar_tipoPagamento.jsp';");
                    out.println("</script>");
                } else {
                    out.println("<script type='text/javascript'>");
                    out.println("alert('Não foi possível excluir Tipo Pagamento!');");
                    out.println("location.href='listar_tipoPagamento.jsp';");
                    out.println("</script>");
                }
            }
        } catch (Exception e) {
            System.out.println("Erro ao recuperar dados!");
            System.out.println(e);
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
            TipoPagamento tp = new TipoPagamento();
            if (!request.getParameter("idtipo_pagamento").isEmpty()) {
                tp.setIdtipo_pagamento(Integer.parseInt(request.getParameter("idtipo_pagamento")));
            }
            tp.setNome(request.getParameter("nome"));
            TipoPagamentoDAO tpDAO = new TipoPagamentoDAO();
            if (tpDAO.gravar(tp)) {
                mensagem = "Tipo Pagamento gravado com sucesso!";
            } else {
                mensagem = "Erro ao gravar Tipo Pagamento!";
            }
        } catch (Exception e) {
            mensagem = "Erro ao gravar Tipo Pagamento!";
            System.out.println("Erro ao Gravar Tipo Pagamento: " + e.getMessage());
        }
        PrintWriter out = response.getWriter();
        out.println("<script type='text/javascript'>");
        out.println("alert('"+mensagem+"');");
        out.println("location.href='listar_tipoPagamento.jsp';");
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
