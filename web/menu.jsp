<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    /*HttpSession sessao = request.getSession();
    if (sessao.getAttribute("usuario") == null) {
        response.sendRedirect("login.jsp");
    }*/
%>
<header>
    <nav class="navbar navbar-expand-lg navbar-dark fixed-top bg-white">
        <div class="container-fluid">
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation" style="background-color: rgb(10,186,181);">
                <span class="navbar-toggler-icon" style="background-color: rgb(10,186,181);"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarCollapse">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="index.jsp">Home <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="listar_perfil.jsp">Perfil</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="listar_menu.jsp">Menus</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="listar_usuario.jsp">Usuário</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="listar_cliente.jsp">Cliente</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="listar_produto.jsp">Produto</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="listar_fornecedor.jsp">Fornecedor</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="listar_vendas.jsp">Vendas</a>
                    </li>
                    <li>
                        <a class="nav-link" href="#">
                            <ion-icon name="person-circle-outline"></ion-icon>
                        </a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
</header>

<link rel="stylesheet" href="estilo/menu.css"/>
