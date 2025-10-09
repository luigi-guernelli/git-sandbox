CREATE DATABASE concessionario;
USE concessionario;
DELETE FROM veicoli WHERE dtype IS NULL OR dtype = '';

SET SQL_SAFE_UPDATES = 1;


CREATE TABLE veicoli (
id bigint AUTO_INCREMENT PRIMARY KEY,
tipo ENUM('automobile','motocicletta','furgone') NOT NULL,
modello VARCHAR(50) NOT NULL,
marca VARCHAR(50) NOT NULL,
codice_immatricolazione VARCHAR(20) UNIQUE NOT NULL,
data_immatricolazione DATE NOT NULL,
prezzo DECIMAL(10,2) NOT NULL
);