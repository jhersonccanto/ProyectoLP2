package com.example.Proyecto.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Proyecto.dao.PersonaDao;
import com.example.Proyecto.entity.Persona;
import com.example.Proyecto.repository.PersonaRepository;

@Component
public class PersonaDaoImpl implements PersonaDao{

	@Autowired
	private PersonaRepository personarepository;
	
	@Override
	public Persona create(Persona a) {
		// TODO Auto-generated method stub
		return personarepository.save(a);
	}

	@Override
	public Persona update(Persona a) {
		// TODO Auto-generated method stub
		return personarepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		personarepository.deleteById(id);
	}

	@Override
	public Persona read(Long id) {
		// TODO Auto-generated method stub
		return personarepository.findById(id).get();
	}

	@Override
	public List<Persona> readAll() {
		// TODO Auto-generated method stub
		return personarepository.findAll();
	}

}
