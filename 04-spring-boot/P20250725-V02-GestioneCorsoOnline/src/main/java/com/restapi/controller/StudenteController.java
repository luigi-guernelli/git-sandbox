package com.restapi.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.model.StudenteEntity;
import com.restapi.repository.StudenteRepository;

@RestController
	@RequestMapping("/studenti")
	public class StudenteController {

	    private final StudenteRepository repository;

	    public StudenteController(StudenteRepository repository) {
	        this.repository=repository;
	    }

	    // GET /studenti
	    @GetMapping
	    public List<StudenteEntity> findAll() {
	        return repository.findAll();
	        }

	    // GET /studenti/{id}
	    @GetMapping("/{id}")
	    public ResponseEntity<StudenteEntity> findById(@PathVariable Long id) {
	        return repository.findById(id)
	                .map(ResponseEntity::ok)
	                .orElse(ResponseEntity.notFound().build());
	    }

	    // POST /studenti
	    @PostMapping
	    public StudenteEntity create(@RequestBody StudenteEntity nuovoStudente) {
			return repository.save(nuovoStudente);
	    }

	    // PUT /studenti/{id}
	    @PutMapping("/{id}")
	    public ResponseEntity<StudenteEntity> update(@PathVariable Long id, @RequestBody StudenteEntity aggiornato) {
	        return repository.findById(id)
	                .map(esistente -> {
	                    esistente.setNome(aggiornato.getNome());
	                    esistente.setCognome(aggiornato.getCogome());
	                    esistente.setProfilo(aggiornato.getProfilo());
	                    esistente.setCorsi(aggiornato.getCorsi());// se presente
	                    return ResponseEntity.ok(repository.save(esistente));
	                })
	                .orElse(ResponseEntity.notFound().build());
	    }

	    // DELETE /studenti/{id}
	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> delete(@PathVariable Long id) {
	        if (repository.existsById(id)) {
	            repository.deleteById(id);
	            return ResponseEntity.noContent().build();
	        }
	        return ResponseEntity.notFound().build();
	    }
	}
