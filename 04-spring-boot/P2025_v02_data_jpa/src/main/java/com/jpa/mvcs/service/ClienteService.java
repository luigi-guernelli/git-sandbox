package com.jpa.mvcs.service;
/** Interfaccia del servizio
 * - Qui definiamo i metodi disponibili, senza implementazione
 * - Serve per mantenere il codice flessibile e testabile.
 */
import java.util.List;

import com.jpa.mvcs.model.ClienteEntity;

public interface ClienteService {
	List<ClienteEntity> getAllClienti();
	ClienteEntity getClienteById(Long id);
	ClienteEntity addCliente(ClienteEntity cliente);
	void deleteCliente(Long id);

}
