package com.guernelli.test.repository;
/** Documentazione: TestRepository.java
 * Questa interfaccia estende JpaRepository, una libreria che restituisce
 * restituisce metodi già pronti come:
 * .save(): per salvare un oggetto
 * .findAll(): per leggere tutti gli oggetti
 * .deletedById(id): per canncellare gli oggetti puntati a un ID
 * implementati da Spring senza scrivere codice.
 */
import org.springframework.data.jpa.repository.JpaRepository;

import com.guernelli.test.model.TestEntity;

public interface TestRepository extends JpaRepository<TestEntity, Long> {
	
	// CRUD già pronti

}
