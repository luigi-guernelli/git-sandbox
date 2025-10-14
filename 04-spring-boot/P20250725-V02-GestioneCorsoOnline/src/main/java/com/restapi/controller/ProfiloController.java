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

import com.restapi.model.ProfiloEntity;
import com.restapi.repository.ProfiloRepository;

@RestController
@RequestMapping("/profili")
public class ProfiloController {
	private final ProfiloRepository repository;

	public ProfiloController(ProfiloRepository repository) {
		this.repository = repository;
	}
	
	// nome end-point e metodi HTTP
	// GET /categorie
	@GetMapping
	public List<ProfiloEntity> findAll() {
		return repository.findAll();
	}
	
	// GET /categorie/{id}
	@GetMapping("/{id}")
	public ResponseEntity<ProfiloEntity>findById(@PathVariable Long id) {
		return repository.findById(id)
				.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
	}
	
	// POST /categorie
	@PostMapping
	public ProfiloEntity create(@RequestBody ProfiloEntity nuovaCategoria) {
		return repository.save(nuovaCategoria);
	}
	
	// PUT /categorie/{id}
	@PutMapping("/{id}")
	  public ResponseEntity<ProfiloEntity> update(@PathVariable Long id, @RequestBody ProfiloEntity aggiornato) {
        return repository.findById(id)
                .map(esistente -> {
                    esistente.setDescrizione(aggiornato.getDescrizione());
                   // esistente.setProfilo(aggiornato.getProfilo()); // se presente mostra i costruttori nell'entity
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
