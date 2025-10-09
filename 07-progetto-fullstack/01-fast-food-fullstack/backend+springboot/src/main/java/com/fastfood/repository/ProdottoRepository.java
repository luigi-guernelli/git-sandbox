package com.fastfood.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fastfood.model.Prodotto;

@Repository
public interface ProdottoRepository extends JpaRepository<Prodotto, Long> {
	List<Prodotto> findByCategoria(String categoria);
}
