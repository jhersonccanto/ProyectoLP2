package com.example.Proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Proyecto.entity.Solicitud;

@Repository
public interface SolicitudRepository extends JpaRepository<Solicitud, Long>{

}
