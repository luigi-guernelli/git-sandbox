package com.restapi.model;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.CascadeType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/** Rappresenta uno studente
 * @id, @GeneratedValue: id generato automaticamente
 * descrizione come campo testuale
 */

@jakarta.persistence.Entity
@Table(name="profili")
@JsonIdentityInfo(
	    generator = ObjectIdGenerators.PropertyGenerator.class,
	    property = "id") // L'attributo identificativo
public class ProfiloEntity {
	
	// Attributi
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private Long id;
	 private String descrizione;
	 
//	 @OneToOne(cascade = CascadeType.ALL) // tabella che si referenzia da sola
//	 @JoinColumn(name = "profilo_id", referencedColumnName = "id")
//	 private ProfiloEntity profilo;
	
	// Costruttore vuoto per JPA (obbligatorio)
	public ProfiloEntity() {/*vuoto*/}
	
	// Costruttore completo (senza id che viene generato)
	public ProfiloEntity (String descrizione) {
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

//	public ProfiloEntity getProfilo() {
//		return profilo;
//	}
//
//	public void setProfilo(ProfiloEntity profilo) {
//		this.profilo = profilo;
//	}

}
