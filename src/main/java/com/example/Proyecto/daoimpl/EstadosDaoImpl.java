package com.example.Proyecto.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Proyecto.dao.EstadosDao;
import com.example.Proyecto.entity.Estados;
import com.example.Proyecto.repository.EstadosRepository;

@Component
public class EstadosDaoImpl implements EstadosDao{

	@Autowired
	private EstadosRepository estadosrepository;
	
	@Override
	public Estados create(Estados a) {
		// TODO Auto-generated method stub
		return estadosrepository.save(a);
	}

	@Override
	public Estados update(Estados a) {
		// TODO Auto-generated method stub
		return estadosrepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		estadosrepository.deleteById(id);
	}

	@Override
	public Estados read(Long id) {
		// TODO Auto-generated method stub
		return estadosrepository.findById(id).get();
	}

	@Override
	public List<Estados> readAll() {
		// TODO Auto-generated method stub
		return estadosrepository.findAll();
	}

}