package com.example.Proyecto.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Proyecto.dao.RolDao;
import com.example.Proyecto.entity.Rol;
import com.example.Proyecto.service.RolService;

@Service
public class RolServiceImpl implements RolService {

	@Autowired
	private RolDao roldao;
	
	@Override
	public Rol create(Rol a) {
		// TODO Auto-generated method stub
		return roldao.create(a);
	}

	@Override
	public Rol update(Rol a) {
		// TODO Auto-generated method stub
		return roldao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		roldao.delete(id);
	}

	@Override
	public Rol read(Long id) {
		// TODO Auto-generated method stub
		return roldao.read(id);
	}

	@Override
	public List<Rol> readAll() {
		// TODO Auto-generated method stub
		return roldao.readAll();
	}
	

}
