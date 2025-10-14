package com.restapi.model;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/** Rappresenta una categoria
 * @id, @GeneratedValue: id generato automaticamente
 * descrizione come campo testuale
 */

@jakarta.persistence.Entity
@Table(name="categorie")
@JsonIdentityInfo(
	    generator = ObjectIdGenerators.PropertyGenerator.class,
	    property = "id") // L'attributo identificativo
public class CategoriaEntity {
	
	// Attributi
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private Long id;
	 private String descrizione;
	 
	 @OneToMany(mappedBy="categoria")
	 private List<CorsoEntity> corsi; // Relazione bidirezionale
	 
	
	// Costruttore vuoto per JPA (obbligatorio)
	public CategoriaEntity(){/*vuoto*/}
	
	// Costruttore completo (senza id che viene generato)
	public CategoriaEntity(String descrizione) {
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
	
	// Getter e Setter Corsi
	public List<CorsoEntity> getCorsi() {
		return corsi;
	}

	 public void setCorsi(List<CorsoEntity> corsi) {
		 this.corsi = corsi;
	 }
	

}
