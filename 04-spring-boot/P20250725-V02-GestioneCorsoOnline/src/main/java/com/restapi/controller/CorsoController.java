package com.restapi.controller;

import java.util.List;
import com.restapi.repository.DocenteRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.model.CorsoEntity;
import com.restapi.repository.CorsoRepository;

@RestController
@RequestMapping("/corsi")
public class CorsoController {

    private final DocenteRepository docenteRepository;
	private final CorsoRepository repository;

	public CorsoController(CorsoRepository repository, DocenteRepository docenteRepository) {
		this.repository = repository;
		this.docenteRepository = docenteRepository;
	}
	
	// nome end-point e metodi HTTP
	// GET /categorie
	@GetMapping
	public List<CorsoEntity> findAll() {
		return repository.findAll();
	}
	
	// GET /categorie/{id}
	@GetMapping("/{id}")
	public ResponseEntity<CorsoEntity>findById(@PathVariable Long id) {
		return repository.findById(id)
				.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
	}
	
	// POST /categorie
	@PostMapping
	public CorsoEntity create(@RequestBody CorsoEntity nuovaCorso) {
		return repository.save(nuovaCorso);
	}
	
	// PUT /categorie/{id}
	@PutMapping("/{id}")
	  public ResponseEntity<CorsoEntity> update(@PathVariable Long id, @RequestBody CorsoEntity aggiornato) {
        return repository.findById(id)
                .map(esistente -> {
                    esistente.setDescrizione(aggiornato.getDescrizione());
                    esistente.setDocente(aggiornato.getDocente()); // se presente
                    esistente.setCategoria(aggiornato.getCategoria());
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

	public DocenteRepository getDocenteRepository() {
		return docenteRepository;
	}

}
