-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 15, 2020 at 09:04 PM
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
-- Table structure for table `donor_master`
--

CREATE TABLE `donor_master` (
  `Donor_ID` int(11) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Phone` varchar(10) DEFAULT NULL,
  `Location` varchar(30) DEFAULT NULL,
  `Quantity` int(4) DEFAULT NULL,
  `Blood Group` varchar(3) DEFAULT NULL,
  `Email` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `donor_master`
--

INSERT INTO `donor_master` (`Donor_ID`, `Name`, `Phone`, `Location`, `Quantity`, `Blood Group`, `Email`) VALUES
(7, 'Prathamesh Bagekari', '9898565645', 'Tilaknagar', 2, 'O-', 'prathameshbagekari@gmail.com'),
(8, 'Tanay Bagayatkar', '9809887654', 'Virar', 1, 'A-', 'tanay.bagayatkar@spit.ac.in'),
(9, 'Nadeem', '9898090976', 'India', 3, 'A-', 'nadeem@gmail.com'),
(10, 'Anonymous', '9887766554', 'India', 4, 'A-', 'anonymous@gmail.com'),
(11, 'XYZ', '8787676756', 'India', 1, 'O+', 'xyz@gmail.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `donor_master`
--
ALTER TABLE `donor_master`
  ADD PRIMARY KEY (`Donor_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `donor_master`
--
ALTER TABLE `donor_master`
  MODIFY `Donor_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
