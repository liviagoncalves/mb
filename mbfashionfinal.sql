-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 24-Jul-2020 às 22:56
-- Versão do servidor: 10.4.11-MariaDB
-- versão do PHP: 7.4.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `mbfashionfinal`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `categoria`
--

CREATE TABLE `categoria` (
  `idcategoria` int(11) NOT NULL,
  `nome` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `categoria`
--

INSERT INTO `categoria` (`idcategoria`, `nome`) VALUES
(1, 'Vestido'),
(2, 'Jeans'),
(3, 'Infantil ');

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE `cliente` (
  `idcliente` int(11) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `cpf` varchar(14) NOT NULL,
  `rg` varchar(20) DEFAULT NULL,
  `data_nasc` date NOT NULL,
  `sexo` char(9) NOT NULL,
  `telefone` varchar(14) DEFAULT NULL,
  `cep` varchar(9) DEFAULT NULL,
  `endereco` varchar(100) DEFAULT NULL,
  `numero` int(11) DEFAULT NULL,
  `complemento` varchar(45) DEFAULT NULL,
  `bairro` varchar(45) DEFAULT NULL,
  `cidade` varchar(45) DEFAULT NULL,
  `uf` varchar(45) DEFAULT NULL,
  `cliente_desde` date NOT NULL,
  `fidelidade` char(3) NOT NULL,
  `promocao` char(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`idcliente`, `nome`, `email`, `cpf`, `rg`, `data_nasc`, `sexo`, `telefone`, `cep`, `endereco`, `numero`, `complemento`, `bairro`, `cidade`, `uf`, `cliente_desde`, `fidelidade`, `promocao`) VALUES
(1, 'livia', 'livia@gmail.com', '350.478.897-89', '2185481', '1986-09-25', 'Feminino', '(61)98878-4725', '71995-310', 'Sha conjunto 5 lote', 42, NULL, 'Setor Habitacional Arniqueira (Águas Claras)', 'Brasilia', 'DF', '2018-09-25', 'Sim', 'Sim'),
(3, 'manuela', 'manuella@gmail.com', '300.457.459-07', '1789875', '2000-02-01', 'Feminino', '(61)99999-9999', '11.060-00', 'Avenida Ana Costa', 42, 'b', 'Gonzaga', 'Santos', 'SP', '2020-01-25', 'Sim', 'Sim'),
(4, 'Maria Cecilia', 'mcecilia@gmail.com', '456.456.741-89', '2175489', '1987-08-10', 'Feminino', '(61)9 9847-878', '72789-785', 'Qnm 03 conjunto i lote', 12, 'frente', 'Ceilândia Sul', 'Brasília', 'Distrito Federal (DF)', '2000-10-02', 'Sim', 'Sim');

-- --------------------------------------------------------

--
-- Estrutura da tabela `cor`
--

CREATE TABLE `cor` (
  `idcor` int(11) NOT NULL,
  `nome` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `cor`
--

INSERT INTO `cor` (`idcor`, `nome`) VALUES
(1, 'Azul'),
(2, 'Lilas'),
(4, 'Amarelo');

-- --------------------------------------------------------

--
-- Estrutura da tabela `fornecedor`
--

CREATE TABLE `fornecedor` (
  `idfornecedor` int(11) NOT NULL,
  `razao_social` varchar(100) NOT NULL,
  `cnpj` varchar(18) NOT NULL,
  `inscricao_estadual` varchar(45) DEFAULT NULL,
  `telefone` varchar(14) NOT NULL,
  `cep` varchar(9) DEFAULT NULL,
  `endereco` varchar(100) DEFAULT NULL,
  `numero` int(11) DEFAULT NULL,
  `complemento` varchar(45) DEFAULT NULL,
  `bairro` varchar(45) DEFAULT NULL,
  `cidade` varchar(45) DEFAULT NULL,
  `uf` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `fornecedor`
--

INSERT INTO `fornecedor` (`idfornecedor`, `razao_social`, `cnpj`, `inscricao_estadual`, `telefone`, `cep`, `endereco`, `numero`, `complemento`, `bairro`, `cidade`, `uf`) VALUES
(1, 'MS roupas', '47.508.411/0225-59', '48415484124', '(61)3258-5878', '72789-785', 'qs 11 conjunto r lote', 32, 'frente ao colégio', 'Águas Claras', 'Brasília', 'DF'),
(3, 'Marisa', '12.518.587/0001-89', '1458456168', '(61)3258-7895', '71995310', 'qs 11 conjunto r lote', 12, 'frente ao colégio', 'Areal', 'Brasília', 'Distrito Federal (DF)');

-- --------------------------------------------------------

--
-- Estrutura da tabela `marca`
--

CREATE TABLE `marca` (
  `idmarca` int(11) NOT NULL,
  `nome` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `marca`
--

INSERT INTO `marca` (`idmarca`, `nome`) VALUES
(1, 'Gucci'),
(3, 'Channel'),
(5, 'Laise');

-- --------------------------------------------------------

--
-- Estrutura da tabela `menu`
--

CREATE TABLE `menu` (
  `idmenu` int(11) NOT NULL,
  `nome` varchar(45) NOT NULL,
  `link` varchar(100) NOT NULL,
  `icone` varchar(45) DEFAULT NULL,
  `exibir` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `menu_perfil`
--

CREATE TABLE `menu_perfil` (
  `dmenu` int(11) NOT NULL,
  `idperfil` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `perfil`
--

CREATE TABLE `perfil` (
  `idperfil` int(11) NOT NULL,
  `nome` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `perfil`
--

INSERT INTO `perfil` (`idperfil`, `nome`) VALUES
(1, 'Gerente'),
(2, 'Vendedor'),
(3, 'Caixa'),
(6, 'Adminnistrador'),
(10, 'teste');

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto`
--

CREATE TABLE `produto` (
  `idproduto` int(11) NOT NULL,
  `nome` varchar(45) NOT NULL,
  `vlr_compra` double NOT NULL,
  `vlr_venda` double NOT NULL,
  `estoque` int(11) NOT NULL,
  `idfornecedor` int(11) NOT NULL,
  `idcategoria` int(11) NOT NULL,
  `idcor` int(11) NOT NULL,
  `idtamanho` int(11) NOT NULL,
  `idmarca` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tamanho`
--

CREATE TABLE `tamanho` (
  `idtamanho` int(11) NOT NULL,
  `nome` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `tamanho`
--

INSERT INTO `tamanho` (`idtamanho`, `nome`) VALUES
(1, 'pp'),
(2, 'p'),
(4, 'M');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tipo_pagamento`
--

CREATE TABLE `tipo_pagamento` (
  `idtipo_pagamento` int(11) NOT NULL,
  `nome` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `tipo_pagamento`
--

INSERT INTO `tipo_pagamento` (`idtipo_pagamento`, `nome`) VALUES
(1, 'Dinheir'),
(2, 'Débito'),
(3, 'visa'),
(4, 'credito'),
(5, 'Master'),
(6, 'voucher');

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE `usuario` (
  `idusuario` int(11) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `login` varchar(45) NOT NULL,
  `senha` varchar(45) NOT NULL,
  `status` int(11) NOT NULL,
  `idperfil` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`idusuario`, `nome`, `login`, `senha`, `status`, `idperfil`) VALUES
(1, 'Admin', 'admin', '1', 1, 6),
(2, 'LIVIA GONCALVES MORAIS', 'livia', '1', 1, 1),
(3, 'hugu', 'jhjukhui', '1', 2, 2),
(4, 'Manuella', 'manu', '1', 2, 3),
(5, 'Wanessa', 'wanessa.diniz', '1', 2, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `vendas`
--

CREATE TABLE `vendas` (
  `idvendas` int(11) NOT NULL,
  `data_venda` date NOT NULL,
  `qtde` int(11) NOT NULL,
  `vlr_produto` double NOT NULL,
  `desconto` double DEFAULT NULL,
  `total_venda` double NOT NULL,
  `parcela` int(11) DEFAULT NULL,
  `vencimento` date NOT NULL,
  `vlr_recebido` double NOT NULL,
  `juros` double DEFAULT NULL,
  `vlr_restante` double NOT NULL,
  `idusuario` int(11) NOT NULL,
  `idcliente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `vendas_produto`
--

CREATE TABLE `vendas_produto` (
  `idvendas` int(11) NOT NULL,
  `idproduto` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `vendas_tipopagamento`
--

CREATE TABLE `vendas_tipopagamento` (
  `idvendas` int(11) NOT NULL,
  `idtipo_pagamento` int(11) NOT NULL,
  `valor` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`idcategoria`);

--
-- Índices para tabela `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`idcliente`);

--
-- Índices para tabela `cor`
--
ALTER TABLE `cor`
  ADD PRIMARY KEY (`idcor`);

--
-- Índices para tabela `fornecedor`
--
ALTER TABLE `fornecedor`
  ADD PRIMARY KEY (`idfornecedor`),
  ADD UNIQUE KEY `cnpj` (`cnpj`);

--
-- Índices para tabela `marca`
--
ALTER TABLE `marca`
  ADD PRIMARY KEY (`idmarca`);

--
-- Índices para tabela `menu`
--
ALTER TABLE `menu`
  ADD PRIMARY KEY (`idmenu`);

--
-- Índices para tabela `menu_perfil`
--
ALTER TABLE `menu_perfil`
  ADD PRIMARY KEY (`dmenu`,`idperfil`),
  ADD KEY `fk_menu_has_perfil_perfil1_idx` (`idperfil`),
  ADD KEY `fk_menu_has_perfil_menu_idx` (`dmenu`);

--
-- Índices para tabela `perfil`
--
ALTER TABLE `perfil`
  ADD PRIMARY KEY (`idperfil`);

--
-- Índices para tabela `produto`
--
ALTER TABLE `produto`
  ADD PRIMARY KEY (`idproduto`),
  ADD KEY `fk_produto_fornecedor1_idx` (`idfornecedor`),
  ADD KEY `fk_produto_categoria1_idx` (`idcategoria`),
  ADD KEY `fk_produto_cor1_idx` (`idcor`),
  ADD KEY `fk_produto_tamanho1_idx` (`idtamanho`),
  ADD KEY `fk_produto_marca1_idx` (`idmarca`);

--
-- Índices para tabela `tamanho`
--
ALTER TABLE `tamanho`
  ADD PRIMARY KEY (`idtamanho`);

--
-- Índices para tabela `tipo_pagamento`
--
ALTER TABLE `tipo_pagamento`
  ADD PRIMARY KEY (`idtipo_pagamento`);

--
-- Índices para tabela `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`idusuario`),
  ADD KEY `fk_usuario_perfil1_idx` (`idperfil`);

--
-- Índices para tabela `vendas`
--
ALTER TABLE `vendas`
  ADD PRIMARY KEY (`idvendas`),
  ADD KEY `fk_vendas_usuario1_idx` (`idusuario`),
  ADD KEY `fk_vendas_cliente1_idx` (`idcliente`);

--
-- Índices para tabela `vendas_produto`
--
ALTER TABLE `vendas_produto`
  ADD PRIMARY KEY (`idvendas`,`idproduto`),
  ADD KEY `fk_vendas_has_produto_vendas1_idx` (`idvendas`),
  ADD KEY `fk_vendas_has_produto_produto1_idx` (`idproduto`) USING BTREE;

--
-- Índices para tabela `vendas_tipopagamento`
--
ALTER TABLE `vendas_tipopagamento`
  ADD PRIMARY KEY (`idvendas`,`idtipo_pagamento`),
  ADD KEY `fk_vendas_has_tipo_pagamento_tipo_pagamento1_idx` (`idtipo_pagamento`),
  ADD KEY `fk_vendas_has_tipo_pagamento_vendas1_idx` (`idvendas`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `categoria`
--
ALTER TABLE `categoria`
  MODIFY `idcategoria` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de tabela `cliente`
--
ALTER TABLE `cliente`
  MODIFY `idcliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de tabela `cor`
--
ALTER TABLE `cor`
  MODIFY `idcor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de tabela `fornecedor`
--
ALTER TABLE `fornecedor`
  MODIFY `idfornecedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de tabela `marca`
--
ALTER TABLE `marca`
  MODIFY `idmarca` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de tabela `menu`
--
ALTER TABLE `menu`
  MODIFY `idmenu` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `perfil`
--
ALTER TABLE `perfil`
  MODIFY `idperfil` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de tabela `produto`
--
ALTER TABLE `produto`
  MODIFY `idproduto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `tamanho`
--
ALTER TABLE `tamanho`
  MODIFY `idtamanho` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de tabela `tipo_pagamento`
--
ALTER TABLE `tipo_pagamento`
  MODIFY `idtipo_pagamento` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de tabela `usuario`
--
ALTER TABLE `usuario`
  MODIFY `idusuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de tabela `vendas`
--
ALTER TABLE `vendas`
  MODIFY `idvendas` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `menu_perfil`
--
ALTER TABLE `menu_perfil`
  ADD CONSTRAINT `fk_menu_has_perfil_menu` FOREIGN KEY (`dmenu`) REFERENCES `menu` (`idmenu`) ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_menu_has_perfil_perfil1` FOREIGN KEY (`idperfil`) REFERENCES `perfil` (`idperfil`) ON UPDATE CASCADE;

--
-- Limitadores para a tabela `produto`
--
ALTER TABLE `produto`
  ADD CONSTRAINT `fk_produto_categoria1` FOREIGN KEY (`idcategoria`) REFERENCES `categoria` (`idcategoria`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_produto_cor1` FOREIGN KEY (`idcor`) REFERENCES `cor` (`idcor`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_produto_fornecedor1` FOREIGN KEY (`idfornecedor`) REFERENCES `fornecedor` (`idfornecedor`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_produto_marca1` FOREIGN KEY (`idmarca`) REFERENCES `marca` (`idmarca`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_produto_tamanho1` FOREIGN KEY (`idtamanho`) REFERENCES `tamanho` (`idtamanho`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `fk_usuario_perfil1` FOREIGN KEY (`idperfil`) REFERENCES `perfil` (`idperfil`) ON UPDATE CASCADE;

--
-- Limitadores para a tabela `vendas`
--
ALTER TABLE `vendas`
  ADD CONSTRAINT `fk_vendas_cliente1` FOREIGN KEY (`idcliente`) REFERENCES `cliente` (`idcliente`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_vendas_usuario1` FOREIGN KEY (`idusuario`) REFERENCES `usuario` (`idusuario`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `vendas_produto`
--
ALTER TABLE `vendas_produto`
  ADD CONSTRAINT `fk_vendas_has_produto_produto1` FOREIGN KEY (`idproduto`) REFERENCES `produto` (`idproduto`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_vendas_has_produto_vendas1` FOREIGN KEY (`idvendas`) REFERENCES `vendas` (`idvendas`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `vendas_tipopagamento`
--
ALTER TABLE `vendas_tipopagamento`
  ADD CONSTRAINT `fk_vendas_has_tipo_pagamento_tipo_pagamento1` FOREIGN KEY (`idtipo_pagamento`) REFERENCES `tipo_pagamento` (`idtipo_pagamento`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_vendas_has_tipo_pagamento_vendas1` FOREIGN KEY (`idvendas`) REFERENCES `vendas` (`idvendas`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
