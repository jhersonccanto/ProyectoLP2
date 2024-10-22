package com.example.Proyecto.service;

import java.util.List;

import com.example.Proyecto.entity.Linea;

public interface LineaService {
	Linea create(Linea a);
	Linea update(Linea a);
	void delete(Long id);
	Linea read(Long id);
	List<Linea> readAll();
}
