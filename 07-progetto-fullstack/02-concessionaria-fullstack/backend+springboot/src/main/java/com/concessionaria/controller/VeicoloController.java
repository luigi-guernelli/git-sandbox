package com.concessionaria.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.concessionaria.model.TipoVeicolo;
import com.concessionaria.model.Veicolo;
import com.concessionaria.service.VeicoloService;

@RestController
@RequestMapping("/api/veicoli")
@CrossOrigin(origins = "http://localhost:4200")
public class VeicoloController {
	
	public final VeicoloService service;
	
	public VeicoloController(VeicoloService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<Veicolo> getAll() {
		return service.getAll();
	}
	
	@GetMapping("/tipo/{tipo}")
	public List<Veicolo> getByTipoEndpoint(@PathVariable String tipo) {
	    return service.getByTipo(tipo);
	    		}

	
	@GetMapping("/marca/{marca}")
	public List<Veicolo> getByMarca(@PathVariable String marca) {
		return service.getByMarca(marca);
	}
	
	@PostMapping
	public Veicolo save(@RequestBody Veicolo v) {
		return service.save(v);
	}
	
	@GetMapping("/prezzo-medio")
	public double prezzoMedio() {
		return service.calcolaPrezzoMedio();
	}
	
	@GetMapping("/meno-caro")
	public Veicolo menoCaro() {
		return service.veicoloMenoCaro();
	}
	
	@GetMapping("prezzo-medio/marca/{marca}")
	public double prezzoMedioMarca(@PathVariable String marca) {
		return service.prezzoMedioPerMarca(marca);
	}
	
	// Recupero veicolo per ID
	@GetMapping("/{id}")
	public Veicolo getVeicoloById(@PathVariable Long id) {
	    return service.getById(id);
	}

	// Eliminazione veicolo per ID
	@DeleteMapping("/{id}")
	public void deleteVeicolo(@PathVariable Long id) {
	    service.deleteById(id);
	}
	
	

}
