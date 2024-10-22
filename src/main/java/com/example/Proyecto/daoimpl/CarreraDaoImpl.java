package com.example.Proyecto.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Proyecto.dao.CarreraDao;
import com.example.Proyecto.entity.Carrera;
import com.example.Proyecto.repository.CarreraRepository;

@Component
public class CarreraDaoImpl implements CarreraDao{

	@Autowired
	private CarreraRepository carrerarepository;
	
	@Override
	public Carrera create(Carrera a) {
		// TODO Auto-generated method stub
		return carrerarepository.save(a);
	}

	@Override
	public Carrera update(Carrera a) {
		// TODO Auto-generated method stub
		return carrerarepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		carrerarepository.deleteById(id);
	}

	@Override
	public Carrera read(Long id) {
		// TODO Auto-generated method stub
		return carrerarepository.findById(id).get();
	}

	@Override
	public List<Carrera> readAll() {
		// TODO Auto-generated method stub
		return carrerarepository.findAll();
	}

}