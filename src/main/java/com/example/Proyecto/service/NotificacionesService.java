package com.example.Proyecto.service;

import java.util.List;

import com.example.Proyecto.entity.Notificaciones;

public interface NotificacionesService {
	Notificaciones create(Notificaciones a);
	Notificaciones update(Notificaciones a);
	void delete(Long id);
	Notificaciones read(Long id);
	List<Notificaciones> readAll();
}
