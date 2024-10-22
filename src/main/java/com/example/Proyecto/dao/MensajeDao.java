package com.example.Proyecto.dao;

import java.util.List;

import com.example.Proyecto.entity.Mensaje;

public interface MensajeDao {
	Mensaje create(Mensaje a);
	Mensaje update(Mensaje a);
	void delete(Long id);
	Mensaje read(Long id);
	List<Mensaje> readAll();
}
