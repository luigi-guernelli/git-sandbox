-- Prezzo medio:
SELECT AVG(prezzo) AS prezzo_medio FROM prodotti;

-- Prodotto meno caro:
SELECT * FROM prodotti ORDER BY prezzo ASC LIMIT 1;

-- Prodotto piu caro:
SELECT * FROM prodotti ORDER BY prezzo DESC LIMIT 1;
