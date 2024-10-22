package com.example.Proyecto.dao;

import java.util.List;

import com.example.Proyecto.entity.Estados;

public interface EstadosDao {
	Estados create(Estados a);
	Estados update(Estados a);
	void delete(Long id);
	Estados read(Long id);
	List<Estados> readAll();
}
