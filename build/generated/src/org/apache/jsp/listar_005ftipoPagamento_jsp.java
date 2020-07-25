package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class listar_005ftipoPagamento_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/menu.jsp");
    _jspx_dependants.add("/banner.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"pt-br\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>MB Fashion - Listar Tipo de Pagamento</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"estilo/layout.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"datatables/jquery.dataTables.min.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("<header>\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-dark fixed-top bg-white\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarCollapse\" aria-controls=\"navbarCollapse\" aria-expanded=\"false\" aria-label=\"Toggle navigation\" style=\"background-color: rgb(10,186,181);\">\n");
      out.write("                <span class=\"navbar-toggler-icon\" style=\"background-color: rgb(10,186,181);\"></span>\n");
      out.write("            </button>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarCollapse\">\n");
      out.write("                <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a class=\"nav-link\" href=\"index.jsp\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"listar_perfil.jsp\">Perfil</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"listar_menu.jsp\">Menus</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"listar_usuario.jsp\">Usuário</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"listar_cliente.jsp\">Cliente</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"listar_produto.jsp\">Produto</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"listar_fornecedor.jsp\">Fornecedor</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"listar_vendas\">Vendas</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"nav-link\" href=\"#\">\n");
      out.write("                            <ion-icon name=\"person-circle-outline\"></ion-icon>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"estilo/menu.css\"/>\n");
      out.write("\n");
      out.write("        <main role=\"main\"> \n");
      out.write("            ");
      out.write("<div class=\"container\">\r\n");
      out.write("    <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("        <ol class=\"carousel-indicators\">\r\n");
      out.write("            <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("            <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\r\n");
      out.write("        </ol>\r\n");
      out.write("        <div class=\"carousel-inner\">\r\n");
      out.write("            <div class=\"carousel-item active\">\r\n");
      out.write("                <img class=\"first-slide img-fluid\" src=\"imagem/banner 1.jpeg\" alt=\"Primeiro conteúdo\" width=\"100%\" height=\"200px\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"carousel-item\">\r\n");
      out.write("                <img class=\"first-slide img-fluid\" src=\"imagem/banner 2.jpeg\" alt=\"Segundo conteúdo\" width=\"100%\" height=\"200px\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <a class=\"carousel-control-prev\" href=\"#myCarousel\" role=\"button\" data-slide=\"prev\">\r\n");
      out.write("            <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("            <span class=\"sr-only\">Previous</span>\r\n");
      out.write("        </a>\r\n");
      out.write("        <a class=\"carousel-control-next\" href=\"#myCarousel\" role=\"button\" data-slide=\"next\">\r\n");
      out.write("            <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("            <span class=\"sr-only\">Next</span>\r\n");
      out.write("        </a>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>");
      out.write("\n");
      out.write("            <div class=\"jumbotron jumbotron-fluid formulario\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <h1 class=\"display-5 text-center\">Listar Tipo de Pagamento</h1>\n");
      out.write("                    <a href=\"form_tipoPagamento.jsp\" class=\"btn btn-info\">Novo Cadastro</a><br><br>\n");
      out.write("                    <table class=\"table table-hover table-striped\" id=\"listarTipoPagamento\">\n");
      out.write("                        <thead class=\"table-info\">\n");
      out.write("                            <tr>\n");
      out.write("                                <th scope=\"col\">Id</th>\n");
      out.write("                                <th scope=\"col\">Nome</th>\n");
      out.write("                                <th scope=\"col\">Opções</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tfoot class=\"table-info\">\n");
      out.write("                            <tr>\n");
      out.write("                                <th scope=\"col\">Id</th>\n");
      out.write("                                <th scope=\"col\">Nome</th>\n");
      out.write("                                <th scope=\"col\">Opções</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </tfoot>\n");
      out.write("                        ");
      persistencia.TipoPagamentoDAO tpDAO = null;
      synchronized (_jspx_page_context) {
        tpDAO = (persistencia.TipoPagamentoDAO) _jspx_page_context.getAttribute("tpDAO", PageContext.PAGE_SCOPE);
        if (tpDAO == null){
          tpDAO = new persistencia.TipoPagamentoDAO();
          _jspx_page_context.setAttribute("tpDAO", tpDAO, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("                        <tbody>\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </main>\n");
      out.write("        <script type=\"text/javascript\" src=\"datatables/jquery.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"datatables/jquery.dataTables.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://unpkg.com/ionicons@5.0.0/dist/ionicons.js\"></script>\n");
      out.write("        <script src=\"https://unpkg.com/scrollreveal\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function(){\n");
      out.write("                $(\"#listarTipoPagamento\").dataTable({\n");
      out.write("                    \"bJQueryUI\":true,\n");
      out.write("                    \"oLanguage\":{\n");
      out.write("                        \"sProcessing\":\"Processando...\",\n");
      out.write("                        \"sLengthMenu\":\"Motrar _MENU_ registros\",\n");
      out.write("                        \"sZeroRecords\":\"Não foram encontrados resultados\",\n");
      out.write("                        \"sInfo\":\"Mostrar de _START_ até _END_ de _TOTAL_ registros\",\n");
      out.write("                        \"sInfoEmpty\":\"Mostrando de 0 até 0 de 0 registros\",\n");
      out.write("                        \"sInfoFiltered\":\"\",\n");
      out.write("                        \"sInfoPostFix\":\"\",\n");
      out.write("                        \"sSearch\":\"Pesquisar\",\n");
      out.write("                        \"sUrl\":\"\",\n");
      out.write("                        \"oPaginate\":{\n");
      out.write("                            \"sFirst\":\"Primeiro\",\n");
      out.write("                            \"sPrevious\":\"Anterior\",\n");
      out.write("                            \"sNext\":\"proximo\",\n");
      out.write("                            \"sLast\":\"Último\"\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                })\n");
      out.write("            })\n");
      out.write("        </script>\n");
      out.write("        <script>\n");
      out.write("            function confirmarExclusao(idTipo_Pagamento){\n");
      out.write("                if (confirm('Deseja realmente excluir este Tipo pagamento?')) {\n");
      out.write("                    location.href=\"./gerenciar_tipopagamento.do?acao=excluir&idtipo_pagamento=\"+idTipo_Pagamento;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("tp");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tpDAO.lista}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <tr>\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tp.idTipo_Pagamento}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tp.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <td>\n");
          out.write("                                        <a href=\"./gerenciar_tipopagamento.do?acao=alterar&idtipo_pagamento=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tp.idTipo_Pagamento}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn btn-info\">\n");
          out.write("                                            <ion-icon name=\"pencil-sharp\"></ion-icon>\n");
          out.write("                                        </a>\n");
          out.write("                                        <a href=\"javascript:confirmarExclusao(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tp.idTipo_Pagamento}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(");\">\n");
          out.write("                                            <button class=\"btn btn-danger\">\n");
          out.write("                                                <ion-icon name=\"trash-sharp\"></ion-icon>\n");
          out.write("                                            </button>\n");
          out.write("                                        </a>\n");
          out.write("                                    </td>\n");
          out.write("                                </tr>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
