package com.guernelli.crudrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guernelli.crudrest.model.User;

/** Documentazione: Repository interface
 * 1. Crea il .repository/UserRepository.java
 * 2. JpaRepository fornisce tutti i metodi CRUD es.(findAll, save, delete)
 */
public interface UserRepository extends JpaRepository<User,Long>{
	
}
