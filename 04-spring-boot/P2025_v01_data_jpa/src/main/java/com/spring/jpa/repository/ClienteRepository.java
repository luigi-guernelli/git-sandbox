package com.spring.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.jpa.model.ClienteEntity;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {
    // Possiamo aggiungere query personalizzate se servono
    ClienteEntity findByEmail(String email);
}