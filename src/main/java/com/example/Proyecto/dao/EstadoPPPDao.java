package com.example.Proyecto.dao;

import java.util.List;

import com.example.Proyecto.entity.EstadoPPP;

public interface EstadoPPPDao {
	EstadoPPP create(EstadoPPP a);
	EstadoPPP update(EstadoPPP a);
	void delete(Long id);
	EstadoPPP read(Long id);
	List<EstadoPPP> readAll();
}
