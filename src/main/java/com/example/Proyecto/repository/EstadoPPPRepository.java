package com.example.Proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Proyecto.entity.EstadoPPP;

@Repository
public interface EstadoPPPRepository extends JpaRepository<EstadoPPP, Long> {

}
