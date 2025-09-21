package com.concessionaria.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.concessionaria.model.Automobile;
import com.concessionaria.model.Furgone;
import com.concessionaria.model.Motocicletta;
import com.concessionaria.model.TipoVeicolo;
import com.concessionaria.model.Veicolo;
import com.concessionaria.repository.VeicoloRepository;

@Service
public class VeicoloService {
	private final VeicoloRepository repository;

	public VeicoloService(VeicoloRepository repository) {
		this.repository = repository;
	}

	// Restituisce tutti i veicoli
	public List<Veicolo> getAll() {
		return repository.findAll();
	}

	// Ricerca per tipo
	public List<Veicolo> getByTipo(String tipo) {
	    switch(tipo.toUpperCase()) {
	        case "AUTOMOBILE":
	            return repository.findByTipo(Automobile.class);
	        case "MOTOCICLETTA":
	            return repository.findByTipo(Motocicletta.class);
	        case "FURGONE":
	            return repository.findByTipo(Furgone.class);
	        default:
	            return List.of(); // lista vuota se tipo non valido
	    }
	}

	// Ricerca per marca
	public List<Veicolo> getByMarca(String marca) {
		return repository.findByMarca(marca);
	}

	// Inserimento nuovo veicolo
	public Veicolo save(Veicolo v) {
		return repository.save(v);
	}

	// Prezzo medio di tutti i veicoli
	public double calcolaPrezzoMedio() {
		return repository.findAll().stream()
				.mapToDouble(Veicolo::getPrezzo)
				.average()
				.orElse(0.0);
	}

	// Veicolo meno caro
	public Veicolo veicoloMenoCaro() {
		return repository.findAll().stream()
				.min((v1, v2) -> Double.compare(v1.getPrezzo(), v2.getPrezzo()))
				.orElse(null);

	}

	// Prezzo medio per marca
	public double prezzoMedioPerMarca(String marca) {
		return repository.findByMarca(marca).stream()
				.mapToDouble(Veicolo::getPrezzo)
				.average().orElse(0.0);
	}
	
	// Recupero veicolo per ID
	public Veicolo getById(Long id) {
		return repository.findById(id).orElse(null); // restituisce null se non esiste
	}
	
	// Eliminazione veicolo per ID
	public void deleteById(Long id) {
		repository.deleteById(id);
	}

}
