package com.negozio_abbigliamento.repository;

//AbitoRepository.java
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.negozio_abbigliamento.model.AbitoEntity;

import java.util.List;

@Repository
public interface AbitoRepository extends JpaRepository<AbitoEntity, Long> {
 // ricerca per tipo (es. "PANTALONE", "CAMICIA", "MAGLIONE" o codici personalizzati)
 List<AbitoEntity> findByTipo(String tipo);

 // ricerca per marca
 List<AbitoEntity> findByMarcaContainingIgnoreCase(String marca);
}
