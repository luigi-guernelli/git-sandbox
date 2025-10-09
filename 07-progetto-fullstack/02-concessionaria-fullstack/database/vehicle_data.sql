-- 	Automobile
USE concessionario;
INSERT INTO veicoli (dtype, modello, marca, codice_immatricolazione, data_immatricolazione, prezzo) VALUES
('AUTOMOBILE', 'Panda', 'Fiat', 'FIAT001', '2020-01-15', 10000.00),
('AUTOMOBILE', '500', 'Fiat', 'FIAT002', '2021-03-20', 12000.00),
('AUTOMOBILE', 'Golf', 'Volkswagen', 'VW001', '2019-05-10', 18000.00),
('AUTOMOBILE', 'Passat', 'Volkswagen', 'VW002', '2020-08-25', 25000.00),
('AUTOMOBILE', 'Clio', 'Renault', 'REN001', '2021-06-30', 14000.00),
('AUTOMOBILE', 'Megane', 'Renault', 'REN002', '2022-02-10', 19000.00),
('AUTOMOBILE', 'Focus', 'Ford', 'FORD001', '2018-09-05', 16000.00),
('AUTOMOBILE', 'Fiesta', 'Ford', 'FORD002', '2021-11-15', 13000.00),
('AUTOMOBILE', 'A3', 'Audi', 'AUDI001', '2019-07-12', 22000.00),
('AUTOMOBILE', 'A4', 'Audi', 'AUDI002', '2020-12-01', 28000.00);


-- Motocicletta
INSERT INTO veicoli (dtype, modello, marca, codice_immatricolazione, data_immatricolazione, prezzo) VALUES
('MOTOCICLETTA', 'Monster', 'Ducati', 'DUC001', '2019-06-01', 8000.00),
('MOTOCICLETTA', 'Panigale', 'Ducati', 'DUC002', '2021-04-12', 22000.00),
('MOTOCICLETTA', 'GSX-R1000', 'Suzuki', 'SUZ001', '2020-09-14', 15000.00),
('MOTOCICLETTA', 'Hayabusa', 'Suzuki', 'SUZ002', '2021-10-20', 18000.00),
('MOTOCICLETTA', 'MT-07', 'Yamaha', 'YAM001', '2018-08-30', 7000.00),
('MOTOCICLETTA', 'R1', 'Yamaha', 'YAM002', '2020-02-18', 19000.00),
('MOTOCICLETTA', 'Z900', 'Kawasaki', 'KAW001', '2019-11-05', 9500.00),
('MOTOCICLETTA', 'Ninja 650', 'Kawasaki', 'KAW002', '2021-12-07', 11000.00),
('MOTOCICLETTA', 'Bonneville', 'Triumph', 'TRI001', '2020-03-11', 12000.00),
('MOTOCICLETTA', 'Street Triple', 'Triumph', 'TRI002', '2022-06-02', 13500.00);

-- Furgoni
INSERT INTO veicoli (dtype, modello, marca, codice_immatricolazione, data_immatricolazione, prezzo) VALUES
('FURGONE', 'Transit', 'Ford', 'FORDV001', '2019-01-25', 15000.00),
('FURGONE', 'Custom', 'Ford', 'FORDV002', '2021-05-30', 18000.00),
('FURGONE', 'Ducato', 'Fiat', 'FIATV001', '2020-07-14', 20000.00),
('FURGONE', 'Scudo', 'Fiat', 'FIATV002', '2022-09-22', 22000.00),
('FURGONE', 'Vito', 'Mercedes', 'MERCV001', '2018-10-10', 25000.00),
('FURGONE', 'Sprinter', 'Mercedes', 'MERCV002', '2021-11-01', 30000.00),
('FURGONE', 'Transporter', 'Volkswagen', 'VWV001', '2019-06-19', 27000.00),
('FURGONE', 'Crafter', 'Volkswagen', 'VWV002', '2020-12-29', 32000.00),
('FURGONE', 'Master', 'Renault', 'RENV001', '2021-02-17', 24000.00),
('FURGONE', 'Trafic', 'Renault', 'RENV002', '2019-04-09', 21000.00);

