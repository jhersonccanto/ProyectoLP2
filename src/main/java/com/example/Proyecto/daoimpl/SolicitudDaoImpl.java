package com.example.Proyecto.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Proyecto.dao.SolicitudDao;
import com.example.Proyecto.entity.Solicitud;
import com.example.Proyecto.repository.SolicitudRepository;

@Component
public class SolicitudDaoImpl implements SolicitudDao{

	@Autowired
	private SolicitudRepository solicitudrepository;
	
	@Override
	public Solicitud create(Solicitud a) {
		// TODO Auto-generated method stub
		return solicitudrepository.save(a);
	}

	@Override
	public Solicitud update(Solicitud a) {
		// TODO Auto-generated method stub
		return solicitudrepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		solicitudrepository.deleteById(id);
	}

	@Override
	public Solicitud read(Long id) {
		// TODO Auto-generated method stub
		return solicitudrepository.findById(id).get();
	}

	@Override
	public List<Solicitud> readAll() {
		// TODO Auto-generated method stub
		return solicitudrepository.findAll();
	}

}