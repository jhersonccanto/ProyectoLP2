package com.example.Proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Proyecto.entity.Acceso;

@Repository
public interface AccesoRepository extends JpaRepository<Acceso, Long>{

}
