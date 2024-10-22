package com.example.Proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Proyecto.entity.Notificaciones;

@Repository
public interface NotificacionesRepository extends JpaRepository<Notificaciones, Long>{

}
