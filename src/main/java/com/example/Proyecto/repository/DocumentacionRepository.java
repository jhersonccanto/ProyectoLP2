package com.example.Proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Proyecto.entity.Documentacion;

@Repository
public interface DocumentacionRepository extends JpaRepository<Documentacion, Long>{

}
