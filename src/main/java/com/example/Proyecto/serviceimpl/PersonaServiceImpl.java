package com.example.Proyecto.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Proyecto.dao.PersonaDao;
import com.example.Proyecto.entity.Persona;
import com.example.Proyecto.service.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService {

	@Autowired
	private PersonaDao personadao;
	
	@Override
	public Persona create(Persona a) {
		// TODO Auto-generated method stub
		return personadao.create(a);
	}

	@Override
	public Persona update(Persona a) {
		// TODO Auto-generated method stub
		return personadao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		personadao.delete(id);
	}

	@Override
	public Persona read(Long id) {
		// TODO Auto-generated method stub
		return personadao.read(id);
	}

	@Override
	public List<Persona> readAll() {
		// TODO Auto-generated method stub
		return personadao.readAll();
	}
	

}
