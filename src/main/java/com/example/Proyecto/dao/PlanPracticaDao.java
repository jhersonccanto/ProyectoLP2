package com.example.Proyecto.dao;

import java.util.List;

import com.example.Proyecto.entity.PlanPractica;

public interface PlanPracticaDao {
	PlanPractica create(PlanPractica a);
	PlanPractica update(PlanPractica a);
	void delete(Long id);
	PlanPractica read(Long id);
	List<PlanPractica> readAll();
}
