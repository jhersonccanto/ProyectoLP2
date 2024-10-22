package com.example.Proyecto.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Proyecto.dao.PlanCarreraDao;
import com.example.Proyecto.entity.PlanCarrera;
import com.example.Proyecto.service.PlanCarreraService;

@Service
public class PlanCarreraServiceImpl implements PlanCarreraService {

	@Autowired
	private PlanCarreraDao plancarreradao;
	
	@Override
	public PlanCarrera create(PlanCarrera a) {
		// TODO Auto-generated method stub
		return plancarreradao.create(a);
	}

	@Override
	public PlanCarrera update(PlanCarrera a) {
		// TODO Auto-generated method stub
		return plancarreradao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		plancarreradao.delete(id);
	}

	@Override
	public PlanCarrera read(Long id) {
		// TODO Auto-generated method stub
		return plancarreradao.read(id);
	}

	@Override
	public List<PlanCarrera> readAll() {
		// TODO Auto-generated method stub
		return plancarreradao.readAll();
	}
	

}
