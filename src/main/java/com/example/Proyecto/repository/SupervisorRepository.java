package com.example.Proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Proyecto.entity.Supervisor;

@Repository
public interface SupervisorRepository extends JpaRepository<Supervisor, Long>{

}
