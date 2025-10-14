package com.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.model.StudenteEntity;

public interface StudenteRepository extends JpaRepository<StudenteEntity, Long>{

}
