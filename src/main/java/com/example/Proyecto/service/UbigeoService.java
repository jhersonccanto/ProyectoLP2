package com.example.Proyecto.service;

import java.util.List;

import com.example.Proyecto.entity.Ubigeo;

public interface UbigeoService {
	Ubigeo create(Ubigeo a);
	Ubigeo update(Ubigeo a);
	void delete(Long id);
	Ubigeo read(Long id);
	List<Ubigeo> readAll();
}
