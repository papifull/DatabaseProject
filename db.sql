

CREATE DATABASE IF NOT EXISTS dataLoader;
USE dataLoader;


CREATE TABLE `utilisateur` (

 `id` INT PRIMARY KEY ,
 `nom` VARCHAR(255) NOT NULL,
 `prenom` VARCHAR(255) NOT NULL

);

CREATE TABLE `fichier` (

 `lien` VARCHAR(1024) ,
 `date` DATE

);



CREATE TABLE `date` (

 `id` DATE PRIMARY KEY,
  `nombre_test` INT,
  `nombre_de_cas_commune` INT,
  `nombre_de_cas_gueris` INT,
  `nombre_de_cas_importes` INT,
  `nombre_de_cas_positif` INT,
  `nombre_de_deces` INT,
  `nombre_de_contact` INT

);


CREATE TABLE `localite` (

 `position_de_localite` VARCHAR(255),
 `nom` VARCHAR(255),
 `nombre_de_cas` INT,
 `date` DATE

);