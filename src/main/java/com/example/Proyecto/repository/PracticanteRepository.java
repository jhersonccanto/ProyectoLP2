package com.example.Proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Proyecto.entity.Practicante;

@Repository
public interface PracticanteRepository extends JpaRepository<Practicante, Long>{

}
