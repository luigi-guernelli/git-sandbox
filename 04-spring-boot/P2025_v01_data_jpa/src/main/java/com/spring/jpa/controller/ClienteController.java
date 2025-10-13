package com.spring.jpa.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.jpa.model.ClienteEntity;
import com.spring.jpa.repository.ClienteRepository;

@RestController
@RequestMapping("/clienti")
public class ClienteController {
	
	private final ClienteRepository clienteRepository;
	
	public ClienteController(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	// GET - lista clienti
	@GetMapping
	public List<ClienteEntity> getyAllClienti() {
		return clienteRepository.findAll();
	}
	
	// GET - singolo cliente
	@GetMapping("/{id}")
	public ClienteEntity getClienteById(@PathVariable Long id) {
		return clienteRepository.findById(id).orElse(null);
	}
	
	// POST - aggiungi cliente
	@PostMapping
	public ClienteEntity addCliente(@RequestBody ClienteEntity cliente) {
		return clienteRepository.save(cliente);
	}
	
	// DELETE - elimina cliente	
	@DeleteMapping("/{id}")
	public void deleteCliente(@PathVariable Long id) {
		clienteRepository.deleteById(id);
	}

}
