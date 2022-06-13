# SQL-Front 5.1  (Build 4.16)

/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE */;
/*!40101 SET SQL_MODE='NO_ZERO_IN_DATE,NO_ZERO_DATE,NO_ENGINE_SUBSTITUTION' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES */;
/*!40103 SET SQL_NOTES='ON' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS */;
/*!40014 SET FOREIGN_KEY_CHECKS=0 */;


# Host: localhost    Database: petlife
# ------------------------------------------------------
# Server version 5.5.5-10.4.24-MariaDB

DROP DATABASE IF EXISTS `petlife`;
CREATE DATABASE `petlife` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `petlife`;

#
# Source for table animal
#

DROP TABLE IF EXISTS `animal`;
CREATE TABLE `animal` (
  `idanimal` int(11) NOT NULL AUTO_INCREMENT,
  `tipoespecie_idtipoespecie` int(11) DEFAULT NULL,
  `dat_cadastro` datetime DEFAULT NULL,
  `nome` varchar(20) DEFAULT NULL,
  `porte` varchar(10) DEFAULT NULL,
  `sexo` varchar(1) DEFAULT NULL,
  `temperamento` varchar(20) DEFAULT NULL,
  `observacao` text DEFAULT NULL,
  PRIMARY KEY (`idanimal`),
  KEY `tipoespecie_idtipoespecie` (`tipoespecie_idtipoespecie`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Dumping data for table animal
#

LOCK TABLES `animal` WRITE;
/*!40000 ALTER TABLE `animal` DISABLE KEYS */;
/*!40000 ALTER TABLE `animal` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table animal_has_empresa
#

DROP TABLE IF EXISTS `animal_has_empresa`;
CREATE TABLE `animal_has_empresa` (
  `id_animal_has_empresa` int(11) NOT NULL AUTO_INCREMENT,
  `animal_idanimal` int(11) DEFAULT NULL,
  `empresa_idempresa` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_animal_has_empresa`),
  KEY `animal_idanimal` (`animal_idanimal`),
  KEY `empresa_idempresa` (`empresa_idempresa`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Dumping data for table animal_has_empresa
#

LOCK TABLES `animal_has_empresa` WRITE;
/*!40000 ALTER TABLE `animal_has_empresa` DISABLE KEYS */;
/*!40000 ALTER TABLE `animal_has_empresa` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table arquivo
#

DROP TABLE IF EXISTS `arquivo`;
CREATE TABLE `arquivo` (
  `idarquivo` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`idarquivo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Dumping data for table arquivo
#

LOCK TABLES `arquivo` WRITE;
/*!40000 ALTER TABLE `arquivo` DISABLE KEYS */;
/*!40000 ALTER TABLE `arquivo` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table arquivo_has_animal
#

DROP TABLE IF EXISTS `arquivo_has_animal`;
CREATE TABLE `arquivo_has_animal` (
  `id_arquivo_has_animal` int(11) NOT NULL AUTO_INCREMENT,
  `arquivo_idarquivo` int(11) DEFAULT NULL,
  `animal_idanimal` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_arquivo_has_animal`),
  KEY `arquivo_idarquivo` (`arquivo_idarquivo`),
  KEY `animal_idanimal` (`animal_idanimal`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Dumping data for table arquivo_has_animal
#

LOCK TABLES `arquivo_has_animal` WRITE;
/*!40000 ALTER TABLE `arquivo_has_animal` DISABLE KEYS */;
/*!40000 ALTER TABLE `arquivo_has_animal` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table arquivo_has_empresa
#

DROP TABLE IF EXISTS `arquivo_has_empresa`;
CREATE TABLE `arquivo_has_empresa` (
  `id_animal_has_empresa` int(11) NOT NULL AUTO_INCREMENT,
  `arquivo_idarquivo` int(11) DEFAULT NULL,
  `empresa_idempresa` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_animal_has_empresa`),
  KEY `arquivo_idarquivo` (`arquivo_idarquivo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Dumping data for table arquivo_has_empresa
#

LOCK TABLES `arquivo_has_empresa` WRITE;
/*!40000 ALTER TABLE `arquivo_has_empresa` DISABLE KEYS */;
/*!40000 ALTER TABLE `arquivo_has_empresa` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table doacao
#

DROP TABLE IF EXISTS `doacao`;
CREATE TABLE `doacao` (
  `id_doacao` int(11) NOT NULL AUTO_INCREMENT,
  `id_usuario` int(11) DEFAULT NULL,
  `idempresa` int(11) DEFAULT NULL,
  `idanimal` int(11) DEFAULT NULL,
  `doado` int(11) DEFAULT NULL,
  `data_doacao` datetime DEFAULT NULL,
  PRIMARY KEY (`id_doacao`),
  KEY `idempresa` (`idempresa`),
  KEY `idanimal` (`idanimal`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Dumping data for table doacao
#

LOCK TABLES `doacao` WRITE;
/*!40000 ALTER TABLE `doacao` DISABLE KEYS */;
/*!40000 ALTER TABLE `doacao` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table empresa
#

DROP TABLE IF EXISTS `empresa`;
CREATE TABLE `empresa` (
  `idempresa` int(11) NOT NULL AUTO_INCREMENT,
  `endereco_idendereco` int(11) DEFAULT NULL,
  `ativo` int(11) DEFAULT NULL,
  `nome` varchar(45) NOT NULL DEFAULT '',
  `natureza` varchar(45) NOT NULL DEFAULT '',
  `cnpj` bigint(14) DEFAULT NULL,
  `responsavel` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `senha` varchar(65) DEFAULT NULL,
  PRIMARY KEY (`idempresa`),
  KEY `endereco_idendereco` (`endereco_idendereco`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Dumping data for table empresa
#

LOCK TABLES `empresa` WRITE;
/*!40000 ALTER TABLE `empresa` DISABLE KEYS */;
/*!40000 ALTER TABLE `empresa` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table endereco
#

DROP TABLE IF EXISTS `endereco`;
CREATE TABLE `endereco` (
  `idendereco` int(11) NOT NULL AUTO_INCREMENT,
  `logradouro` varchar(30) NOT NULL DEFAULT '',
  `nome` varchar(60) NOT NULL DEFAULT '',
  `numero` int(11) NOT NULL DEFAULT 0,
  `bairro` varchar(30) NOT NULL DEFAULT '',
  `cidade` varchar(30) NOT NULL DEFAULT '',
  `uf` varchar(2) NOT NULL DEFAULT '',
  `cep` varchar(10) NOT NULL DEFAULT '',
  `referencia` text DEFAULT NULL,
  PRIMARY KEY (`idendereco`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Dumping data for table endereco
#

LOCK TABLES `endereco` WRITE;
/*!40000 ALTER TABLE `endereco` DISABLE KEYS */;
/*!40000 ALTER TABLE `endereco` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table permissao
#

DROP TABLE IF EXISTS `permissao`;
CREATE TABLE `permissao` (
  `idpermissao` int(11) NOT NULL AUTO_INCREMENT,
  `permissao` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`idpermissao`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Dumping data for table permissao
#

LOCK TABLES `permissao` WRITE;
/*!40000 ALTER TABLE `permissao` DISABLE KEYS */;
/*!40000 ALTER TABLE `permissao` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table tipoespecie
#

DROP TABLE IF EXISTS `tipoespecie`;
CREATE TABLE `tipoespecie` (
  `idtipoespecie` int(11) NOT NULL AUTO_INCREMENT,
  `especie` varchar(45) DEFAULT NULL,
  `raca` varchar(45) DEFAULT NULL,
  `descricao` mediumtext DEFAULT NULL,
  PRIMARY KEY (`idtipoespecie`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Dumping data for table tipoespecie
#

LOCK TABLES `tipoespecie` WRITE;
/*!40000 ALTER TABLE `tipoespecie` DISABLE KEYS */;
/*!40000 ALTER TABLE `tipoespecie` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table usuario
#

DROP TABLE IF EXISTS `usuario`;
CREATE TABLE `usuario` (
  `id_usuario` int(11) NOT NULL AUTO_INCREMENT,
  `endereco_idendereco` int(11) NOT NULL DEFAULT 0,
  `arquivo_idarquivo` int(11) NOT NULL DEFAULT 0,
  `ativo` int(11) NOT NULL DEFAULT 0,
  `cpf` int(11) NOT NULL DEFAULT 0,
  `data_cadastro` datetime DEFAULT NULL,
  `nome` varchar(50) NOT NULL DEFAULT '',
  `email` varchar(100) NOT NULL DEFAULT '',
  `senha` varchar(65) NOT NULL DEFAULT '',
  `telefone` bigint(14) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id_usuario`),
  KEY `usuario_ibfk_1` (`endereco_idendereco`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Dumping data for table usuario
#

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table vacina
#

DROP TABLE IF EXISTS `vacina`;
CREATE TABLE `vacina` (
  `idvacina` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) DEFAULT NULL,
  `prazo` date DEFAULT NULL,
  PRIMARY KEY (`idvacina`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Dumping data for table vacina
#

LOCK TABLES `vacina` WRITE;
/*!40000 ALTER TABLE `vacina` DISABLE KEYS */;
/*!40000 ALTER TABLE `vacina` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table vacina_has_animal
#

DROP TABLE IF EXISTS `vacina_has_animal`;
CREATE TABLE `vacina_has_animal` (
  `id_vacina_has_animal` int(11) NOT NULL AUTO_INCREMENT,
  `vacina_idvacina` int(11) DEFAULT NULL,
  `animal_idanimal` int(11) DEFAULT NULL,
  `data` datetime DEFAULT NULL,
  PRIMARY KEY (`id_vacina_has_animal`),
  KEY `vacina_idvacina` (`vacina_idvacina`),
  KEY `animal_idanimal` (`animal_idanimal`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Dumping data for table vacina_has_animal
#

LOCK TABLES `vacina_has_animal` WRITE;
/*!40000 ALTER TABLE `vacina_has_animal` DISABLE KEYS */;
/*!40000 ALTER TABLE `vacina_has_animal` ENABLE KEYS */;
UNLOCK TABLES;

#
#  Foreign keys for table animal
#

ALTER TABLE `animal`
ADD CONSTRAINT `animal_ibfk_1` FOREIGN KEY (`tipoespecie_idtipoespecie`) REFERENCES `tipoespecie` (`idtipoespecie`);

#
#  Foreign keys for table animal_has_empresa
#

ALTER TABLE `animal_has_empresa`
ADD CONSTRAINT `animal_has_empresa_ibfk_1` FOREIGN KEY (`animal_idanimal`) REFERENCES `animal` (`idanimal`),
ADD CONSTRAINT `animal_has_empresa_ibfk_2` FOREIGN KEY (`empresa_idempresa`) REFERENCES `empresa` (`idempresa`);

#
#  Foreign keys for table arquivo_has_animal
#

ALTER TABLE `arquivo_has_animal`
ADD CONSTRAINT `arquivo_has_animal_ibfk_1` FOREIGN KEY (`arquivo_idarquivo`) REFERENCES `arquivo` (`idarquivo`),
ADD CONSTRAINT `arquivo_has_animal_ibfk_2` FOREIGN KEY (`animal_idanimal`) REFERENCES `animal` (`idanimal`);

#
#  Foreign keys for table arquivo_has_empresa
#

ALTER TABLE `arquivo_has_empresa`
ADD CONSTRAINT `arquivo_has_empresa_ibfk_1` FOREIGN KEY (`arquivo_idarquivo`) REFERENCES `arquivo` (`idarquivo`);

#
#  Foreign keys for table doacao
#

ALTER TABLE `doacao`
ADD CONSTRAINT `doacao_ibfk_1` FOREIGN KEY (`id_doacao`) REFERENCES `usuario` (`id_usuario`),
ADD CONSTRAINT `doacao_ibfk_2` FOREIGN KEY (`idempresa`) REFERENCES `empresa` (`idempresa`),
ADD CONSTRAINT `doacao_ibfk_3` FOREIGN KEY (`idanimal`) REFERENCES `animal` (`idanimal`);

#
#  Foreign keys for table empresa
#

ALTER TABLE `empresa`
ADD CONSTRAINT `empresa_ibfk_1` FOREIGN KEY (`endereco_idendereco`) REFERENCES `endereco` (`idendereco`);

#
#  Foreign keys for table usuario
#

ALTER TABLE `usuario`
ADD CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`endereco_idendereco`) REFERENCES `endereco` (`idendereco`);

#
#  Foreign keys for table vacina_has_animal
#

ALTER TABLE `vacina_has_animal`
ADD CONSTRAINT `vacina_has_animal_ibfk_1` FOREIGN KEY (`vacina_idvacina`) REFERENCES `vacina` (`idvacina`),
ADD CONSTRAINT `vacina_has_animal_ibfk_2` FOREIGN KEY (`animal_idanimal`) REFERENCES `animal` (`idanimal`);


/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
