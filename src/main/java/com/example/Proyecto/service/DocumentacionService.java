package com.example.Proyecto.service;

import java.util.List;

import com.example.Proyecto.entity.Documentacion;

public interface DocumentacionService {
	Documentacion create(Documentacion a);
	Documentacion update(Documentacion a);
	void delete(Long id);
	Documentacion read(Long id);
	List<Documentacion> readAll();
}
