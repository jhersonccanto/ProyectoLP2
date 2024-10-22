package com.example.Proyecto.service;

import java.util.List;

import com.example.Proyecto.entity.PlanCarrera;

public interface PlanCarreraService {
	PlanCarrera create(PlanCarrera a);
	PlanCarrera update(PlanCarrera a);
	void delete(Long id);
	PlanCarrera read(Long id);
	List<PlanCarrera> readAll();
}
