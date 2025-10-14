package com.restapi.model;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/** Rappresenta un docente
 * @id, @GeneratedValue: id generato automaticamente
 * descrizione come campo testuale
 */

@jakarta.persistence.Entity
@Table(name="docenti")
@JsonIdentityInfo(
	    generator = ObjectIdGenerators.PropertyGenerator.class,
	    property = "id") // L'attributo identificativo
public class DocenteEntity {
	
	// Attributi
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private Long id;
	 private String nome;
	 private String cognome;
	 
	 @OneToMany(mappedBy = "docente")
	 private List<CorsoEntity> corsi;

	
	// Costruttore vuoto per JPA (obbligatorio)
	public DocenteEntity() {/*vuoto*/}
	
	// Costruttore completo (senza id che viene generato)
	public DocenteEntity (String nome, String cognome) {
	this.nome=nome;
	this.cognome=cognome;
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

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public List<CorsoEntity> getCorsi() {
		return corsi;
	}

	public void setCorsi(List<CorsoEntity> corsi) {
		this.corsi = corsi;
	}


	

}
