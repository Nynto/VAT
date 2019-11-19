CREATE DATABASE IF NOT EXISTS `vat` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `vat`;

DROP TABLE IF EXISTS `form`;
CREATE TABLE `form` (
  `type` enum('block','cone','cylinder','pyramid','sphere') NOT NULL,
  `length` double DEFAULT NULL,
  `width` double DEFAULT NULL,
  `height` double DEFAULT NULL,
  `radius` double DEFAULT NULL
);