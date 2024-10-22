package com.example.Proyecto.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Proyecto.dao.RepresentanteLegalDao;
import com.example.Proyecto.entity.RepresentanteLegal;
import com.example.Proyecto.repository.RepresentanteLegalRepository;

@Component
public class RepresentanteLegalDaoImpl implements RepresentanteLegalDao{

	@Autowired
	private RepresentanteLegalRepository representantelegalrepository;
	
	@Override
	public RepresentanteLegal create(RepresentanteLegal a) {
		// TODO Auto-generated method stub
		return representantelegalrepository.save(a);
	}

	@Override
	public RepresentanteLegal update(RepresentanteLegal a) {
		// TODO Auto-generated method stub
		return representantelegalrepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		representantelegalrepository.deleteById(id);
	}

	@Override
	public RepresentanteLegal read(Long id) {
		// TODO Auto-generated method stub
		return representantelegalrepository.findById(id).get();
	}

	@Override
	public List<RepresentanteLegal> readAll() {
		// TODO Auto-generated method stub
		return representantelegalrepository.findAll();
	}

}
