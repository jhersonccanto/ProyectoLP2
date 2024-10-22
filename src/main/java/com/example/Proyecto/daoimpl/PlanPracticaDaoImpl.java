package com.example.Proyecto.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Proyecto.dao.PlanPracticaDao;
import com.example.Proyecto.entity.PlanPractica;
import com.example.Proyecto.repository.PlanPracticaRepository;

@Component
public class PlanPracticaDaoImpl implements PlanPracticaDao{

	@Autowired
	private PlanPracticaRepository planpracticarepository;
	
	@Override
	public PlanPractica create(PlanPractica a) {
		// TODO Auto-generated method stub
		return planpracticarepository.save(a);
	}

	@Override
	public PlanPractica update(PlanPractica a) {
		// TODO Auto-generated method stub
		return planpracticarepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		planpracticarepository.deleteById(id);
	}

	@Override
	public PlanPractica read(Long id) {
		// TODO Auto-generated method stub
		return planpracticarepository.findById(id).get();
	}

	@Override
	public List<PlanPractica> readAll() {
		// TODO Auto-generated method stub
		return planpracticarepository.findAll();
	}

}
