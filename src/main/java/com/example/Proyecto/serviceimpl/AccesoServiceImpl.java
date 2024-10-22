package com.example.Proyecto.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Proyecto.dao.AccesoDao;
import com.example.Proyecto.entity.Acceso;
import com.example.Proyecto.service.AccesoService;

@Service
public class AccesoServiceImpl implements AccesoService {

	@Autowired
	private AccesoDao accesodao;
	
	@Override
	public Acceso create(Acceso a) {
		// TODO Auto-generated method stub
		return accesodao.create(a);
	}

	@Override
	public Acceso update(Acceso a) {
		// TODO Auto-generated method stub
		return accesodao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		accesodao.delete(id);
	}

	@Override
	public Acceso read(Long id) {
		// TODO Auto-generated method stub
		return accesodao.read(id);
	}

	@Override
	public List<Acceso> readAll() {
		// TODO Auto-generated method stub
		return accesodao.readAll();
	}
	

}