package com.example.Proyecto.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Proyecto.dao.RolAccesoDao;
import com.example.Proyecto.entity.RolAcceso;
import com.example.Proyecto.repository.RolAccesoRepository;

@Component
public class RolAccesoDaoImpl implements RolAccesoDao{

	@Autowired
	private RolAccesoRepository rolAccesorepository;
	
	@Override
	public RolAcceso create(RolAcceso a) {
		// TODO Auto-generated method stub
		return rolAccesorepository.save(a);
	}

	@Override
	public RolAcceso update(RolAcceso a) {
		// TODO Auto-generated method stub
		return rolAccesorepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		rolAccesorepository.deleteById(id);
	}

	@Override
	public RolAcceso read(Long id) {
		// TODO Auto-generated method stub
		return rolAccesorepository.findById(id).get();
	}

	@Override
	public List<RolAcceso> readAll() {
		// TODO Auto-generated method stub
		return rolAccesorepository.findAll();
	}

}
