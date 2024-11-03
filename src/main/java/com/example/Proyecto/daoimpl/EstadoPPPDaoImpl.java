package com.example.Proyecto.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Proyecto.dao.EstadoPPPDao;
import com.example.Proyecto.entity.EstadoPPP;
import com.example.Proyecto.repository.EstadoPPPRepository;

@Component
public class EstadoPPPDaoImpl implements EstadoPPPDao{

	@Autowired
	private EstadoPPPRepository EstadoPPPrepository;
	
	@Override
	public EstadoPPP create(EstadoPPP a) {
		// TODO Auto-generated method stub
		return EstadoPPPrepository.save(a);
	}

	@Override
	public EstadoPPP update(EstadoPPP a) {
		// TODO Auto-generated method stub
		return EstadoPPPrepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		EstadoPPPrepository.deleteById(id);
	}

	@Override
	public EstadoPPP read(Long id) {
		// TODO Auto-generated method stub
		return EstadoPPPrepository.findById(id).get();
	}

	@Override
	public List<EstadoPPP> readAll() {
		// TODO Auto-generated method stub
		return EstadoPPPrepository.findAll();
	}

}