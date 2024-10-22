package com.example.Proyecto.service;

import java.util.List;

import com.example.Proyecto.entity.Empresa;

public interface EmpresaService {
	Empresa create(Empresa a);
	Empresa update(Empresa a);
	void delete(Long id);
	Empresa read(Long id);
	List<Empresa> readAll();
}
