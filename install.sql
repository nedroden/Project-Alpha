CREATE TABLE pa_settings (
  `key` varchar(255) NOT NULL,
  `value` text NOT NULL
);

CREATE TABLE `pa_users` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `username` tinytext NOT NULL,
  `password` tinytext NOT NULL,
  `rank` int(11) NOT NULL DEFAULT '2',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `pa_users` (`ID`, `name`, `password`, `rank`) VALUES
(1,	'root',	'5e884898da28047151d0e56f8dc6292773603d0d6aabbdd62a11ef721d1542d8',	0);

CREATE TABLE `pa_clients` (
  `ID` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `first_name` text NOT NULL,
  `last_name` text NOT NULL,
  `email` text NOT NULL,
  `phone` int NOT NULL,
  `mobile` int NOT NULL,
  `address` text NOT NULL,
  `ZIP` varchar(10) NOT NULL,
  `city` text NOT NULL,
  `state` text NOT NULL,
  `country` text NOT NULL
);

CREATE TABLE `pa_reservations` (
`ID` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
`client` int NOT NULL,
`date_in` date NOT NULL,
`date_out` date NOT NULL,
`room` int,
`room_type_id` int,
`comments` text,
`status` int NOT NULL
);

CREATE TABLE `pa_rooms` (
`ID` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
`number` int NOT NULL,
`room_type_id` int NOT NULL,
`status` int NOT NULL
);