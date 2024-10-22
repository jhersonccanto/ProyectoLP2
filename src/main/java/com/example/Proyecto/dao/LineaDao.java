package com.example.Proyecto.dao;

import java.util.List;

import com.example.Proyecto.entity.Linea;

public interface LineaDao {
	Linea create(Linea a);
	Linea update(Linea a);
	void delete(Long id);
	Linea read(Long id);
	List<Linea> readAll();
}
