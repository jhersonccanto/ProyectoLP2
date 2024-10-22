package com.example.Proyecto.service;

import java.util.List;

import com.example.Proyecto.entity.Supervisor;

public interface SupervisorService {
	Supervisor create(Supervisor a);
	Supervisor update(Supervisor a);
	void delete(Long id);
	Supervisor read(Long id);
	List<Supervisor> readAll();
}
