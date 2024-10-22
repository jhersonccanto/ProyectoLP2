package com.example.Proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Proyecto.entity.Estados;
@Repository
public interface EstadosRepository extends JpaRepository<Estados, Long> {

}
