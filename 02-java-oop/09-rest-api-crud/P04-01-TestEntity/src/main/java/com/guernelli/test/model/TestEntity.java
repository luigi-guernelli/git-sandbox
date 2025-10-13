package com.guernelli.test.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Documentazione: TestEntity.java .model: classe che rappresenta una tabella
 * del database (@Entity: entità nel databaase) (@Id: indica il campo della
 * chiave primaria) (@GenerateValue: genera automaticamente un ID univoco)
 */

@Entity
public class TestEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	// Attributi
	private String nome;
	private String descrizione;

	// Costruttori
	public TestEntity() {
		/* vuoto */}

	public TestEntity(String nome, String descrizione) {
		this.nome = nome;
		this.descrizione = descrizione;
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
	
	


}
