package com.example.Proyecto.service;

import java.util.List;

import com.example.Proyecto.entity.HistorialNotificaciones;

public interface HistorialNotificacionesService {
	HistorialNotificaciones create(HistorialNotificaciones a);
	HistorialNotificaciones update(HistorialNotificaciones a);
	void delete(Long id);
	HistorialNotificaciones read(Long id);
	List<HistorialNotificaciones> readAll();
}
