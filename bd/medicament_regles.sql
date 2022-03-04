-- MySQL dump 10.13  Distrib 8.0.25, for Win64 (x86_64)
--
-- Host: localhost    Database: medicament
-- ------------------------------------------------------
-- Server version	8.0.25

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
-- Table structure for table `regles`
--

DROP TABLE IF EXISTS `regles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `regles` (
  `id_R` int NOT NULL AUTO_INCREMENT,
  `nom_medi` varchar(45) NOT NULL,
  `type_bilan` varchar(45) NOT NULL,
  `min` int NOT NULL,
  `max` int NOT NULL,
  `resultat` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_R`,`nom_medi`),
  KEY `nom_medi` (`nom_medi`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `regles`
--

LOCK TABLES `regles` WRITE;
/*!40000 ALTER TABLE `regles` DISABLE KEYS */;
INSERT INTO `regles` VALUES (2,'Cisplatine','Clairance rénale',0,30,' la cisplatine est contre-indiquée '),(4,'Cisplatine','Clairance rénale',61,1000,'la dose complete de cisplatine'),(6,'Acide zolidronique','Clairance rénale',0,30,'l\'acide zolidronique est contre-indique'),(8,'Acide zolidronique','Clairance rénale',60,1000,'la dose complète d \'acide zolidronique'),(9,'Acide zolidronique','Clairance rénale',31,40,'3 mg d\'acide zolidronique'),(10,'Acide zolidronique','Clairance rénale',41,50,'3.3 mg d\'acide zolidronique'),(11,'Acide zolidronique','Clairance rénale',51,59,'3.5 mg d\'acide zolidronique'),(12,'Cisplatine','Clairance rénale',31,60,'50 % de la dose complete de cisplatine '),(13,'Capecitabine','Bilirubine',60,1000,'la capecitabine est contre-indiquée'),(14,'Capecitabine','Bilirubine',0,59,'la dose complète de capecitabine 5'),(15,'Capecitabine','Tgo/Tgp',55,1000,'la capecitabine est contre-indiquée'),(16,'Capecitabine','Tgo/Tgp',0,54,'on administre la dose complete'),(17,'Capecitabine','Clairance rénale',31,49,'on administre 25% de la dose complète '),(18,'Capecitabine','Clairance rénale',60,1000,'la dose complète de capecitabine'),(19,'Capecitabine','Clairance rénale',0,30,'la capecitabine est contre-indiquée');
/*!40000 ALTER TABLE `regles` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-06-29 14:30:29
