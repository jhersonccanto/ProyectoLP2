package com.example.Proyecto.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Proyecto.dao.MensajeDao;
import com.example.Proyecto.entity.Mensaje;
import com.example.Proyecto.service.MensajeService;

@Service
public class MensajeServiceImpl implements MensajeService {

	@Autowired
	private MensajeDao mensajedao;
	
	@Override
	public Mensaje create(Mensaje a) {
		// TODO Auto-generated method stub
		return mensajedao.create(a);
	}

	@Override
	public Mensaje update(Mensaje a) {
		// TODO Auto-generated method stub
		return mensajedao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		mensajedao.delete(id);
	}

	@Override
	public Mensaje read(Long id) {
		// TODO Auto-generated method stub
		return mensajedao.read(id);
	}

	@Override
	public List<Mensaje> readAll() {
		// TODO Auto-generated method stub
		return mensajedao.readAll();
	}
	

}
