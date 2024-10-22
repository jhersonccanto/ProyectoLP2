package com.example.Proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Proyecto.entity.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long>{

}