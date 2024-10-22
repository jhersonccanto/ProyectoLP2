package com.example.Proyecto.service;

import java.util.List;

import com.example.Proyecto.entity.Persona;

public interface PersonaService {
	Persona create(Persona a);
	Persona update(Persona a);
	void delete(Long id);
	Persona read(Long id);
	List<Persona> readAll();
}
