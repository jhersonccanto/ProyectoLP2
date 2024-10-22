package com.example.Proyecto.service;

import java.util.List;

import com.example.Proyecto.entity.Solicitud;

public interface SolicitudService {
	Solicitud create(Solicitud a);
	Solicitud update(Solicitud a);
	void delete(Long id);
	Solicitud read(Long id);
	List<Solicitud> readAll();
}
