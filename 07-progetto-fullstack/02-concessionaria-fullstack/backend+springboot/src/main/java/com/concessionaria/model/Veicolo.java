package com.concessionaria.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name = "veicoli")
public abstract class Veicolo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
    @Enumerated(EnumType.STRING)
    @Column(name = "tipo")
    private TipoVeicolo tipo;
	
	private String modello;
	private String marca;

	@Column(name = "codice_immatricolazione")
	private String codiceImmatricolazione;

	@Column(name = "data_immatricolazione")
	private String dataImmatricolazione;
	
	private double prezzo;
	
	public Veicolo () {};

	public Veicolo(Long id, String modello, String marca, String codiceImmatricolazione,
			String dataImmatricolazione, double prezzo) {
		super();
		this.id = id;
		this.modello = modello;
		this.marca = marca;
		this.codiceImmatricolazione = codiceImmatricolazione;
		this.dataImmatricolazione = dataImmatricolazione;
		this.prezzo = prezzo;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCodiceImmatricolazione() {
		return codiceImmatricolazione;
	}

	public void setCodiceImmatricolazione(String codiceImmatricolazione) {
		this.codiceImmatricolazione = codiceImmatricolazione;
	}

	public String getDataImmatricolazione() {
		return dataImmatricolazione;
	}

	public void setDataImmatricolazione(String dataImmatricolazione) {
		this.dataImmatricolazione = dataImmatricolazione;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		return "Veicolo [id=" + id + ", modello=" + modello + ", marca=" + marca
				+ ", codiceImmatricolazione=" + codiceImmatricolazione + ", dataImmatricolazione="
				+ dataImmatricolazione + ", prezzo=" + prezzo + "]";
	}
	
	
	
	

}
