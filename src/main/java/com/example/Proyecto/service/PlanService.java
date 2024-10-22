package com.example.Proyecto.service;

import java.util.List;

import com.example.Proyecto.entity.Plan;

public interface PlanService {
	Plan create(Plan a);
	Plan update(Plan a);
	void delete(Long id);
	Plan read(Long id);
	List<Plan> readAll();
}
