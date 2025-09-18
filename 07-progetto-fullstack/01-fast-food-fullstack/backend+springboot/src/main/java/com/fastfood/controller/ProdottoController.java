package com.fastfood.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fastfood.model.Prodotto;
import com.fastfood.service.ProdottoService;

@RestController
@RequestMapping("/api/prodotti")
@CrossOrigin(origins = "http://localhost:4200") // collegamento ad Angular
public class ProdottoController {

	private final ProdottoService service;

	public ProdottoController(ProdottoService service) {
		this.service = service;
	}

	@GetMapping
	public List<Prodotto> getAll() {
		return service.getAllProdotti();
	}

	@GetMapping("/categoria/{categoria}")
	public List<Prodotto> getByCategoria(@PathVariable String categoria) {
		return service.getProdottiByCategoria(categoria);
	}

	@GetMapping("/prezzo-medio")
	public Double prezzoMedio() {
		return service.getPrezzoMedio();
	}

	@GetMapping("/meno-caro")
	public Prodotto prodottoMenoCaro() {
		return service.getProdottoMenoCaro();
	}

	@GetMapping("/piu-caro")
	public Prodotto prodottoPiuCaro() {
		return service.getProdottoPiuCaro();
	}

}
