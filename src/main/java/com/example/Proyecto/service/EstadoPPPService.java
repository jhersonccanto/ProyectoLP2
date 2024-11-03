package com.example.Proyecto.service;

import java.util.List;

import com.example.Proyecto.entity.EstadoPPP;

public interface EstadoPPPService {
	EstadoPPP create(EstadoPPP a);
	EstadoPPP update(EstadoPPP a);
	void delete(Long id);
	EstadoPPP read(Long id);
	List<EstadoPPP> readAll();
}
