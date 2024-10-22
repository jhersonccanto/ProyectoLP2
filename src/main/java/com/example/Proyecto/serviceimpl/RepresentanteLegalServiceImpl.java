package com.example.Proyecto.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Proyecto.dao.RepresentanteLegalDao;
import com.example.Proyecto.entity.RepresentanteLegal;
import com.example.Proyecto.service.RepresentanteLegalService;

@Service
public class RepresentanteLegalServiceImpl implements RepresentanteLegalService {

	@Autowired
	private RepresentanteLegalDao representantelegaldao;
	
	@Override
	public RepresentanteLegal create(RepresentanteLegal a) {
		// TODO Auto-generated method stub
		return representantelegaldao.create(a);
	}

	@Override
	public RepresentanteLegal update(RepresentanteLegal a) {
		// TODO Auto-generated method stub
		return representantelegaldao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		representantelegaldao.delete(id);
	}

	@Override
	public RepresentanteLegal read(Long id) {
		// TODO Auto-generated method stub
		return representantelegaldao.read(id);
	}

	@Override
	public List<RepresentanteLegal> readAll() {
		// TODO Auto-generated method stub
		return representantelegaldao.readAll();
	}
	

}
