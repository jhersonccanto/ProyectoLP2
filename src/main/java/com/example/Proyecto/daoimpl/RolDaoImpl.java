package com.example.Proyecto.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Proyecto.dao.RolDao;
import com.example.Proyecto.entity.Rol;
import com.example.Proyecto.repository.RolRepository;

@Component
public class RolDaoImpl implements RolDao{

	@Autowired
	private RolRepository rolrepository;
	
	@Override
	public Rol create(Rol a) {
		// TODO Auto-generated method stub
		return rolrepository.save(a);
	}

	@Override
	public Rol update(Rol a) {
		// TODO Auto-generated method stub
		return rolrepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		rolrepository.deleteById(id);
	}

	@Override
	public Rol read(Long id) {
		// TODO Auto-generated method stub
		return rolrepository.findById(id).get();
	}

	@Override
	public List<Rol> readAll() {
		// TODO Auto-generated method stub
		return rolrepository.findAll();
	}

}
