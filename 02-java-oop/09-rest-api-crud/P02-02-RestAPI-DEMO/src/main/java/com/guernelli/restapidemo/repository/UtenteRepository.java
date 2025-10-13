package com.guernelli.restapidemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guernelli.restapidemo.model.Utente;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Long> {
    boolean existsByEmail(String email);
}