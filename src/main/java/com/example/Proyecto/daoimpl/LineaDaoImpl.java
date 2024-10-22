package com.example.Proyecto.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Proyecto.dao.LineaDao;
import com.example.Proyecto.entity.Linea;
import com.example.Proyecto.repository.LineaRepository;

@Component
public class LineaDaoImpl implements LineaDao{

	@Autowired
	private LineaRepository linearepository;
	
	@Override
	public Linea create(Linea a) {
		// TODO Auto-generated method stub
		return linearepository.save(a);
	}

	@Override
	public Linea update(Linea a) {
		// TODO Auto-generated method stub
		return linearepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		linearepository.deleteById(id);
	}

	@Override
	public Linea read(Long id) {
		// TODO Auto-generated method stub
		return linearepository.findById(id).get();
	}

	@Override
	public List<Linea> readAll() {
		// TODO Auto-generated method stub
		return linearepository.findAll();
	}

}