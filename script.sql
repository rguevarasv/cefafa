CREATE DATABASE `test` /*!40100 DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci */;

-- test.productos definition

CREATE TABLE `productos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) DEFAULT NULL,
  `descripcion` varchar(250) DEFAULT NULL,
  `precio` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

INSERT INTO test.productos
(id, nombre, descripcion, precio)
VALUES(1, 'Panadol', 'Panadol', 0.25);
INSERT INTO test.productos
(id, nombre, descripcion, precio)
VALUES(2, 'Tabcin', 'Tabcin', 0.2);
