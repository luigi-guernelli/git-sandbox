package com.jpa.mvcs.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.mvcs.model.ClienteEntity;
import com.jpa.mvcs.repository.ClienteRepository;
import com.jpa.mvcs.service.ClienteService;

@RestController
@RequestMapping("/clienti")
public class ClienteController {
	
	private final ClienteService clienteService;
	
	public ClienteController(ClienteService  clienteService) {
		this.clienteService = clienteService;
	}
	
	// GET - lista clienti
	@GetMapping
	public List<ClienteEntity> getyAllClienti() {
		return clienteService.getAllClienti();
	}
	
	// GET - singolo cliente
	@GetMapping("/{id}")
	public ClienteEntity getClienteById(@PathVariable Long id) {
		return clienteService.getClienteById(id);
	}
	
	// POST - aggiungi cliente
	@PostMapping
	public ClienteEntity addCliente(@RequestBody ClienteEntity cliente) {
		return clienteService.addCliente(cliente);
	}
	
	// DELETE - elimina cliente	
	@DeleteMapping("/{id}")
	public void deleteCliente(@PathVariable Long id) {
		clienteService.deleteCliente(id);
	}

}
