package com.example.Proyecto.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Proyecto.dao.PracticanteDao;
import com.example.Proyecto.entity.Practicante;
import com.example.Proyecto.service.PracticanteService;

@Service
public class PracticanteServiceImpl implements PracticanteService {

	@Autowired
	private PracticanteDao practicantedao;
	
	@Override
	public Practicante create(Practicante a) {
		// TODO Auto-generated method stub
		return practicantedao.create(a);
	}

	@Override
	public Practicante update(Practicante a) {
		// TODO Auto-generated method stub
		return practicantedao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		practicantedao.delete(id);
	}

	@Override
	public Practicante read(Long id) {
		// TODO Auto-generated method stub
		return practicantedao.read(id);
	}

	@Override
	public List<Practicante> readAll() {
		// TODO Auto-generated method stub
		return practicantedao.readAll();
	}
	

}
