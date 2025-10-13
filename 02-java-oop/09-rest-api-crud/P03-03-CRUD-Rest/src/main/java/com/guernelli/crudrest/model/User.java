package com.guernelli.crudrest.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


/** Documentazione: CRUD-REST
 * 1. Crea un progetto Spring Boot selezionando le dipendenze:
 * Spring Web / Spring Data JPA / H2 Database / Spring Dev tool (facoltativo)
 * 2. Fase Configura il database H2 nelle application properties copia il codice per accedere all'interfaccia da browser
 * 3. Crea i package: /model /controller /service /repository
 * 
 * @Entity -> trasforma la classe in una tabella DATABASE
 * @ID - @GeneratedValue -> ID generato automaticamente
 * 
 * Esegui il progetto
 * 1. Tasto destro sul progetto -> Run As -> Spring Boot App
 * 2. Vai su http://localhost:8080/h2-console
 * 3. JDBC URL: jdbc:h2:mem:testdb
 * 
 * Test delle API con POSTMAN o cURL (terminale)
 * GET http://localhost:8080/api/users → Mostra utenti
 * POST http://localhost:8080/api/users con JSON body:
 * 
 * Usare @Table(name="...")
 * Evita conflitti con parole riservate come ad es.(users)
 * Pieno controllo sul nome reale nel database
 * Rende il progetto più portabile tra database diversi
 */
@Entity
@Table(name="users") //<-- nome alternativo, evita conflitti. Spring non legge il parametro users essendo una parola riservata
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private String email;
	
	
	// Costruttore vuoto riconosciuto da Spring Boot
	public User() {}
	
	public User(String nome, String email) {
		this.nome=nome;
		this.email=email;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

	
	
	
}
