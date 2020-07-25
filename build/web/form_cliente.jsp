<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MB Fashion - Cadastrar Cliente</title>
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
                    <h1 class="display-5 text-center">Cadastrar Cliente</h1>
                    <form action="gerenciar_cliente.do" method="POST">
                        <input type="hidden" name="idcliente" id="idcliente" value="${cli.idCliente}"/>
                        <div class="form-row">
                            <div class="form-group col-md-6">
                                <label for="nome">Nome</label>
                                <input type="text" name="nome" class="form-control" id="nome" value="${cli.nome}" required="">
                            </div>
                            <div class="form-group col-md-6">
                                <label for="email">Email</label>
                                <input type="email" name="email" class="form-control" id="email" value="${cli.email}" required="">
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="form-group col-md-5">
                                <label for="cpf">CPF</label>
                                <input type="text" name="cpf" class="form-control" id="cpf" value="${cli.cpf}" required="">
                            </div>
                            <div class="form-group col-md-4">
                                <label for="rg">RG</label>
                                <input type="text" name="rg" class="form-control" id="rg" value="${cli.rg}" required="">
                            </div>
                            <div class="form-group col-md-3">
                                <label for="data_nasc">Data de Nascimento</label>
                                <input type="date" name="data_nasc" class="form-control" id="data_nasc" value="${cli.data_nasc}" required="">
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="form-group col-md-4">
                                <label for="Sexo">Gênero</label>
                                <select id="sexo" class="form-control">
                                    <option selected>Selecionar...</option>
                                    <option value="Feminino">Feminino</option>
                                    <option value="Masculino">Masculino</option>
                                </select>
                            </div>
                            <div class="form-group col-md-4">
                                <label for="Sexo">Fidelidade</label>
                                <select id="sexo" class="form-control">
                                    <option selected>Selecionar...</option>
                                    <option value="Sim">Sim</option>
                                    <option value="Não">Não</option>
                                </select>
                            </div>
                            <div class="form-group col-md-4">
                                <label for="Sexo">Promoção</label>
                                <select id="sexo" class="form-control">
                                    <option selected>Selecionar...</option>
                                    <option value="Sim">Sim</option>
                                    <option value="Não">Não</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="form-group col-md-6">
                                <label for="telefone">Telefone</label>
                                <input type="text" name="telefone" class="form-control" id="telefone" value="${cli.telefone}" required="">
                            </div>
                            <div class="form-group col-md-6">
                                <label for="cliente_desde">Cliente Desde</label>
                                <input type="date" name="cliente_desde" class="form-control" id="cliente_desde" value="${cli.cliente_desde}" required="">
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="form-group col-md-2">
                                <label for="cep">CEP</label>
                                <input type="text" name="cep" class="form-control" id="cep" value="${cli.cep}" required="">
                            </div>
                            <div class="form-group col-md-9">
                                <label for="rg">Endereço</label>
                                <input type="text" name="endereco" class="form-control" id="endereco" value="${cli.endereco}" required="">
                            </div>
                            <div class="form-group col-md-1">
                                <label for="numero">Número</label>
                                <input type="text" name="numero" class="form-control" id="numero" value="${cli.numero}" required="">
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="form-group col-md-3">
                                <label for="complemento">Complemento</label>
                                <input type="text" name="complemento" class="form-control" id="complemento" value="${cli.complemento}" required="">
                            </div>
                            <div class="form-group col-md-3">
                                <label for="bairro">Bairro</label>
                                <input type="text" name="bairro" class="form-control" id="bairro" value="${cli.bairro}" required="">
                            </div>
                            <div class="form-group col-md-3">
                                <label for="cidade">Cidade</label>
                                <input type="text" name="cidade" class="form-control" id="cidade" value="${cli.cidade}" required="">
                            </div>
                            <div class="form-group col-md-3">
                                <label for="uf">UF</label>
                                <input type="text" name="uf" class="form-control" id="uf" value="${cli.uf}" required="">
                            </div>
                        </div>
                        <button class="btn btn-info">Gravar</button>
                        <a href="listar_cliente.jsp" class="btn btn-danger">Voltar</a>
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