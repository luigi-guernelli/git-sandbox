package com.concessionaria.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("FURGONE")
public class Furgone extends Veicolo{
	public Furgone() {}
	

	public Furgone(Long id,String modello, String marca, String codiceImmatricolazione,
			String dataImmatricolazione, double prezzo) {
		super(id, modello, marca, codiceImmatricolazione, dataImmatricolazione, prezzo);
		}	

}