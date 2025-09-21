package com.concessionaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.concessionaria.model.TipoVeicolo;
import com.concessionaria.model.Veicolo;

import java.util.List;

@Repository
public interface VeicoloRepository extends JpaRepository<Veicolo, Long> {
    List<Veicolo> findByMarca(String marca);
    // List<Veicolo> findByTipo(TipoVeicolo tipo);
    
    @Query("SELECT v FROM Veicolo v WHERE TYPE(v) = :tipo")
    List<Veicolo> findByTipo(Class<? extends Veicolo> tipo);

}
