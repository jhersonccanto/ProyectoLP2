package com.example.Proyecto.dao;

import java.util.List;

import com.example.Proyecto.entity.Solicitud;

public interface SolicitudDao {
	Solicitud create(Solicitud a);
	Solicitud update(Solicitud a);
	void delete(Long id);
	Solicitud read(Long id);
	List<Solicitud> readAll();
}
