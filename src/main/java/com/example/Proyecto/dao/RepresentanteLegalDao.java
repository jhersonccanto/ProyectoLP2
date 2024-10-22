package com.example.Proyecto.dao;

import java.util.List;

import com.example.Proyecto.entity.RepresentanteLegal;

public interface RepresentanteLegalDao {
	RepresentanteLegal create(RepresentanteLegal a);
	RepresentanteLegal update(RepresentanteLegal a);
	void delete(Long id);
	RepresentanteLegal read(Long id);
	List<RepresentanteLegal> readAll();
}
