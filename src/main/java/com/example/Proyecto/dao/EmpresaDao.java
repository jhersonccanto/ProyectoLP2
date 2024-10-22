package com.example.Proyecto.dao;

import java.util.List;

import com.example.Proyecto.entity.Empresa;

public interface EmpresaDao {
	Empresa create(Empresa a);
	Empresa update(Empresa a);
	void delete(Long id);
	Empresa read(Long id);
	List<Empresa> readAll();
}
