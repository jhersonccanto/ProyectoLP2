package com.example.Proyecto.service;

import java.util.List;

import com.example.Proyecto.entity.Carrera;

public interface CarreraService {
	Carrera create(Carrera a);
	Carrera update(Carrera a);
	void delete(Long id);
	Carrera read(Long id);
	List<Carrera> readAll();
}
