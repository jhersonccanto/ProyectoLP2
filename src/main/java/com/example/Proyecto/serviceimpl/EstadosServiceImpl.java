package com.example.Proyecto.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Proyecto.dao.EstadosDao;
import com.example.Proyecto.entity.Estados;
import com.example.Proyecto.service.EstadosService;

@Service
public class EstadosServiceImpl implements EstadosService {

	@Autowired
	private EstadosDao estadosdao;
	
	@Override
	public Estados create(Estados a) {
		// TODO Auto-generated method stub
		return estadosdao.create(a);
	}

	@Override
	public Estados update(Estados a) {
		// TODO Auto-generated method stub
		return estadosdao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		estadosdao.delete(id);
	}

	@Override
	public Estados read(Long id) {
		// TODO Auto-generated method stub
		return estadosdao.read(id);
	}

	@Override
	public List<Estados> readAll() {
		// TODO Auto-generated method stub
		return estadosdao.readAll();
	}
	

}