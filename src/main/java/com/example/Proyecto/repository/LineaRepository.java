package com.example.Proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Proyecto.entity.Linea;

@Repository
public interface LineaRepository extends JpaRepository<Linea, Long>{

}
