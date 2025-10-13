package com.guernelli.restapidemo.controller;

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

import com.guernelli.restapidemo.dto.UtenteDTO;
import com.guernelli.restapidemo.service.UtenteService;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Positive;
import lombok.RequiredArgsConstructor;

/**
 * Documentazione: UtenteController.java
 *
 * @RestController -> indica che la classe espone REST API in automatico
 *                 aggiunge @ResponseBody
 * 
 *                 @RequestMapping("/api/utenti") -> Imposta il path baseper
 *                 tutte le rotte
 * 
 * 
 * @RequiredArgsConstructor -> Crea un costruttore con i campi finali o
 *                          annotati @NotNull
 * Test con POSTMAN - CRUD
 * http://localhost:8080/api/utenti
 * METODO			URL						BODY(JSON)								DESCRIZIONE
 * GET				/api/utenti				-										Lista utenti da mostrare
 * GET				/api/utenti/1			-										Ottieni utente per ID

 * POST				/api/utenti				{ "nome": "Luigi", 						Crea utente
 * 											  "email": "lui@email.it",
 * body raw-json da inserire->   			  "dataNascita": "2000-01-01" } 
 * 
 * PUT				/api/utenti/1			(come la post)							Aggiorna utente
 * DELETE			/api/utenti/1			-										Elimina utente
 */

@RestController
@RequestMapping("/api/utenti")
@RequiredArgsConstructor
public class UtenteController {

	private final UtenteService utenteService;

	@GetMapping
	public List<UtenteDTO> getAll() {
		return utenteService.trovaTutti();
	}

	@GetMapping("/{id}")
	public UtenteDTO getById(@PathVariable Long id) {
		return utenteService.trovaPerId(id);
	}

	@PostMapping
	public ResponseEntity<UtenteDTO> crea(@Valid @RequestBody UtenteDTO dto) {
		return ResponseEntity.ok(utenteService.crea(dto));
	}

	@PutMapping("/{id}")
	public UtenteDTO aggiorna(@PathVariable Long id, @Valid @RequestBody UtenteDTO dto) {
		return utenteService.aggiorna(id, dto);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> elimina(@PathVariable Long id) {
		utenteService.elimina(id);
		return ResponseEntity.noContent().build();
	}
}
