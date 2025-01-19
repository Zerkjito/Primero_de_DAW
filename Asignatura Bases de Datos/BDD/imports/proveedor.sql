-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 19-01-2025 a las 21:52:05
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proveedor`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `linped`
--

CREATE TABLE `linped` (
  `numpedido` varchar(5) NOT NULL DEFAULT '0',
  `numlinea` varchar(5) NOT NULL DEFAULT '0',
  `numpieza` varchar(20) DEFAULT NULL,
  `preciocompra` decimal(19,4) DEFAULT 0.0000,
  `cantpedida` int(11) DEFAULT 0,
  `fecharecep` date DEFAULT NULL,
  `cantrecibida` int(11) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `linped`
--

INSERT INTO `linped` (`numpedido`, `numlinea`, `numpieza`, `preciocompra`, `cantpedida`, `fecharecep`, `cantrecibida`) VALUES
('1', '1', 'M-0001-C', 160.0000, 10, '1992-05-10', 10),
('1', '2', 'P-0001-33', 112.0000, 20, '1992-05-10', 18),
('1', '3', 'FD-0001-144', 74.0000, 20, '1992-05-10', 20),
('1', '4', 'DD-0001-210', 90.0000, 20, '1992-05-10', 20),
('1', '5', 'T-0002-AT', 18.0000, 22, '1992-10-17', 22),
('2', '1', 'DK144-0002-P', 3.0000, 100, '1992-10-15', 101),
('2', '2', 'T-0002-AT', 18.0000, 1, '1992-10-15', 1),
('3', '1', 'DD-0001-210', 37.8000, 15, '1992-10-17', 15),
('3', '2', 'P-0001-33', 112.6700, 3, '1992-10-17', 3),
('4', '1', 'O-0002-PP', 53.0000, 10, '1992-10-17', 10),
('5', '1', 'T-0002-AT', 9.0000, 15, '1993-06-11', 13),
('6', '1', 'O-0001-PP', 9.0000, 10000, '1995-08-25', 10000),
('6', '2', 'O-0002-PP', 53.0000, 20000, '1995-08-25', 19980),
('7', '1', 'C-400-Z', 3.5000, 45, '1992-10-09', 8);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido`
--

