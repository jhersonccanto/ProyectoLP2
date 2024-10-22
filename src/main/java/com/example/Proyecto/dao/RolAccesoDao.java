package com.example.Proyecto.dao;

import java.util.List;

import com.example.Proyecto.entity.RolAcceso;

public interface RolAccesoDao {
	RolAcceso create(RolAcceso a);
	RolAcceso update(RolAcceso a);
	void delete(Long id);
	RolAcceso read(Long id);
	List<RolAcceso> readAll();
}
