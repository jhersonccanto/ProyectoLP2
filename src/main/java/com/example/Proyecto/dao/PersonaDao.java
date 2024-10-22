package com.example.Proyecto.dao;

import java.util.List;

import com.example.Proyecto.entity.Persona;

public interface PersonaDao {
	Persona create(Persona a);
	Persona update(Persona a);
	void delete(Long id);
	Persona read(Long id);
	List<Persona> readAll();
}
