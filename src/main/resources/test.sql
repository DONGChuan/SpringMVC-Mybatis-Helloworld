create database `test` ;

use test;

CREATE TABLE hello (
	id INT(6) NOT NULL AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(30) NOT NULL
);

INSERT INTO hello (name) VALUES ("DONG");
INSERT INTO hello (name) VALUES ("CHUAN");
INSERT INTO hello (name) VALUES ("DOUBI");

select * from hello;