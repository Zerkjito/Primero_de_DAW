-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-03-2025 a las 10:17:38
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
-- Base de datos: `automoviles`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `dni` varchar(15) NOT NULL,
  `nombre` varchar(15) DEFAULT NULL,
  `apellidos` varchar(15) DEFAULT NULL,
  `ciudad` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`dni`, `nombre`, `apellidos`, `ciudad`) VALUES
('D001', 'Juan', 'Pérez', 'Madrid'),
('D002', 'Ana', 'González', 'Barcelona'),
('D003', 'Carlos', 'Martínez', 'Valencia');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `coche`
--

CREATE TABLE `coche` (
  `codcoche` varchar(15) NOT NULL,
  `nombre` varchar(15) DEFAULT NULL,
  `modelo` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `coche`
--

INSERT INTO `coche` (`codcoche`, `nombre`, `modelo`) VALUES
('C001', 'Corolla', '2023'),
('C002', 'Focus', '2023'),
('C003', 'X5', '2023');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `concesionario`
--

CREATE TABLE `concesionario` (
  `cifc` varchar(15) NOT NULL,
  `nombre` varchar(15) DEFAULT NULL,
  `ciudad` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `concesionario`
--

INSERT INTO `concesionario` (`cifc`, `nombre`, `ciudad`) VALUES
('C001', 'Concesionario A', 'Madrid'),
('C002', 'Concesionario B', 'Barcelona'),
('C003', 'Concesionario C', 'Valencia');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `distribucion`
--

CREATE TABLE `distribucion` (
  `cifc` varchar(15) NOT NULL,
  `codcoche` varchar(15) NOT NULL,
  `cantidad` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `distribucion`
--

INSERT INTO `distribucion` (`cifc`, `codcoche`, `cantidad`) VALUES
('C001', 'C001', 5),
('C002', 'C002', 3),
('C003', 'C003', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `marca`
--

CREATE TABLE `marca` (
  `cifm` varchar(15) NOT NULL,
  `nombre` varchar(15) DEFAULT NULL,
  `ciudad` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `marca`
--

INSERT INTO `marca` (`cifm`, `nombre`, `ciudad`) VALUES
('M001', 'Toyota', 'Tokyo'),
('M002', 'Ford', 'Detroit'),
('M003', 'BMW', 'Munich');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `marco`
--

CREATE TABLE `marco` (
  `cifm` varchar(15) NOT NULL,
  `codcoche` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `marco`
--

INSERT INTO `marco` (`cifm`, `codcoche`) VALUES
('M001', 'C001'),
('M002', 'C002'),
('M003', 'C003');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventas`
--

CREATE TABLE `ventas` (
  `cifc` varchar(15) NOT NULL,
  `dni` varchar(15) NOT NULL,
  `codcoche` varchar(15) NOT NULL,
  `color` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`dni`);

--
-- Indices de la tabla `coche`
--
ALTER TABLE `coche`
  ADD PRIMARY KEY (`codcoche`);

--
-- Indices de la tabla `concesionario`
--
ALTER TABLE `concesionario`
  ADD PRIMARY KEY (`cifc`);

--
-- Indices de la tabla `distribucion`
--
ALTER TABLE `distribucion`
  ADD PRIMARY KEY (`cifc`,`codcoche`),
  ADD KEY `codcoche` (`codcoche`);

--
-- Indices de la tabla `marca`
--
ALTER TABLE `marca`
  ADD PRIMARY KEY (`cifm`);

--
-- Indices de la tabla `marco`
--
ALTER TABLE `marco`
  ADD PRIMARY KEY (`cifm`,`codcoche`),
  ADD KEY `codcoche` (`codcoche`);

--
-- Indices de la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD PRIMARY KEY (`cifc`,`dni`,`codcoche`),
  ADD KEY `dni` (`dni`),
  ADD KEY `codcoche` (`codcoche`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `distribucion`
--
ALTER TABLE `distribucion`
  ADD CONSTRAINT `distribucion_ibfk_1` FOREIGN KEY (`cifc`) REFERENCES `concesionario` (`cifc`),
  ADD CONSTRAINT `distribucion_ibfk_2` FOREIGN KEY (`codcoche`) REFERENCES `coche` (`codcoche`);

--
-- Filtros para la tabla `marco`
--
ALTER TABLE `marco`
  ADD CONSTRAINT `marco_ibfk_1` FOREIGN KEY (`cifm`) REFERENCES `marca` (`cifm`),
  ADD CONSTRAINT `marco_ibfk_2` FOREIGN KEY (`codcoche`) REFERENCES `coche` (`codcoche`);

--
-- Filtros para la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD CONSTRAINT `ventas_ibfk_1` FOREIGN KEY (`cifc`) REFERENCES `concesionario` (`cifc`),
  ADD CONSTRAINT `ventas_ibfk_2` FOREIGN KEY (`dni`) REFERENCES `cliente` (`dni`),
  ADD CONSTRAINT `ventas_ibfk_3` FOREIGN KEY (`codcoche`) REFERENCES `coche` (`codcoche`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
