package com.guernelli.test.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class DettaglioTestEntity {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String autore;
	    private String note;

	    @OneToOne(mappedBy = "dettaglio")
	    @JsonBackReference // evita loop infiniti nella serializzazione JSON
	    private TestEntity test;

	    public DettaglioTestEntity() {}

	    public DettaglioTestEntity(String autore, String note) {
	        this.autore = autore;
	        this.note = note;
	    }

	    // Getter e Setter
	    public Long getId() { return id; }

	    public String getAutore() { return autore; }

	    public void setAutore(String autore) { this.autore = autore; }

	    public String getNote() { return note; }

	    public void setNote(String note) { this.note = note; }

	    public TestEntity getTest() { return test; }

	    public void setTest(TestEntity test) { this.test = test; }
	}