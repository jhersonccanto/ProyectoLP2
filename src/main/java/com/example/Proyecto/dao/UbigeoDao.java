package com.example.Proyecto.dao;

import java.util.List;

import com.example.Proyecto.entity.Ubigeo;

public interface UbigeoDao {
	Ubigeo create(Ubigeo a);
	Ubigeo update(Ubigeo a);
	void delete(Long id);
	Ubigeo read(Long id);
	List<Ubigeo> readAll();
}
