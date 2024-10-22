package com.example.Proyecto.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Proyecto.dao.PlanCarreraDao;
import com.example.Proyecto.entity.PlanCarrera;
import com.example.Proyecto.repository.PlanCarreraRepository;

@Component
public class PlanCarreraDaoImpl implements PlanCarreraDao{

	@Autowired
	private PlanCarreraRepository plancarrerarepository;
	
	@Override
	public PlanCarrera create(PlanCarrera a) {
		// TODO Auto-generated method stub
		return plancarrerarepository.save(a);
	}

	@Override
	public PlanCarrera update(PlanCarrera a) {
		// TODO Auto-generated method stub
		return plancarrerarepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		plancarrerarepository.deleteById(id);
	}

	@Override
	public PlanCarrera read(Long id) {
		// TODO Auto-generated method stub
		return plancarrerarepository.findById(id).get();
	}

	@Override
	public List<PlanCarrera> readAll() {
		// TODO Auto-generated method stub
		return plancarrerarepository.findAll();
	}

}
