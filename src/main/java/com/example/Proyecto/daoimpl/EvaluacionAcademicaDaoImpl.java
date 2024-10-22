package com.example.Proyecto.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Proyecto.dao.EvaluacionAcademicaDao;
import com.example.Proyecto.entity.EvaluacionAcademica;
import com.example.Proyecto.repository.EvaluacionAcademicaRepository;

@Component
public class EvaluacionAcademicaDaoImpl implements EvaluacionAcademicaDao{

	@Autowired
	private EvaluacionAcademicaRepository evaluacionacademicarepository;
	
	@Override
	public EvaluacionAcademica create(EvaluacionAcademica a) {
		// TODO Auto-generated method stub
		return evaluacionacademicarepository.save(a);
	}

	@Override
	public EvaluacionAcademica update(EvaluacionAcademica a) {
		// TODO Auto-generated method stub
		return evaluacionacademicarepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		evaluacionacademicarepository.deleteById(id);
	}

	@Override
	public EvaluacionAcademica read(Long id) {
		// TODO Auto-generated method stub
		return evaluacionacademicarepository.findById(id).get();
	}

	@Override
	public List<EvaluacionAcademica> readAll() {
		// TODO Auto-generated method stub
		return evaluacionacademicarepository.findAll();
	}

}
