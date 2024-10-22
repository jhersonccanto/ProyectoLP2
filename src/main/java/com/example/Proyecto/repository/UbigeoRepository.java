package com.example.Proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Proyecto.entity.Ubigeo;

@Repository
public interface UbigeoRepository extends JpaRepository<Ubigeo, Long> {

}
