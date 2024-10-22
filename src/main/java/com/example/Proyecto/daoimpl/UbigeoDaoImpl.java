package com.example.Proyecto.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Proyecto.dao.UbigeoDao;
import com.example.Proyecto.entity.Ubigeo;
import com.example.Proyecto.repository.UbigeoRepository;

@Component
public class UbigeoDaoImpl implements UbigeoDao{

	@Autowired
	private UbigeoRepository ubigeorepository;
	
	@Override
	public Ubigeo create(Ubigeo a) {
		// TODO Auto-generated method stub
		return ubigeorepository.save(a);
	}

	@Override
	public Ubigeo update(Ubigeo a) {
		// TODO Auto-generated method stub
		return ubigeorepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		ubigeorepository.deleteById(id);
	}

	@Override
	public Ubigeo read(Long id) {
		// TODO Auto-generated method stub
		return ubigeorepository.findById(id).get();
	}

	@Override
	public List<Ubigeo> readAll() {
		// TODO Auto-generated method stub
		return ubigeorepository.findAll();
	}

}
