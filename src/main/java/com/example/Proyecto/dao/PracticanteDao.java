package com.example.Proyecto.dao;

import java.util.List;

import com.example.Proyecto.entity.Practicante;

public interface PracticanteDao {
	Practicante create(Practicante a);
	Practicante update(Practicante a);
	void delete(Long id);
	Practicante read(Long id);
	List<Practicante> readAll();
}
