package com.example.Proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Proyecto.entity.Plan;

@Repository
public interface PlanRepository extends JpaRepository<Plan, Long>{

}
