create database `test` ;

use test;

CREATE TABLE tb_user (
	id INT(6) NOT NULL AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(30) NOT NULL
);

INSERT INTO tb_user (name) VALUES ("DONG");
INSERT INTO tb_user (name) VALUES ("CHUAN");
INSERT INTO tb_user (name) VALUES ("DOUBI");