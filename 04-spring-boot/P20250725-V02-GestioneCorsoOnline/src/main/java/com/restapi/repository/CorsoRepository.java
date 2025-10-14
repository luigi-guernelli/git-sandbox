package com.restapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.model.CategoriaEntity;
import com.restapi.model.CorsoEntity;
import com.restapi.model.DocenteEntity;

public interface CorsoRepository extends JpaRepository<CorsoEntity, Long> {

	// Metodo
	List<CorsoEntity> findByDocente(DocenteEntity docente);
	List<CorsoEntity> findByCategoria(CategoriaEntity categoria);
}
