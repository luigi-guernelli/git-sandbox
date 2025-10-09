package com.concessionaria.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("AUTOMOBILE")
public class Automobile extends Veicolo{
	public Automobile() {}
	public Automobile(Long id, String modello, String marca, String codiceImmatricolazione,
			String dataImmatricolazione, double prezzo) {
		super(id, modello, marca, codiceImmatricolazione, dataImmatricolazione, prezzo);
		}	

}
