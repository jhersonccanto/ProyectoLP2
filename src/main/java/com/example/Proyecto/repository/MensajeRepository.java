package com.example.Proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Proyecto.entity.Mensaje;

@Repository
public interface MensajeRepository extends JpaRepository<Mensaje, Long>{

}