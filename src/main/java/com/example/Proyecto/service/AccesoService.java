package com.example.Proyecto.service;

import java.util.List;

import com.example.Proyecto.entity.Acceso;

public interface AccesoService {
	Acceso create(Acceso a);
	Acceso update(Acceso a);
	void delete(Long id);
	Acceso read(Long id);
	List<Acceso> readAll();
}
