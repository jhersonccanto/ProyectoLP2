package com.example.Proyecto.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Proyecto.dao.SupervisorDao;
import com.example.Proyecto.entity.Supervisor;
import com.example.Proyecto.service.SupervisorService;

@Service
public class SupervisorServiceImpl implements SupervisorService {

	@Autowired
	private SupervisorDao supervisordao;
	
	@Override
	public Supervisor create(Supervisor a) {
		// TODO Auto-generated method stub
		return supervisordao.create(a);
	}

	@Override
	public Supervisor update(Supervisor a) {
		// TODO Auto-generated method stub
		return supervisordao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		supervisordao.delete(id);
	}

	@Override
	public Supervisor read(Long id) {
		// TODO Auto-generated method stub
		return supervisordao.read(id);
	}

	@Override
	public List<Supervisor> readAll() {
		// TODO Auto-generated method stub
		return supervisordao.readAll();
	}
	

}
