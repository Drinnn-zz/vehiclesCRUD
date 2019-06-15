# vehiclesCRUD
Rest API utilizando Springboot

# Instruções:
-> Rodar o seguinte script para a criaçã da base de dados:
-- -----------------------------------------------------
-- Schema vehicles_crud
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `vehicles_crud` DEFAULT CHARACTER SET utf8 ;
USE `vehicles_crud` ;

-- -----------------------------------------------------
-- Table `vehicles_crud`.`Vehicle_Types`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `vehicles_crud`.`Vehicle_Types` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  `description` VARCHAR(150) NOT NULL,
  PRIMARY KEY (`id`));


-- -----------------------------------------------------
-- Table `vehicles_crud`.`Vehicles`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `vehicles_crud`.`Vehicles` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  `description` VARCHAR(150) NULL,
  `plate` VARCHAR(45) NULL,
  `vehicle_type` INT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_vehicle_type_idx` (`vehicle_type` ASC) VISIBLE,
  CONSTRAINT `fk_vehicle_type`
    FOREIGN KEY (`vehicle_type`)
    REFERENCES `vehicles_crud`.`Vehicle_Types` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
    
    
-> Mudar as configurações no application.properties
	
-> Dar Start na Aplicação
	
	
