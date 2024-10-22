package com.example.Proyecto.dao;

import java.util.List;

import com.example.Proyecto.entity.Rol;

public interface RolDao {
	Rol create(Rol a);
	Rol update(Rol a);
	void delete(Long id);
	Rol read(Long id);
	List<Rol> readAll();
}
