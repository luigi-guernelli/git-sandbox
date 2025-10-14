package com.restapi.model;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/** Rappresenta uno studente
 * @id, @GeneratedValue: id generato automaticamente
 * descrizione come campo testuale
 */

@jakarta.persistence.Entity
@Table(name="corsi")
@JsonIdentityInfo(
	    generator = ObjectIdGenerators.PropertyGenerator.class,
	    property = "id") // L'attributo identificativo
public class CorsoEntity {
	
	// Attributi
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private Long id;
	 private String descrizione;
	 
	// Entity Relationship m2o
	 // Ogni docente può insegnare piu corsi.
	 @ManyToOne
	 @JoinColumn(name="docente_id")
	 private DocenteEntity docente;
	 
	 // Ogni corso ha un docente e una categoria.
	 @ManyToOne
	 @JoinColumn(name="categoria_id")
	 private CategoriaEntity categoria;
	

	// Costruttore vuoto per JPA (obbligatorio)
	public CorsoEntity() {/*vuoto*/}
	
	// Costruttore completo (senza id che viene generato)
	public CorsoEntity (String descrizione) {
	this.descrizione=descrizione;
	}
	
	
	// Getter e Setter
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public DocenteEntity getDocente() {
		return docente;
	}

	public void setDocente(DocenteEntity docente) {
		this.docente = docente;
	}

	public CategoriaEntity getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaEntity categoria) {
		this.categoria = categoria;
	}
	

	
}
