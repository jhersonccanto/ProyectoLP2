package com.example.Proyecto.dao;

import java.util.List;

import com.example.Proyecto.entity.EvaluacionAcademica;

public interface EvaluacionAcademicaDao {
	EvaluacionAcademica create(EvaluacionAcademica a);
	EvaluacionAcademica update(EvaluacionAcademica a);
	void delete(Long id);
	EvaluacionAcademica read(Long id);
	List<EvaluacionAcademica> readAll();
}
