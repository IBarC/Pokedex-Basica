create database Pokedex;
use pokedex;

CREATE TABLE `pokedex`.`users` (
  `idusers` INT NOT NULL AUTO_INCREMENT,
  `usersname` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  PRIMARY KEY (`idusers`),
  UNIQUE INDEX `usersname_UNIQUE` (`usersname` ASC) VISIBLE);

INSERT INTO `pokedex`.`users` (`usersname`, `password`) VALUES ('Irene', 'irene');
INSERT INTO `pokedex`.`users` (`usersname`, `password`) VALUES ('Patata', 'patata');
INSERT INTO `pokedex`.`users` (`usersname`, `password`) VALUES ('a', 'a');

select * from users;