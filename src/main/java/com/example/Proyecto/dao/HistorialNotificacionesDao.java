package com.example.Proyecto.dao;

import java.util.List;

import com.example.Proyecto.entity.HistorialNotificaciones;

public interface HistorialNotificacionesDao {
	HistorialNotificaciones create(HistorialNotificaciones a);
	HistorialNotificaciones update(HistorialNotificaciones a);
	void delete(Long id);
	HistorialNotificaciones read(Long id);
	List<HistorialNotificaciones> readAll();
}