CREATE TABLE `pedido` (
  `numpedido` varchar(5) NOT NULL,
  `numvend` varchar(10) DEFAULT '0',
  `fecha` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `pedido`
--

INSERT INTO `pedido` (`numpedido`, `numvend`, `fecha`) VALUES
('1', '1', '1992-05-05'),
('2', '1', '1992-10-11'),
('3', '2', '1992-10-15'),
('4', '2', '1992-10-16'),
('5', '1', '1992-10-22'),
('6', '5', '1993-08-22'),
('7', '8002', '1992-10-02');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pieza`
--

CREATE TABLE `pieza` (
  `numpieza` varchar(20) NOT NULL,
  `nompieza` varchar(35) DEFAULT NULL,
  `preciovent` decimal(19,4) DEFAULT 0.0000
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `pieza`
--

INSERT INTO `pieza` (`numpieza`, `nompieza`, `preciovent`) VALUES
('A-1001-L', 'MOUSE ADL 3B', 5.0000),
('C-1002-H', NULL, 3.5000),
('C-1002-J', NULL, 5.0000),
('C-400-Z', 'FILTRO PANTALLA X200', 7.0000),
('DD-0001-210', 'DISCO DURO WESTERN DIG 210M 28', 134.1300),
('DD-0001-30', 'DISCO DURO 30M SEAGATE', 130.0000),
('DK144-0001', 'DISKETTE 1.44 PANASONIC', 0.6000),
('DK144-0002-P', 'PACK DISKETTE 144 PANASONIC', 6.0000),
('FD-0001-144', 'FLOPPY 1.44 IBM', 96.0000),
('FD-0002-720', 'FLOPPY 720 IBM', 80.0000),
('M-0001-C', 'MONITOR SYNCMASTER 3 COLOR', 90.0000),
('M-0002-C', 'MONITOR COLOR SONY BT', 187.0000),
('M-0003-C', 'MONITOR IBM 3570 COLOR', 200.0000),
('O-0001-PP', 'PEGATINAS CONCIERTO JEVI', 12.0000),
('O-0002-PP', 'PACK PEGATINAS CONCIERTO JEVI', 10.0000),
('P-0001-33', 'PLACA INTEL 33 Mz', 187.0000),
('T-0001-IBM', 'TECLADO XT IBM', 7.0000),
('T-0002-AT', 'TECLADO AT SUSUSU', 30.0000),
('T-0003-AT', 'TECLADO AT HP', 64.0000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `preciosum`
--

CREATE TABLE `preciosum` (
  `numpieza` varchar(20) NOT NULL,
  `numvend` varchar(10) NOT NULL DEFAULT '0',
  `preciounit` decimal(19,4) DEFAULT 0.0000,
  `diassum` int(11) DEFAULT 0,
  `descuento` int(11) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `preciosum`
--

INSERT INTO `preciosum` (`numpieza`, `numvend`, `preciounit`, `diassum`, `descuento`) VALUES
('A-1001-L', '1', 1.2020, 3, 0),
('A-1001-L', '100', 3.6000, 3, 0),
('A-1001-L', '3', 3.0000, 1, 0),
('A-1001-L', '4', 3.6000, 1, 0),
('C-1002-H', '1', 0.2700, 2, 0),
('C-1002-J', '1', 0.9000, 2, 0),
('C-400-Z', '1', 4.5000, 4, 5),
('C-400-Z', '8002', 3.5000, 3, 0),
('DD-0001-210', '1', 80.0000, 3, 5),
('DD-0001-210', '101', 76.0000, 15, 14),
('DD-0001-210', '2', 82.0000, 5, 12),
('DD-0001-30', '1', 76.0000, 4, 0),
('DK144-0001', '1', 0.3000, 3, 0),
('DK144-0002-P', '1', 3.5000, 3, 0),
('DK144-0002-P', '2', 3.5000, 5, 0),
('FD-0001-144', '1', 79.0000, 3, 0),
('FD-0001-144', '102', 79.5000, 3, 7),
('FD-0001-144', '55', 76.0000, 10, 13),
('FD-0002-720', '1', 36.0000, 3, 0),
('M-0001-C', '1', 76.0000, 3, 13),
('M-0001-C', '3', 108.0000, 7, 15),
('M-0002-C', '1', 90.0000, 10, 15),
('M-0002-C', '9', 180.0000, 1, 5),
('M-0003-C', '1', 120.0000, 7, 0),
('M-0003-C', '3', 195.0000, 2, 15),
('M-0003-C', '4', 168.0000, 7, 0),
('O-0001-PP', '1', 72.0000, 1, 0),
('O-0001-PP', '5', 6.4000, 1, 0),
('O-0001-PP', '55', 6.3000, 7, 0),
('O-0002-PP', '1', 40.0000, 1, 0),
('O-0002-PP', '101', 55.0000, 10, 0),
('O-0002-PP', '2', 59.0000, 1, 0),
('O-0002-PP', '5', 59.5000, 1, 12),
('P-0001-33', '1', 150.0000, 3, 0),
('P-0001-33', '2', 120.0000, 5, 0),
('P-0001-33', '3', 150.0000, 2, 0),
('P-0001-33', '4', 118.0000, 7, 0),
('P-0001-33', '5', 118.0000, 3, 10),
('T-0001-IBM', '1', 54.0000, 15, 0),
('T-0001-IBM', '100', 54.5000, 5, 10),
('T-0001-IBM', '2', 54.0000, 5, 0),
('T-0002-AT', '1', 18.0000, 3, 0),
('T-0002-AT', '100', 19.4000, 2, 5),
('T-0002-AT', '2', 18.3000, 5, 7),
('T-0002-AT', '4', 13.5000, 7, 0),
('T-0002-AT', '5', 13.5000, 3, 0),
('T-0003-AT', '1', 38.0000, 3, 0),
('T-0003-AT', '3', 48.0000, 0, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vendedor`
--

CREATE TABLE `vendedor` (
  `numvend` varchar(10) NOT NULL DEFAULT '0',
  `nomvend` varchar(30) DEFAULT NULL,
  `nombrecomer` varchar(30) DEFAULT NULL,
  `telefono` varchar(15) DEFAULT NULL,
  `calle` varchar(35) DEFAULT NULL,
  `ciudad` varchar(20) DEFAULT NULL,
  `provincia` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `vendedor`
--

INSERT INTO `vendedor` (`numvend`, `nomvend`, `nombrecomer`, `telefono`, `calle`, `ciudad`, `provincia`) VALUES
('1', 'AGAPITO LAFUENTE DEL CORRAL', 'MECEMSA', '965782401', 'AVDA. VALENCIA 3205', 'ALICANTE', 'ALICANTE'),
('10', 'GUSTAVO DE BASICA', 'OLE ESPAÑA, S.A', NULL, NULL, 'RIVAS VACIAMADRID', 'MADRID'),
('100', 'PEDRO GRACIA MORALES', 'SOFT S.A', NULL, 'SALAMANCA 100', 'VALENCIA', 'VALENCIA'),
('101', 'SALVADOR PLA GARCIA', 'TABAC & SOFT', '5661100', 'MAYOR 44', 'SAN VICENTE', 'ALICANTE'),
('102', 'SOLEDAD MARTINEZ ORTEGA', 'ASX S.A', '87879998', 'PEREZ GALDOS 54', 'ALICANTE', 'ALICANTE'),
('11', 'MARIO DUQUE LIZONDO', 'BANESTOESSOFT, S.L', '980101010', 'MOROS 19', 'GIJON', 'ASTURIAS'),
('12', 'JOSE A. MARTINEZ JUAN', 'OLE ESPAÑA, S.A', '3667788', 'COLON 21', 'VALENCIA', 'VALENCIA'),
('13', 'MANUEL GOMEZ SANTISTEBAN', 'OLE ESPAÑA, S.A', '3667789', 'COLON 21', 'VALENCIA', 'VALENCIA'),
('2', 'LUCIANO BLAZQUEZ VAZQUEZ', 'HARW S.A.', '963232321', 'GENERAL LACY, 15 2ÂºB', 'ALICANTE', 'ALICANTE'),
('200', 'SEVERINO MARTIN MARTINEZ', 'SEVESOFT', '5779988', 'GENERAL LACY 17', 'ALICANTE', 'ALICANTE'),
('3', 'GODOFREDO MARTIN MARTINEZ', 'MECEMSA', '964141722', 'AVDA. VALENCIA 3372', 'ALICANTE', 'ALICANTE'),
('4', 'JUANITO REINA PRINCESA', 'HARW S.A.', '903696969', 'DONDEQUIERAS, 1000,13F', 'LOS ANGELES', 'LOS EU-S'),
('5', 'JUANITO REINA PRINCESA', 'LA DEAQUI', '985363636', 'SAN FRANCISCO DE ASIS, 10 1', 'GIJON', 'ASTURIAS'),
('55', 'LUIS GARCIA SATORRE', 'HARW S.A.', '5889944', 'POETA ALONSO, 12', 'ALICANTE', 'ALICANTE'),
('6', 'MANOLO PIEDRA POMEZ', 'HUMP, S.A', '965660727', 'AVIACION 92, 3 I', 'SAN VICENTE', 'ALICANTE'),
('7', 'MANUEL PEREZ RODRIGUEZ', 'SOFTHARD DI STRIBUIDORA', '985696969', 'ARZOBISPO. LOACES', 'QUINTANAR DE LA ORDE', 'TOLEDO'),
('8', 'LUISA PINTO HEREDIA', 'LA MEJOR S.A', '9992014455', 'OXFORD BLUES', 'NEW ORLEANS', 'LOUISSIANA'),
('8001', 'JUAN RODRIGUEZ JUAN', 'HALA S.A', NULL, NULL, 'ALMORADI', 'ALICANTE'),
('8002', 'JUAN MARTINEZ GARCIA', 'HARW S.A.', '3334455', 'CISCAR, 5', 'VALENCIA', 'VALENCIA'),
('8003', 'LUIS RODRIGUEZ SALA', 'HARW S.A.', '3335588', 'SALAMANCA 102', 'VALENCIA', 'VALENCIA'),
('9', 'CHEMA PAMUNDI', 'OLE ESPAÑA, S.A', NULL, NULL, 'RIVAS VACIAMADRID', 'MADRID');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `linped`
--
ALTER TABLE `linped`
  ADD PRIMARY KEY (`numpedido`,`numlinea`),
  ADD KEY `numpedido` (`numpedido`),
  ADD KEY `numpieza` (`numpieza`);

--
-- Indices de la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`numpedido`),
  ADD KEY `numvend` (`numvend`);

--
-- Indices de la tabla `pieza`
--
ALTER TABLE `pieza`
  ADD PRIMARY KEY (`numpieza`);

--
-- Indices de la tabla `preciosum`
--
ALTER TABLE `preciosum`
  ADD PRIMARY KEY (`numpieza`,`numvend`),
  ADD KEY `numpieza` (`numpieza`),
  ADD KEY `numvend` (`numvend`);

--
-- Indices de la tabla `vendedor`
--
ALTER TABLE `vendedor`
  ADD PRIMARY KEY (`numvend`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `linped`
--
ALTER TABLE `linped`
  ADD CONSTRAINT `linped_ibfk_1` FOREIGN KEY (`numpedido`) REFERENCES `pedido` (`numpedido`),
  ADD CONSTRAINT `linped_ibfk_2` FOREIGN KEY (`numpieza`) REFERENCES `pieza` (`numpieza`);

--
-- Filtros para la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD CONSTRAINT `pedido_ibfk_1` FOREIGN KEY (`numvend`) REFERENCES `vendedor` (`numvend`);

--
-- Filtros para la tabla `preciosum`
--
ALTER TABLE `preciosum`
  ADD CONSTRAINT `preciosum_ibfk_1` FOREIGN KEY (`numpieza`) REFERENCES `pieza` (`numpieza`),
  ADD CONSTRAINT `preciosum_ibfk_2` FOREIGN KEY (`numvend`) REFERENCES `vendedor` (`numvend`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
