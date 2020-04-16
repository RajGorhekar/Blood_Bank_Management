-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 15, 2020 at 09:03 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `lsapp`
--

-- --------------------------------------------------------

--
-- Table structure for table `request_master`
--

CREATE TABLE `request_master` (
  `Request_ID` int(11) NOT NULL,
  `Patient_ID` int(11) DEFAULT NULL,
  `Quantity` int(11) DEFAULT NULL,
  `Location` varchar(30) DEFAULT NULL,
  `DateOfRequirement` varchar(10) DEFAULT NULL,
  `Status` varchar(9) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `request_master`
--

INSERT INTO `request_master` (`Request_ID`, `Patient_ID`, `Quantity`, `Location`, `DateOfRequirement`, `Status`) VALUES
(1, 1, 1, 'Nepal', '03-02-2020', 'Remaining'),
(2, 2, 1, 'India', '04-02-2020', 'Answered'),
(3, 3, 1, 'Tilaknagar', '08-04-2020', 'Answered');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `request_master`
--
ALTER TABLE `request_master`
  ADD PRIMARY KEY (`Request_ID`),
  ADD KEY `Patient_ID` (`Patient_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `request_master`
--
ALTER TABLE `request_master`
  MODIFY `Request_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `request_master`
--
ALTER TABLE `request_master`
  ADD CONSTRAINT `request_master_ibfk_1` FOREIGN KEY (`Patient_ID`) REFERENCES `patient_master` (`Patient_ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
