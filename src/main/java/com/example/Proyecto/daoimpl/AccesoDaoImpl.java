package com.example.Proyecto.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Proyecto.dao.AccesoDao;
import com.example.Proyecto.entity.Acceso;
import com.example.Proyecto.repository.AccesoRepository;

@Component
public class AccesoDaoImpl implements AccesoDao{

	@Autowired
	private AccesoRepository accesorepository;
	
	@Override
	public Acceso create(Acceso a) {
		// TODO Auto-generated method stub
		return accesorepository.save(a);
	}

	@Override
	public Acceso update(Acceso a) {
		// TODO Auto-generated method stub
		return accesorepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		accesorepository.deleteById(id);
	}

	@Override
	public Acceso read(Long id) {
		// TODO Auto-generated method stub
		return accesorepository.findById(id).get();
	}

	@Override
	public List<Acceso> readAll() {
		// TODO Auto-generated method stub
		return accesorepository.findAll();
	}

}
