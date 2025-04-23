-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: closet_in_software
-- ------------------------------------------------------
-- Server version	8.0.34

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `id_cliente` int NOT NULL AUTO_INCREMENT,
  `nome_completo` varchar(170) COLLATE utf8mb3_unicode_ci NOT NULL,
  `CPF` int unsigned NOT NULL,
  `email` varchar(100) COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `genero` varchar(45) COLLATE utf8mb3_unicode_ci NOT NULL,
  `telefone` int unsigned NOT NULL,
  `data_de_nascimento` date NOT NULL,
  `fk_id_roupa` int NOT NULL,
  PRIMARY KEY (`id_cliente`),
  UNIQUE KEY `CPF` (`CPF`),
  KEY `fk_id_roupa` (`fk_id_roupa`),
  CONSTRAINT `cliente_ibfk_1` FOREIGN KEY (`fk_id_roupa`) REFERENCES `roupa` (`id_roupa`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (6,'Mariana Costa',555666000,'mariana@gmail.com','Feminino',88552211,'2006-09-23',2),(8,'Élida Souza',272132933,'elida.souza@gmail.com','Feminino',77878688,'2005-08-10',11),(9,'Clara Alice',777584788,'alice@gmail.com','Feminino',95454599,'2006-04-21',15);
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `funcionario`
--

DROP TABLE IF EXISTS `funcionario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `funcionario` (
  `id_funcionario` int NOT NULL AUTO_INCREMENT,
  `nome_completo` varchar(170) COLLATE utf8mb3_unicode_ci NOT NULL,
  `email` varchar(100) COLLATE utf8mb3_unicode_ci NOT NULL,
  `senha` varchar(20) COLLATE utf8mb3_unicode_ci NOT NULL,
  `funcao` varchar(45) COLLATE utf8mb3_unicode_ci NOT NULL,
  `CPF` int unsigned NOT NULL,
  `endereco_de_cracha` int unsigned NOT NULL,
  `salario` double unsigned DEFAULT NULL,
  `telefone` int unsigned NOT NULL,
  PRIMARY KEY (`id_funcionario`),
  UNIQUE KEY `CPF` (`CPF`),
  UNIQUE KEY `endereco_de_cracha` (`endereco_de_cracha`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcionario`
--

LOCK TABLES `funcionario` WRITE;
/*!40000 ALTER TABLE `funcionario` DISABLE KEYS */;
INSERT INTO `funcionario` VALUES (6,'Monick Évelyn','monick@gmail.com','moni123','Chefe',123123123,9090,9000,99887766),(12,'Vitória Ketillyn','vitoria@gmail.com','123vih','Chefe',121333777,9889,8000,77554545),(14,'Iuan Pablo','iuan@gmail.com','iuan123','Chefe',111229876,6655,8000,98779877),(15,'Maria Santos','maria.santos@gmail.com','mary123','Atendente',777666344,3366,3000,88457688),(16,'Angelo Medeiros','angelo@gmail.com','angelo123','Atendente',333676999,6755,3000,78776766),(17,'Rebeca Medeiros','rebeca@gmail.com','rebs123','Atendente',776558989,6754,3000,40006767),(18,'Marcia Oliveira','marca@gmail.com','marcia123','Atendente',767652252,7655,3000,67554443),(19,'Marcos Silva','marcos@gmail.com','marcos123','Atendente',574872556,9877,3000,77656532);
/*!40000 ALTER TABLE `funcionario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `funcionario_roupa`
--

DROP TABLE IF EXISTS `funcionario_roupa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `funcionario_roupa` (
  `fk_id_funcionario` int NOT NULL,
  `fk_id_roupa` int NOT NULL,
  KEY `fk_id_funcionario` (`fk_id_funcionario`),
  KEY `fk_id_roupa` (`fk_id_roupa`),
  CONSTRAINT `funcionario_roupa_ibfk_1` FOREIGN KEY (`fk_id_funcionario`) REFERENCES `funcionario` (`id_funcionario`),
  CONSTRAINT `funcionario_roupa_ibfk_2` FOREIGN KEY (`fk_id_roupa`) REFERENCES `roupa` (`id_roupa`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcionario_roupa`
--

LOCK TABLES `funcionario_roupa` WRITE;
/*!40000 ALTER TABLE `funcionario_roupa` DISABLE KEYS */;
/*!40000 ALTER TABLE `funcionario_roupa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roupa`
--

DROP TABLE IF EXISTS `roupa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `roupa` (
  `id_roupa` int NOT NULL AUTO_INCREMENT,
  `codigo_referencia` int unsigned NOT NULL,
  `preco_revenda` double unsigned NOT NULL,
  `preco_compra` double unsigned NOT NULL,
  `tamanho` varchar(10) COLLATE utf8mb3_unicode_ci NOT NULL,
  `tipo` varchar(45) COLLATE utf8mb3_unicode_ci NOT NULL,
  `marca` varchar(45) COLLATE utf8mb3_unicode_ci NOT NULL,
  `categoria_etaria` varchar(30) COLLATE utf8mb3_unicode_ci NOT NULL,
  `cor` varchar(45) COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `genero_da_roupa` varchar(10) COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `material` varchar(45) COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `quantidade_estoque` int NOT NULL,
  PRIMARY KEY (`id_roupa`),
  UNIQUE KEY `codigo_referencia` (`codigo_referencia`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roupa`
--

LOCK TABLES `roupa` WRITE;
/*!40000 ALTER TABLE `roupa` DISABLE KEYS */;
INSERT INTO `roupa` VALUES (2,1234,200,150,'PP','Calça','Gucci','Infantil','Rosa','Feminino','Algodão',30),(11,4321,50,40,'GG','Camisa','Adidas','Adulto','Preto','Masculino','Algodão',5),(13,4009,44,35,'M','Bermuda','Nike','Adulto','Preto','Masculino','Jeans',10),(15,8888,20,15,'P','Short','LL modas','Jovenil','Branco','Feminino','Jeans',5);
/*!40000 ALTER TABLE `roupa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'closet_in_software'
--

--
-- Dumping routines for database 'closet_in_software'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-12-03 22:30:07
