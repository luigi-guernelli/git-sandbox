package com.restapi.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.model.DocenteEntity;
import com.restapi.repository.DocenteRepository;

@RestController
@RequestMapping("/docenti")
public class DocenteController {
	private final DocenteRepository repository;

	public DocenteController(DocenteRepository repository) {
		this.repository = repository;
	}
	
	// nome end-point e metodi HTTP
	// GET /docenti
	@GetMapping
	public List<DocenteEntity> findAll() {
		return repository.findAll();
	}
	
	// GET /docenti/{id}
	@GetMapping("/{id}")
	public ResponseEntity<DocenteEntity> findById(@PathVariable Long id) {
	return repository.findById(id)
			.map(ResponseEntity::ok)
			.orElse(ResponseEntity.notFound().build());
	}
	
	// POST /docenti
	@PostMapping
	public DocenteEntity create(@RequestBody DocenteEntity nuovoDocente) {
		return repository.save(nuovoDocente);
	}
	
	// PUT /docenti
	@PutMapping("/{id}")
	public ResponseEntity<DocenteEntity> update(@PathVariable Long id, @RequestBody DocenteEntity aggiornato) {
	    return repository.findById(id)
                .map(esistente -> {
                    esistente.setNome(aggiornato.getNome());
                    esistente.setCognome(aggiornato.getCognome());
                    // esistente.setCorsi(aggiornato.getCorsi()); // se presente
                    return ResponseEntity.ok(repository.save(esistente));
                })
                .orElse(ResponseEntity.notFound().build());
}
}
