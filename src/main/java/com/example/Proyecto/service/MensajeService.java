package com.example.Proyecto.service;

import java.util.List;

import com.example.Proyecto.entity.Mensaje;

public interface MensajeService {
	Mensaje create(Mensaje a);
	Mensaje update(Mensaje a);
	void delete(Long id);
	Mensaje read(Long id);
	List<Mensaje> readAll();
}
