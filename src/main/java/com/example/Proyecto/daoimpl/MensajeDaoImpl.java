package com.example.Proyecto.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Proyecto.dao.MensajeDao;
import com.example.Proyecto.entity.Mensaje;
import com.example.Proyecto.repository.MensajeRepository;

@Component
public class MensajeDaoImpl implements MensajeDao{

	@Autowired
	private MensajeRepository mensajerepository;
	
	@Override
	public Mensaje create(Mensaje a) {
		// TODO Auto-generated method stub
		return mensajerepository.save(a);
	}

	@Override
	public Mensaje update(Mensaje a) {
		// TODO Auto-generated method stub
		return mensajerepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		mensajerepository.deleteById(id);
	}

	@Override
	public Mensaje read(Long id) {
		// TODO Auto-generated method stub
		return mensajerepository.findById(id).get();
	}

	@Override
	public List<Mensaje> readAll() {
		// TODO Auto-generated method stub
		return mensajerepository.findAll();
	}

}
