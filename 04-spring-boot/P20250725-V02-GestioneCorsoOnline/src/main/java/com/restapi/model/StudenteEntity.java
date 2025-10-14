package com.restapi.model;




import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


/** Rappresenta uno studente
 * @id, @GeneratedValue: id generato automaticamente
 * descrizione come campo testuale
 */

@jakarta.persistence.Entity
@Table(name="studenti")
@JsonIdentityInfo(
	    generator = ObjectIdGenerators.PropertyGenerator.class,
	    property = "id") // L'attributo identificativo
public class StudenteEntity {
	
	// Attributi
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private Long id;
	 private String nome;
	 private String cognome;
	 
	 @OneToOne
	 @JoinColumn(name="profilo_id")
	 private ProfiloEntity profilo;
	
	 // Tipo di relazione JPA
	  @ManyToMany
	    @JoinTable(
	        name = "studente_corso",
	        joinColumns = @JoinColumn(name = "studente_id"),
	        inverseJoinColumns = @JoinColumn(name = "corso_id")
	    )
	    private List<CorsoEntity> corsi;
	 
	// Costruttore vuoto per JPA (obbligatorio)
	public StudenteEntity() {/*vuoto*/}
	
	// Costruttore completo (senza id che viene generato)
	public StudenteEntity (String nome, String cognome) {
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
	
	public String getCogome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public ProfiloEntity getProfilo() {
		return profilo;
	}

	public void setProfilo(ProfiloEntity profilo) {
		this.profilo = profilo;
	}

	public List<CorsoEntity> getCorsi() {
		return corsi;
	}

	public void setCorsi(List<CorsoEntity> corsi) {
		this.corsi = corsi;
	}
	

}
