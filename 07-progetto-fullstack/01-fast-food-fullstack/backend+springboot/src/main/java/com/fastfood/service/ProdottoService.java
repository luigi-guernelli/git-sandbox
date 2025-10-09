package com.fastfood.service;

import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fastfood.model.Prodotto;
import com.fastfood.repository.ProdottoRepository;

@Service
public class ProdottoService {
	private final ProdottoRepository repository;

	public ProdottoService(ProdottoRepository repository) {
		this.repository = repository;
	}

	public List<Prodotto> getAllProdotti() {
		return repository.findAll();
	}

	public List<Prodotto> getProdottiByCategoria(String categoria) {
		return repository.findByCategoria(categoria);
	}

	// Prezzo Medio
	public Double getPrezzoMedio() {
		return repository.findAll().stream().mapToDouble(Prodotto::getPrezzo).average().orElse(0.0);
	}

	// Prodotto meno caro
	public Prodotto getProdottoMenoCaro() {
		return repository.findAll().stream().min(Comparator.comparingDouble(Prodotto::getPrezzo)).orElse(null);
	}

	// Prodotto PIU caro
	public Prodotto getProdottoPiuCaro() {
		return repository.findAll().stream().max(Comparator.comparingDouble(Prodotto::getPrezzo)).orElse(null);
	}

}
