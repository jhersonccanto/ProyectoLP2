package com.example.Proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Proyecto.entity.PlanPractica;

@Repository
public interface PlanPracticaRepository extends JpaRepository<PlanPractica, Long> {

}
