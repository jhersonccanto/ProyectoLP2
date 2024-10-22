package com.example.Proyecto.dao;

import java.util.List;

import com.example.Proyecto.entity.Supervisor;

public interface SupervisorDao {
	Supervisor create(Supervisor a);
	Supervisor update(Supervisor a);
	void delete(Long id);
	Supervisor read(Long id);
	List<Supervisor> readAll();
}
