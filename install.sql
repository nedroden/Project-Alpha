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