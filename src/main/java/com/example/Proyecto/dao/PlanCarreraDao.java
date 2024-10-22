package com.example.Proyecto.dao;

import java.util.List;

import com.example.Proyecto.entity.PlanCarrera;

public interface PlanCarreraDao {
	PlanCarrera create(PlanCarrera a);
	PlanCarrera update(PlanCarrera a);
	void delete(Long id);
	PlanCarrera read(Long id);
	List<PlanCarrera> readAll();
}
