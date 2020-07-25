<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MB Fashion - Cadastrar Fornecedor</title>
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css"/>
        <link rel="stylesheet" href="estilo/layout.css"/>
    </head>
    <body>
        <%@include file="menu.jsp"%>
        <main role="main">
            <%@include file="banner.jsp"%>
            <div class="jumbotron jumbotron-fluid formulario">
                <div class="container-fluid">
                    <h1 class="display-5 text-center">Cadastrar Fornecedor</h1>
                    <form action="gerenciar_fornecedor.do" method="POST">
                        <input type="hidden" name="idfornecedor" id="idfornecedor" value="${for.idFornecedor}"/>
                        <div class="form-row">
                            <div class="form-group col-md-6">
                                <label for="razao_social">Razão Social</label>
                                <input type="text" name="razao_social" class="form-control" id="razao_social" value="${for.razao_social}" required="">
                            </div>
                            <div class="form-group col-md-6">
                                <label for="cnpj">CNPJ</label>
                                <input type="cnpj" name="cnpj" class="form-control" id="cnpj" value="${for.cnpj}" required="">
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="form-group col-md-6">
                                <label for="inscricao_estadual">Inscricão Estadual</label>
                                <input type="text" name="inscricao_estadual" class="form-control" id="inscricao_estadual" value="${for.inscricao_estadual}" required="">
                            </div>
                            <div class="form-group col-md-6">
                                <label for="telefone">Telefone</label>
                                <input type="text" name="telefone" class="form-control" id="telefone" value="${for.telefone}" required="">
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="form-group col-md-2">
                                <label for="cep">CEP</label>
                                <input type="text" name="cep" class="form-control" id="cep" value="${for.cep}" required="">
                            </div>
                            <div class="form-group col-md-9">
                                <label for="rg">Endereço</label>
                                <input type="text" name="endereco" class="form-control" id="endereco" value="${for.endereco}" required="">
                            </div>
                            <div class="form-group col-md-1">
                                <label for="numero">Número</label>
                                <input type="text" name="numero" class="form-control" id="numero" value="${for.numero}" required="">
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="form-group col-md-3">
                                <label for="complemento">Complemento</label>
                                <input type="text" name="complemento" class="form-control" id="complemento" value="${for.complemento}" required="">
                            </div>
                            <div class="form-group col-md-3">
                                <label for="bairro">Bairro</label>
                                <input type="text" name="bairro" class="form-control" id="bairro" value="${for.bairro}" required="">
                            </div>
                            <div class="form-group col-md-3">
                                <label for="cidade">Cidade</label>
                                <input type="text" name="cidade" class="form-control" id="cidade" value="${for.cidade}" required="">
                            </div>
                            <div class="form-group col-md-3">
                                <label for="uf">UF</label>
                                <input type="text" name="uf" class="form-control" id="uf" value="${for.uf}" required="">
                            </div>
                        </div>
                        <button class="btn btn-info">Gravar</button>
                        <a href="listar_fornecedor.jsp" class="btn btn-danger">Voltar</a>
                    </form>
                </div>
            </div>
        </main>
        <script type="text/javascript" src="datatables/jquery.js"></script>
        <script type="text/javascript" src="datatables/jquery.dataTables.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
        <script src="bootstrap/js/bootstrap.min.js"></script>
        <script src="https://unpkg.com/ionicons@5.0.0/dist/ionicons.js"></script>
        <script src="https://unpkg.com/scrollreveal"></script>
    </body>
</html>