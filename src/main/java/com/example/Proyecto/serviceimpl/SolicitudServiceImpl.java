package com.example.Proyecto.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Proyecto.dao.SolicitudDao;
import com.example.Proyecto.entity.Solicitud;
import com.example.Proyecto.service.SolicitudService;

@Service
public class SolicitudServiceImpl implements SolicitudService {

	@Autowired
	private SolicitudDao solicituddao;
	
	@Override
	public Solicitud create(Solicitud a) {
		// TODO Auto-generated method stub
		return solicituddao.create(a);
	}

	@Override
	public Solicitud update(Solicitud a) {
		// TODO Auto-generated method stub
		return solicituddao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		solicituddao.delete(id);
	}

	@Override
	public Solicitud read(Long id) {
		// TODO Auto-generated method stub
		return solicituddao.read(id);
	}

	@Override
	public List<Solicitud> readAll() {
		// TODO Auto-generated method stub
		return solicituddao.readAll();
	}
	

}
