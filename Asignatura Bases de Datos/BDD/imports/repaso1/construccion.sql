-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-01-2024 a las 11:31:30
-- Versión del servidor: 10.1.31-MariaDB
-- Versión de PHP: 7.2.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `contruccion`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `conductor`
--

CREATE TABLE `conductor` (
  `cod_conductor` varchar(10) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `localidad` varchar(10) NOT NULL,
  `categoria` varchar(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `conductor`
--

INSERT INTO `conductor` (`cod_conductor`, `nombre`, `localidad`, `categoria`) VALUES
('c01', 'Jose Mas', 'Arganda', '18'),
('c02', 'Manuel Diaz', 'Arganda', '15'),
('c03', 'Juan Pérez', 'Rivas', '20'),
('c04', 'Luis Ortiz', 'Arganda', '18'),
('c05', 'Javier Martin', 'Loeches', '12'),
('c06', 'Carmen Perez', 'Rivas', '15');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `maquina`
--

CREATE TABLE `maquina` (
  `cod_maquina` varchar(10) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `precio_hora` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `maquina`
--

INSERT INTO `maquina` (`cod_maquina`, `nombre`, `precio_hora`) VALUES
('m01', 'Excavadora', 150),
('m02', 'Hormigonera', 100),
('m03', 'Volquete', 110),
('m04', 'Apisonadora', 180);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proyecto`
--

CREATE TABLE `proyecto` (
  `codigo` varchar(15) NOT NULL,
  `descripcion` varchar(30) NOT NULL,
  `localidad` varchar(15) NOT NULL,
  `cliente` varchar(20) NOT NULL,
  `telefono` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `proyecto`
--

INSERT INTO `proyecto` (`codigo`, `descripcion`, `localidad`, `cliente`, `telefono`) VALUES
('p01', 'Garaje', 'Arganda', 'Felipe Sol', '600111111'),
('p02', 'Solado', 'Rivas', 'Jose Perez', '912222222'),
('p03', 'Garaje', 'Arganda', 'Rosa Lopez', '666999666'),
('p04', 'Techado', 'Loeches', 'Jose Perez', '913333333'),
('p05', 'Buhardilla', 'Rivas', 'Ana Botijo', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `trabajo`
--

CREATE TABLE `trabajo` (
  `cod_conductor` varchar(10) NOT NULL,
  `cod_maquina` varchar(10) NOT NULL,
  `cod_proyecto` varchar(10) NOT NULL,
  `fecha` date NOT NULL,
  `tiempo` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `trabajo`
--

INSERT INTO `trabajo` (`cod_conductor`, `cod_maquina`, `cod_proyecto`, `fecha`, `tiempo`) VALUES
('c01', 'm02', 'p02', '2002-09-10', 120),
('c01', 'm02', 'p04', '2002-09-17', NULL),
('c01', 'm03', 'p04', '2002-09-15', 180),
('c02', 'm03', 'p01', '2002-09-10', 100),
('c02', 'm03', 'p01', '2002-09-18', NULL),
('c02', 'm03', 'p02', '2002-09-15', NULL),
('c02', 'm03', 'p03', '2002-09-13', 30),
('c03', 'm01', 'p02', '2009-09-10', 200),
('c03', 'm01', 'p04', '2002-09-15', 300),
('c04', 'm03', 'p02', '2002-09-10', 90),
('c05', 'm03', 'p02', '2002-09-10', 150),
('c05', 'm03', 'p04', '2002-09-15', 90);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `conductor`
--
ALTER TABLE `conductor`
  ADD PRIMARY KEY (`cod_conductor`);

--
-- Indices de la tabla `maquina`
--
ALTER TABLE `maquina`
  ADD PRIMARY KEY (`cod_maquina`);

--
-- Indices de la tabla `proyecto`
--
ALTER TABLE `proyecto`
  ADD PRIMARY KEY (`codigo`);

--
-- Indices de la tabla `trabajo`
--
ALTER TABLE `trabajo`
  ADD PRIMARY KEY (`cod_conductor`,`cod_maquina`,`cod_proyecto`,`fecha`),
  ADD KEY `cod_maquina` (`cod_maquina`),
  ADD KEY `cod_proyecto` (`cod_proyecto`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `trabajo`
--
ALTER TABLE `trabajo`
  ADD CONSTRAINT `trabajo_ibfk_1` FOREIGN KEY (`cod_conductor`) REFERENCES `conductor` (`cod_conductor`),
  ADD CONSTRAINT `trabajo_ibfk_2` FOREIGN KEY (`cod_maquina`) REFERENCES `maquina` (`cod_maquina`),
  ADD CONSTRAINT `trabajo_ibfk_3` FOREIGN KEY (`cod_proyecto`) REFERENCES `proyecto` (`codigo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
