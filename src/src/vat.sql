CREATE DATABASE IF NOT EXISTS `vat` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `vat`;

DROP TABLE IF EXISTS `block`;
CREATE TABLE `block` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `length` double NOT NULL,
  `width` double NOT NULL,
  `height` double NOT NULL,
  PRIMARY KEY (`ID`)
);

DROP TABLE IF EXISTS `cone`;
CREATE TABLE `cone` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `radius` double NOT NULL,
  `height` double NOT NULL,
  PRIMARY KEY (`ID`)
);

DROP TABLE IF EXISTS `cylinder`;
CREATE TABLE `cylinder` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `radius` double NOT NULL,
  `height` double NOT NULL,
  PRIMARY KEY (`ID`)
);

DROP TABLE IF EXISTS `pyramid`;
CREATE TABLE `pyramid` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `length` double NOT NULL,
  `width` double NOT NULL,
  `height` double NOT NULL,
  PRIMARY KEY (`ID`)
);

DROP TABLE IF EXISTS `sphere`;
CREATE TABLE `sphere` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `radius` double NOT NULL,
  PRIMARY KEY (`ID`)
);