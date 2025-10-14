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

import com.restapi.model.CategoriaEntity;
import com.restapi.repository.CategoriaRepository;

@RestController
@RequestMapping("/categorie")
public class CategoriaController {
	private final CategoriaRepository repository;

	public CategoriaController(CategoriaRepository repository) {
		this.repository = repository;
	}
	
	// nome end-point e metodi HTTP
	// GET /categorie
	@GetMapping
	public List<CategoriaEntity> findAll() {
		return repository.findAll();
	}
	
	// GET /categorie/{id}
	@GetMapping("/{id}")
	public ResponseEntity<CategoriaEntity>findById(@PathVariable Long id) {
		return repository.findById(id)
				.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
	}
	
	// POST /categorie
	@PostMapping
	public CategoriaEntity create(@RequestBody CategoriaEntity nuovaCategoria) {
		return repository.save(nuovaCategoria);
	}
	
	// PUT /categorie/{id}
	@PutMapping("/{id}")
	  public ResponseEntity<CategoriaEntity> update(@PathVariable Long id, @RequestBody CategoriaEntity aggiornato) {
        return repository.findById(id)
                .map(esistente -> {
                    esistente.setDescrizione(aggiornato.getDescrizione());
                    esistente.setCorsi(aggiornato.getCorsi()); // se presente
                    return ResponseEntity.ok(repository.save(esistente));
                })
                .orElse(ResponseEntity.notFound().build());
    }
	
	  // DELETE /categoria/{id}
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

}
