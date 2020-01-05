-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 17, 2019 at 01:59 PM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.3.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `javaproject2`
--

-- --------------------------------------------------------

--
-- Table structure for table `bills`
--

CREATE TABLE `bills` (
  `id` int(11) NOT NULL,
  `mem_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `bills`
--

INSERT INTO `bills` (`id`, `mem_id`) VALUES
(2, NULL),
(4, NULL),
(5, NULL),
(6, NULL),
(7, NULL),
(8, NULL),
(9, NULL),
(10, NULL),
(11, NULL),
(12, NULL),
(13, NULL),
(15, NULL),
(16, NULL),
(17, NULL),
(18, NULL),
(19, NULL),
(20, NULL),
(21, NULL),
(22, NULL),
(23, NULL),
(27, NULL),
(28, NULL),
(29, NULL),
(30, NULL),
(32, NULL),
(1, 2),
(3, 2),
(14, 2);

-- --------------------------------------------------------

--
-- Table structure for table `bills_detail`
--

CREATE TABLE `bills_detail` (
  `bill_id` int(11) NOT NULL,
  `Quantities` int(11) NOT NULL,
  `Addresss` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ReceiveDate` date DEFAULT NULL,
  `DisCount` double DEFAULT NULL,
  `ProId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `bills_detail`
--

INSERT INTO `bills_detail` (`bill_id`, `Quantities`, `Addresss`, `ReceiveDate`, `DisCount`, `ProId`) VALUES
(1, 10, 'dfds', '2019-12-01', 50, 2),
(1, 2, 'dfs', '2019-12-03', 50, 2),
(1, 3, 'dasd', '2019-12-12', 40, 3),
(1, 2, 'asd', '2019-12-03', 50, 3),
(1, 3, 'sd', '2019-12-03', 20, 4),
(1, 40, 'df', '2019-12-15', 50, 4),
(1, 2, 'd', '2019-12-23', 40, 3),
(1, 6, 'fcf', '2019-12-17', 40, 4),
(11, 3, NULL, NULL, NULL, 2),
(12, 3, NULL, NULL, NULL, 3),
(13, 3, NULL, NULL, NULL, 3),
(13, 56, NULL, NULL, NULL, 4),
(13, 2, NULL, NULL, NULL, 3),
(14, 4, NULL, NULL, NULL, 4),
(14, 56, NULL, NULL, NULL, 2),
(14, 3, NULL, NULL, NULL, 3),
(15, 32, NULL, NULL, NULL, 3),
(15, 2, NULL, NULL, NULL, 4),
(16, 2, NULL, NULL, NULL, 3),
(17, 45, NULL, NULL, NULL, 4),
(18, 2, NULL, NULL, NULL, 4),
(19, 4, NULL, NULL, NULL, 4),
(20, 2, NULL, NULL, NULL, 4),
(21, 3, NULL, NULL, NULL, 2),
(22, 3, NULL, NULL, NULL, 3),
(23, 2, NULL, NULL, NULL, 3),
(27, 1, NULL, NULL, NULL, 2),
(27, 7, NULL, NULL, NULL, 3),
(28, 2, NULL, NULL, NULL, 4),
(29, 3, NULL, NULL, NULL, 3),
(30, 22, NULL, NULL, NULL, 2),
(32, 3, NULL, NULL, NULL, 4);

-- --------------------------------------------------------

--
-- Table structure for table `members`
--

CREATE TABLE `members` (
  `ID` int(11) NOT NULL,
  `Name` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `Point` int(11) NOT NULL,
  `PhoneNumber` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `members`
--

INSERT INTO `members` (`ID`, `Name`, `Point`, `PhoneNumber`) VALUES
(2, 'Thay Giao Ba1', 0, '0932229913'),
(3, '10000', 0, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE `products` (
  `Id` int(11) NOT NULL,
  `Name` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `PriceIn` double NOT NULL,
  `PriceOut` double NOT NULL,
  `Kind` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `Quantities` int(11) NOT NULL,
  `ImportDate` date NOT NULL,
  `ExpDate` date NOT NULL,
  `Url` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `Status` varchar(1) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`Id`, `Name`, `PriceIn`, `PriceOut`, `Kind`, `Quantities`, `ImportDate`, `ExpDate`, `Url`, `Status`) VALUES
(2, 'Hai', 1000, 1200, '4', 163432, '2019-12-02', '2019-12-13', 'rty', ''),
(3, 'iphone', 1000, 3000, '3', 9950, '2019-12-02', '2019-12-11', 'da', ''),
(4, 'Kho ga` ', 10000, 20000, '2', 9994, '2019-12-15', '2019-12-18', 'dsfds', ''),
(5, 'thit cho', 2132, 4343, '2', 20, '2019-12-10', '2019-12-19', 'dfdsf', ''),
(6, 'mam tom', 234, 454, '2', 5435, '2019-12-03', '2019-12-12', 'dsfds', ''),
(7, 'dfdf', 10000, 3000, '2', 3, '2019-12-23', '2019-12-21', 'erefefe', ''),
(8, 'tu', 2, 20000, '2', 3, '2019-12-02', '2019-12-13', 'a', ''),
(9, 'tien', 234, 34, '2', 56546, '2019-12-11', '2019-12-25', 'b', ''),
(10, 'Cut Cho', 10000, 3000, '2', 5454, '2019-12-11', '2019-12-20', 'c', ''),
(11, 'lalala', 234, 434343, '2', 6, '2019-12-12', '2019-12-20', 'd', ''),
(12, 'Manh', 1, 2, '3', 3223, '2019-12-02', '2019-12-13', 'e', '');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `ID` int(11) NOT NULL,
  `Name` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `pwd` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `Role` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bills`
--
ALTER TABLE `bills`
  ADD PRIMARY KEY (`id`),
  ADD KEY `mem_id` (`mem_id`);

--
-- Indexes for table `bills_detail`
--
ALTER TABLE `bills_detail`
  ADD KEY `ProId` (`ProId`),
  ADD KEY `bill_id` (`bill_id`);

--
-- Indexes for table `members`
--
ALTER TABLE `members`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bills`
--
ALTER TABLE `bills`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

--
-- AUTO_INCREMENT for table `members`
--
ALTER TABLE `members`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `products`
--
ALTER TABLE `products`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `bills`
--
ALTER TABLE `bills`
  ADD CONSTRAINT `bills_ibfk_1` FOREIGN KEY (`mem_id`) REFERENCES `members` (`ID`);

--
-- Constraints for table `bills_detail`
--
ALTER TABLE `bills_detail`
  ADD CONSTRAINT `bills_detail_ibfk_2` FOREIGN KEY (`ProId`) REFERENCES `products` (`Id`),
  ADD CONSTRAINT `bills_detail_ibfk_3` FOREIGN KEY (`bill_id`) REFERENCES `bills` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
