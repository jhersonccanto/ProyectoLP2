package com.example.Proyecto.service;

import java.util.List;

import com.example.Proyecto.entity.RolAcceso;

public interface RolAccesoService {
	RolAcceso create(RolAcceso a);
	RolAcceso update(RolAcceso a);
	void delete(Long id);
	RolAcceso read(Long id);
	List<RolAcceso> readAll();
}
