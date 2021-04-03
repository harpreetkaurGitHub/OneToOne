# OneToOne
This is One To One Mapping through  Hibernate which is Uni-Directional
Here I have provided MYSQL queries

DROP SCHEMA IF EXISTS `oneToOne`;

CREATE SCHEMA `oneToOne`;

use `oneToOne`;

SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `instructorDetail`;

CREATE TABLE `instructorDetail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `youtubeChannel` varchar(128) DEFAULT NULL,
  `hobby` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;


DROP TABLE IF EXISTS `instructor`;

CREATE TABLE `instructor` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `firstname` varchar(45) DEFAULT NULL,
  `lastname` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `instructorDetailId` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_DETAIL_idx` (`instructorDetailId`),
  CONSTRAINT `FK_DETAIL` FOREIGN KEY (`instructorDetailId`) REFERENCES `instructorDetail` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

SET FOREIGN_KEY_CHECKS = 1;
