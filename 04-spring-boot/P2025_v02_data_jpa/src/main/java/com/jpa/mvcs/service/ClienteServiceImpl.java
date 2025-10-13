package com.jpa.mvcs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jpa.mvcs.model.ClienteEntity;
import com.jpa.mvcs.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {
	private final ClienteRepository clienteRepository;
	
	public ClienteServiceImpl(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}

	@Override
	public List<ClienteEntity> getAllClienti() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClienteEntity getClienteById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClienteEntity addCliente(ClienteEntity cliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCliente(Long id) {
		// TODO Auto-generated method stub
		
	}
	
	

}
