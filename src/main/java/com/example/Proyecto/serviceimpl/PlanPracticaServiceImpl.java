package com.example.Proyecto.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Proyecto.dao.PlanPracticaDao;
import com.example.Proyecto.entity.PlanPractica;
import com.example.Proyecto.service.PlanPracticaService;

@Service
public class PlanPracticaServiceImpl implements PlanPracticaService {

	@Autowired
	private PlanPracticaDao planpracticadao;
	
	@Override
	public PlanPractica create(PlanPractica a) {
		// TODO Auto-generated method stub
		return planpracticadao.create(a);
	}

	@Override
	public PlanPractica update(PlanPractica a) {
		// TODO Auto-generated method stub
		return planpracticadao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		planpracticadao.delete(id);
	}

	@Override
	public PlanPractica read(Long id) {
		// TODO Auto-generated method stub
		return planpracticadao.read(id);
	}

	@Override
	public List<PlanPractica> readAll() {
		// TODO Auto-generated method stub
		return planpracticadao.readAll();
	}
	

}
