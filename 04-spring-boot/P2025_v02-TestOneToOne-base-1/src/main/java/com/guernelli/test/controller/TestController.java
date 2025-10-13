package com.guernelli.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guernelli.test.model.TestEntity;
import com.guernelli.test.repository.TestRepository;

/** Documentazione: TestController.java
 * Questa classe e il cuore dell'API RESTI
 * Il controller gestisce le  API e le richieste HTTP
 * I metodi HTTP sono: (POST-GET-UPDATE-DELETE)
 * 
 * (@RestController: annotation di Spring-> gestisce le richieste HTTP)
 * (@RequestMapping("/api/test": deifinisce l'URL dell'API))
 * 
 * (@Autowired: annotazione di Spring che automaticca l'iniezzione delle dipendenze)
 * -> in pratica inserisce in automatico le istanze di oggetti (bean
 * 
 * (@GetMapping: mappa specifici metodi HTTP)
 * (@PostMapping: mappa specifici metodi HTTP)
 * (@DeleteMapping("/{id}"):: mappa specifici metodi HTTP puntando all' ID)
 * 
 * (@RequestBody: Legge il corpo delle richieste come oggetto)
 */

@RestController
@RequestMapping("/api/test")
public class TestController {
	
	@Autowired
	private TestRepository testRepository;
	
	@GetMapping
	public List<TestEntity> getAll(){
		return testRepository.findAll();
		
	}
	
	@PostMapping
	public TestEntity create(@RequestBody TestEntity nuovoTest) {
		return testRepository.save(nuovoTest);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		testRepository.deleteById(id);
	}

}
