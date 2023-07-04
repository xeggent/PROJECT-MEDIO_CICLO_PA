-- Crear la base de datos
CREATE DATABASE IF NOT EXISTS facturacionz;
USE facturacionz;

-- Estructura de tabla para la tabla `tipo_articulo`
CREATE TABLE IF NOT EXISTS `tipo_articulo` (
  `cod_tipo_articulo` varchar(30) NOT NULL,
  `descripcion_articulo` varchar(30) NOT NULL,
  PRIMARY KEY (`cod_tipo_articulo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Estructura de tabla para la tabla `articulo`
CREATE TABLE IF NOT EXISTS `articulo` (
  `id_articulo` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(30) NOT NULL,
  `precio_venta` int(11) NOT NULL,
  `precio_costo` int(11) NOT NULL,
  `stock` int(11) NOT NULL,
  `cod_tipo_articulo` varchar(30) NOT NULL,
  `fecha_ingreso` varchar(15) NOT NULL,
  PRIMARY KEY (`id_articulo`),
  KEY `ref_tipo_articulo_idx` (`cod_tipo_articulo`),
  CONSTRAINT `ref_tipo_articulo_fk` FOREIGN KEY (`cod_tipo_articulo`) REFERENCES `tipo_articulo` (`cod_tipo_articulo`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=13;

-- Estructura de tabla para la tabla `ciudad`
CREATE TABLE IF NOT EXISTS `ciudad` (
  `Codigo_ciudad` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre_ciudad` varchar(30) NOT NULL,
  PRIMARY KEY (`Codigo_ciudad`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=21;

-- Estructura de tabla para la tabla `cliente`
CREATE TABLE IF NOT EXISTS `cliente` (
  `Documento` varchar(15) NOT NULL,
  `cod_tipo_documento` int(11) NOT NULL,
  `Nombres` varchar(30) NOT NULL,
  `Apellidos` varchar(30) NOT NULL,
  `Direccion` varchar(20) DEFAULT NULL,
  `cod_ciudad` int(11) NOT NULL,
  `Telefono` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Documento`),
  KEY `cod_tipodocumento_idx` (`cod_tipo_documento`),
  KEY `ref_ciudad_idx` (`cod_ciudad`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Crear la tabla 'tipo_de_documento'
CREATE TABLE IF NOT EXISTS `tipo_de_documento` (
  `id_tipo_documento` int(11) NOT NULL AUTO_INCREMENT,
  `Descripcion` varchar(10) NOT NULL,
  PRIMARY KEY (`id_tipo_documento`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=8;

--
-- Volcar la base de datos para la tabla `tipo_de_documento`
--

INSERT INTO `tipo_de_documento` (`id_tipo_documento`, `Descripcion`) VALUES
(1, 'CC'),
(2, 'TI'),
(3, 'RC'),
(4, 'NIT'),
(5, 'PASAPORTE'),
(6, 'CE'),
(7, 'RUT');

-- Insertar datos en la tabla `ciudad`

INSERT INTO `ciudad` (`Codigo_ciudad`, `Nombre_ciudad`) VALUES
(1,'QUITO'),
(2,'GUAYAQUIL'),
(3,'CUENCA'),
(4,'MACHALA'),
(5,'AMBATO'),
(6,'MANTA'),
(7,'PORTOVIEJO'),
(8,'LOJA'),
(9,'SANTO DOMINGO'),
(10,'LATACUNGA'),
(11,'ESMERALDAS'),
(12,'IBARRA'),
(13,'RIOBAMBA'),
(14,'QUEVEDO'),
(15,'DAULE'),
(16,'MILAGRO'),
(17,'ATACAMES'),
(18,'MONTAÑITA'),
(19,'SALINAS'),
(20,'PUERTO AYORA');

-- Estructura de tabla para la tabla `factura`

CREATE TABLE IF NOT EXISTS `factura` (
  `Nnm_factura` varchar(20) NOT NULL,
  `cod_cliente` varchar(15) NOT NULL,
  `Nombre_empleado` varchar(30) NOT NULL,
  `Fecha_facturacion` varchar(15) NOT NULL,
  `cod_formapago` int(11) NOT NULL,
  `total_factura` decimal(10,0) DEFAULT NULL,
  `IVA` decimal(10,0) DEFAULT NULL,
  PRIMARY KEY (`Nnm_factura`),
  KEY `ref_cli_idx` (`cod_cliente`),
  KEY `ref_formapago_idx` (`cod_formapago`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Estructura de tabla para la tabla `detalle_factura`

CREATE TABLE IF NOT EXISTS `detalle_factura` (
  `cod_factura` varchar(20) NOT NULL,
  `cod_articulo` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `total` decimal(10,0) NOT NULL,
  PRIMARY KEY (`cod_factura`,`cod_articulo`),
  KEY `ref_facturacion_idx` (`cod_factura`),
  KEY `ref_ar_fact_idx` (`cod_articulo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Estructura de tabla para la tabla `forma_de_pago`

CREATE TABLE IF NOT EXISTS `forma_de_pago` (
  `id_formapago` int(11) NOT NULL AUTO_INCREMENT,
  `Descripcion_formapago` varchar(20) NOT NULL,
  PRIMARY KEY (`id_formapago`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=5;

--
-- Volcar la base de datos para la tabla `forma_de_pago`
--

INSERT INTO `forma_de_pago` (`id_formapago`, `Descripcion_formapago`) VALUES
(1, 'EFECTIVO'),
(2, 'BONO'),
(3, 'TARJETA DE CREDITO'),
(4, 'CHEQUE');

-- --------------------------------------------------------
--
-- Estructura de tabla para la tabla `devolucion`
--

CREATE TABLE IF NOT EXISTS `devolucion` (
  `cod_detallefactura` varchar(20) NOT NULL,
  `cod_detallearticulo` int(11) NOT NULL,
  `Motivo` varchar(15) NOT NULL,
  `Fecha_devolucion` varchar(10) NOT NULL,
  `cantidad` int(11) NOT NULL,
  PRIMARY KEY (`cod_detallefactura`,`cod_detallearticulo`),
  KEY `ref_detallefactu_idx` (`cod_detallefactura`),
  KEY `ref_deta_art_idx` (`cod_detallearticulo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Filtros para la tabla `devolucion`
--
ALTER TABLE `devolucion`
  ADD CONSTRAINT `ref_detallefactu` FOREIGN KEY (`cod_detallefactura`) REFERENCES `detalle_factura` (`cod_factura`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `ref_deta_art` FOREIGN KEY (`cod_detallearticulo`) REFERENCES `detalle_factura` (`cod_articulo`) ON DELETE CASCADE ON UPDATE CASCADE;
