package com.example.Proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Proyecto.entity.RolAcceso;

@Repository
public interface RolAccesoRepository extends JpaRepository<RolAcceso, Long> {

}
