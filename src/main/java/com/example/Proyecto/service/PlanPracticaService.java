package com.example.Proyecto.service;

import java.util.List;

import com.example.Proyecto.entity.PlanPractica;

public interface PlanPracticaService {
	PlanPractica create(PlanPractica a);
	PlanPractica update(PlanPractica a);
	void delete(Long id);
	PlanPractica read(Long id);
	List<PlanPractica> readAll();
}
