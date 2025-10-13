package com.guernelli.test.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

/**
 * Documentazione: TestEntity.java .model: classe che rappresenta una tabella del database 
 * (@Entity: entità nel databaase) 
 * (@Id: indica il campo della chiave primaria)
 * (@GenerateValue: genera automaticamente un ID univoco)
 * 
 * (@OneToOne: indica che il rapporto e "uno a uno")
 * (@JoinColumn: )
 */

@Entity
public class TestEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	// Attributi
	private String nome;
	private String descrizione;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name= "dettaglio_id", referencedColumnName = "id")
	private DettaglioTestEntity dettaglio;

	// Costruttori
	public TestEntity() {
		/* vuoto */}

	public TestEntity(String nome, String descrizione, DettaglioTestEntity dettaglio) {
		this.nome = nome;
		this.descrizione = descrizione;
		this.dettaglio = dettaglio;
	}
	
	// Getter e Setter
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public DettaglioTestEntity getDettaglio() {
		return dettaglio;
	}

	public void setDettaglio(DettaglioTestEntity dettaglio) {
		this.dettaglio = dettaglio;
	}
	
	
}
