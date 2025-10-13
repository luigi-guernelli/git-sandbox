package com.jpa.mvcs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.mvcs.model.ClienteEntity;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {
    // Possiamo aggiungere query personalizzate se servono
    ClienteEntity findByEmail(String email);
}