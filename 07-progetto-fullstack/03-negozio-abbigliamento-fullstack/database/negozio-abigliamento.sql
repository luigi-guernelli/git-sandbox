create database negozio_abbigliamento;
select * from abito;
USE negozio_abbigliamento;
INSERT INTO abito (dtype, marca, prezzo, taglia, tipo, lunghezza_manica, materiale, fit) VALUES
('AbitoEntity', 'Armani', 149.99, 'M', 'CAMICIA', 'LUNGA', 'COTONE', 'SLIM'),
('AbitoEntity', 'Levi’s', 89.99, 'L', 'PANTALONE', null, 'DENIM', 'REGULAR'),
('AbitoEntity', 'Gucci', 299.99, 'S', 'GIACCA', 'LUNGA', 'LANA', 'SLIM'),
('AbitoEntity', 'Zara', 59.99, 'M', 'MAGLIONE', 'LUNGA', 'COTONE', 'REGULAR'),
('AbitoEntity', 'H&M', 39.99, 'S', 'PANTALONE', null, 'POLIESTERE', 'SLIM');