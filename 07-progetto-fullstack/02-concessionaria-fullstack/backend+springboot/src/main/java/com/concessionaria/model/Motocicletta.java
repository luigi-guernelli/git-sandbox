package com.concessionaria.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("MOTOCICLETTA")
public class Motocicletta extends Veicolo{
	public Motocicletta() {}

	public Motocicletta(Long id, String modello, String marca, String codiceImmatricolazione,
			String dataImmatricolazione, double prezzo) {
		super(id, modello, marca, codiceImmatricolazione, dataImmatricolazione, prezzo);
		}	
	

	}
