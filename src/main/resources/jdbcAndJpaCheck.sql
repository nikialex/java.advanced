-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.6.23-log - MySQL Community Server (GPL)
-- Server OS:                    Win32
-- HeidiSQL Version:             9.1.0.4867
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Dumping database structure for spotify
CREATE DATABASE IF NOT EXISTS `spotify` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `spotify`;


-- Dumping structure for table spotify.artists
CREATE TABLE IF NOT EXISTS `artists` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `date_of_birth` date NOT NULL,
  `genre` varchar(50) NOT NULL,
  UNIQUE KEY `artist_id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COMMENT='artists';

-- Dumping data for table spotify.artists: ~4 rows (approximately)
/*!40000 ALTER TABLE `artists` DISABLE KEYS */;
INSERT INTO `artists` (`id`, `first_name`, `last_name`, `date_of_birth`, `genre`) VALUES
	(1, 'string', 'string', '2011-10-10', 'string'),
	(5, 'string', 'string', '2000-02-02', 'string'),
	(6, 'string', 'string', '2000-02-02', 'string'),
	(7, 'string', 'string', '2000-02-02', 'string');
/*!40000 ALTER TABLE `artists` ENABLE KEYS */;


-- Dumping structure for table spotify.songs
CREATE TABLE IF NOT EXISTS `songs` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date_of_song_creation` date NOT NULL,
  `fk_artist_id` int(11) NOT NULL,
  `duration_in_seconds` int(11) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  UNIQUE KEY `song_id` (`id`),
  KEY `fk_artist_id` (`fk_artist_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- Dumping data for table spotify.songs: ~2 rows (approximately)
/*!40000 ALTER TABLE `songs` DISABLE KEYS */;
INSERT INTO `songs` (`id`, `date_of_song_creation`, `fk_artist_id`, `duration_in_seconds`, `name`) VALUES
	(2, '2011-02-04', 2, 400, 'baba qga'),
	(8, '2011-05-05', 1, 10, 'aaa');
/*!40000 ALTER TABLE `songs` ENABLE KEYS */;


-- Dumping structure for table spotify.users
CREATE TABLE IF NOT EXISTS `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `date_of_birth` date DEFAULT NULL,
  `is_paid` enum('true','false') NOT NULL,
  UNIQUE KEY `user_id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COMMENT='users';

-- Dumping data for table spotify.users: ~3 rows (approximately)
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` (`id`, `first_name`, `last_name`, `date_of_birth`, `is_paid`) VALUES
	(9, 'string', 'string', '2011-05-15', 'true'),
	(10, 'mama', 'sita', '2008-11-11', 'true'),
	(16, 'string', 'string', '2000-05-05', 'true');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
