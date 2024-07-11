CREATE DATABASE  IF NOT EXISTS `movie_web` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `movie_web`;
-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: movie_web
-- ------------------------------------------------------
-- Server version	8.0.33

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
-- Table structure for table `peliculas`
--

DROP TABLE IF EXISTS `peliculas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `peliculas` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(120) DEFAULT NULL,
  `description` varchar(200) DEFAULT NULL,
  `genre` varchar(120) DEFAULT NULL,
  `rate` int DEFAULT NULL,
  `stars` int DEFAULT NULL,
  `yearOfRelease` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `peliculas`
--

LOCK TABLES `peliculas` WRITE;
/*!40000 ALTER TABLE `peliculas` DISABLE KEYS */;
INSERT INTO `peliculas` VALUES (1,'Avatar','TEST TEST TEST Description','Aventura',83,3,'2009-06-12'),(2,'Indiana Jones y los cazadores del arca perdida','En 1936, el arqueólogo y aventurero Indiana Jones es contratado por el gobierno de los EE.UU. para encontrar el Arca de la Alianza antes de que los nazis obtengan sus increíbles poderes.','Accion',99,5,'1981'),(3,'El Señor de los Anillos: La Comunidad del Anillo','Un humilde Hobbit de la Comarca y ocho compañeros emprenden un viaje para destruir el poderoso Anillo Único y salvar la Tierra Media del Señor Oscuro Sauron.','Aventura',100,5,'2001'),(4,'Piratas del Caribe: La maldición del Perla Negra','El herrero Will Turner se une al excéntrico pirata Capitán Jack Sparrow para salvar a su amada, la hija del gobernador, de los antiguos aliados piratas de Jack, que ahora son no muertos.','Aventura',80,4,'2003'),(5,'Pulp Fiction','Las vidas de dos sicarios, un boxeador, la esposa de un gánster y una pareja de ladrones de restaurante se entrelazan en cuatro relatos de violencia y redención.','Accion',90,4,'1994'),(6,'The Matrix','Un hacker informático aprende de unos rebeldes misteriosos sobre la verdadera naturaleza de su realidad y su papel en la guerra contra sus controladores.','Ciencia ficcion',74,3,'1999'),(7,'El padrino','El envejecido patriarca de una dinastía del crimen organizado transfiere el control de su imperio clandestino a su reacio hijo','Ciencia ficcion',82,4,'1972'),(8,'El Club de la Pelea','Un trabajador de oficina insomne y un fabricante de jabón despreocupado forman un club de lucha clandestino que evoluciona en algo mucho más','Accion',90,4,'1999'),(9,'Star Wars: Episodio IV - Una Nueva Esperanza','Luke Skywalker se une a un caballero Jedi, un piloto arrogante, un wookiee y dos droides para salvar la galaxia de la estación de batalla destructora de mundos del Imperio.','Ciencia ficcion',90,4,'1977'),(10,'El reino del planeta de los simios','Ambientada varias generaciones en el futuro tras el reinado de César, en la que los simios son la especie dominante que vive en armonía y los humanos se han visto reducidos a vivir en la sombra...','Accion',52,2,'2024'),(11,'Cuando acecha la maldad','En un remoto pueblo, dos hermanos descubren a un hombre poseído por un demonio y a punto de desatar el horror que lleva dentro..','Terror',99,5,'2023-11-10'),(12,'Avatar 2 Temple','TEST TEST TEST Description','Aventura',83,3,'2023'),(13,'I, Frankenstein','Esta nueva versión se narra desde una perspectiva totalmente novedosa, la situación del conocido personaje dos siglos después de que el doctor Victor Frankenstein le diera vida..','Terror',54,3,'2024'),(14,'Garfield: la película','El mundialmente famoso Garfield, el gato casero que odia los lunes y que adora la lasaña, está a punto de vivir una aventura ¡en el salvaje mundo exterior!..','Animación',70,4,'2024'),(15,'Parásitos','Tanto Gi Taek como su familia están sin trabajo. Cuando su hijo mayor, Gi Woo, empieza a dar clases particulares en casa de Park, las dos familias, que tienen mucho en común..','Drama',85,5,'2019');
/*!40000 ALTER TABLE `peliculas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'movie_web'
--

--
-- Dumping routines for database 'movie_web'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-07-11 20:26:49
