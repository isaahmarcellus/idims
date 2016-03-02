
-- inventory_transaction

INSERT INTO `idims`.`inventory_transaction` (`id`,`itemid`,`locationid`,`userid`,`txntype`,`qty`,`timestamp`)
VALUES (,1,5,1,'INC',200, CURRENT_TIMESTAMP);

INSERT INTO `idims`.`inventory_transaction` (`id`,`itemid`,`locationid`,`userid`,`txntype`,`qty`,`timestamp`)
VALUES (,2,5,1,'INC',200, CURRENT_TIMESTAMP);

INSERT INTO `idims`.`inventory_transaction` (`id`,`itemid`,`locationid`,`userid`,`txntype`,`qty`,`timestamp`)
VALUES (,1,5,1,'DEC',1, CURRENT_TIMESTAMP);

INSERT INTO `idims`.`inventory_transaction` (`id`,`itemid`,`locationid`,`userid`,`txntype`,`qty`,`timestamp`)
VALUES (,2,5,1,'DEC',1, CURRENT_TIMESTAMP);


-- location

INSERT INTO `warehouse` 
VALUES (5,'GroundZero','The Los Angeles office/warehouse',NULL,NULL,'Los Angeles','CA',NULL),(6,'SatelliteOne','The Atlanta warehouse better know as the Haynes basement','1210 Spring Branch Court',NULL,'Lawrenceville','GA','30045'),(7,'JackTravis','The main warehouse at Jack Travis','236 East Pima St',NULL,'Phoenix','AZ',NULL);


-- items

INSERT INTO `item` 
VALUES (1,'12-pk-cranberry-8-4oz-can','12 Pk Cranberry - 8.4oz can','C-10220-12C'),(2,'12-pk-citrus-8-4oz-can','12 Pk Citrus - 8.4oz can','C-10221-12C');


