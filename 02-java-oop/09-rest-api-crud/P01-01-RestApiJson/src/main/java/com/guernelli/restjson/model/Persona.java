package com.guernelli.restjson.model;

/** Documentazione:
 *  1. Primo step: Crea un Progetto Spring > Dependencys: Spring Web / Spring Dev Tools
 *  2. Secondo step: Crea il modello json model>Persona.java 
 *  --------------------------------------------------------------------------------------------
 *    La classe Persona.java rappresenta l'oggetto dati
 * 	  Ogni volta che riceviamo o iniviamo JSON, Spring converte in un oggetto di tipo Persona
 */
public class Persona {

	// Attributi
	private String nome;
	private int eta;

	// Costruttore -vuoto richiesto d Spring per creare oggetti
	public Persona() {
	}

	public Persona(String nome, int eta) {
		this.nome = nome;
		this.eta = eta;
	}

	// Getter & Setter per leggere e modificare i valori
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}
	
	

}
