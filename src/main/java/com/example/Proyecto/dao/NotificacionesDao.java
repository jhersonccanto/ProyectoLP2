package com.example.Proyecto.dao;

import java.util.List;

import com.example.Proyecto.entity.Notificaciones;

public interface NotificacionesDao {
	Notificaciones create(Notificaciones a);
	Notificaciones update(Notificaciones a);
	void delete(Long id);
	Notificaciones read(Long id);
	List<Notificaciones> readAll();
}
