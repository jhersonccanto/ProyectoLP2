package com.example.Proyecto.service;

import java.util.List;

import com.example.Proyecto.entity.EvaluacionAcademica;

public interface EvaluacionAcademicaService {
	EvaluacionAcademica create(EvaluacionAcademica a);
	EvaluacionAcademica update(EvaluacionAcademica a);
	void delete(Long id);
	EvaluacionAcademica read(Long id);
	List<EvaluacionAcademica> readAll();
}
