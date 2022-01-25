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

CREATE TABLE `pokedex`.`pokemons` (
  `id` INT NOT NULL,
  `nombre` VARCHAR(45) NULL,
  `tipo` VARCHAR(45) NULL,
  `altura` DOUBLE NULL,
  `peso` DOUBLE NULL,
  `categoria` VARCHAR(45) NULL,
  `habilidad` VARCHAR(45) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `nombre_UNIQUE` (`nombre` ASC) VISIBLE);

INSERT INTO `pokedex`.`pokemons` (`id`, `nombre`, `tipo`, `altura`, `peso`, `categoria`, `habilidad`) 
VALUES ('1', 'Bulbasur', 'Planta', '0.5', '9', 'Tortuguita', 'Torrente');

INSERT INTO `pokedex`.`pokemons` (`id`, `nombre`, `tipo`, `altura`, `peso`, `categoria`, `habilidad`) 
Values ('2', 'Charmander', 'Fuego', '0.6', '8.5', 'Lagartija', 'Mar llamas');

select * from pokemons;