CREATE TABLE `inventory_transaction` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'The inventory transaction id',
  `itemid` int(11) NOT NULL COMMENT 'The item id',
  `locationid` int(11) NOT NULL,
  `userid` int(11) NOT NULL,
  `txntype` char(3) NOT NULL DEFAULT 'DEC',
  `qty` int(11) NOT NULL,
  `timestamp` timestamp NOT NULL
 ) 
 
 
CREATE TABLE `item` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `description` tinytext,
  `upc` varchar(45) NOT NULL
)


CREATE TABLE `warehouse` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `description` tinytext,
  `address1` varchar(45) DEFAULT NULL,
  `address2` varchar(45) DEFAULT NULL,
  `city` varchar(25) DEFAULT NULL,
  `state` char(2) DEFAULT NULL,
  `zip` varchar(10) DEFAULT NULL
)

