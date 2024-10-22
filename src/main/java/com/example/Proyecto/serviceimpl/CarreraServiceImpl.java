package com.example.Proyecto.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Proyecto.dao.CarreraDao;
import com.example.Proyecto.entity.Carrera;
import com.example.Proyecto.service.CarreraService;

@Service
public class CarreraServiceImpl implements CarreraService {

	@Autowired
	private CarreraDao carreradao;
	
	@Override
	public Carrera create(Carrera a) {
		// TODO Auto-generated method stub
		return carreradao.create(a);
	}

	@Override
	public Carrera update(Carrera a) {
		// TODO Auto-generated method stub
		return carreradao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		carreradao.delete(id);
	}

	@Override
	public Carrera read(Long id) {
		// TODO Auto-generated method stub
		return carreradao.read(id);
	}

	@Override
	public List<Carrera> readAll() {
		// TODO Auto-generated method stub
		return carreradao.readAll();
	}
	

}