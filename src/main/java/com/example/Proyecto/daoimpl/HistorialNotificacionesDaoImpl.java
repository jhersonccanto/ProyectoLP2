package com.example.Proyecto.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Proyecto.dao.HistorialNotificacionesDao;
import com.example.Proyecto.entity.HistorialNotificaciones;
import com.example.Proyecto.repository.HistorialNotificacionesRepository;

@Component
public class HistorialNotificacionesDaoImpl implements HistorialNotificacionesDao{

	@Autowired
	private HistorialNotificacionesRepository historialnotificacionesrepository;
	
	@Override
	public HistorialNotificaciones create(HistorialNotificaciones a) {
		// TODO Auto-generated method stub
		return historialnotificacionesrepository.save(a);
	}

	@Override
	public HistorialNotificaciones update(HistorialNotificaciones a) {
		// TODO Auto-generated method stub
		return historialnotificacionesrepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		historialnotificacionesrepository.deleteById(id);
	}

	@Override
	public HistorialNotificaciones read(Long id) {
		// TODO Auto-generated method stub
		return historialnotificacionesrepository.findById(id).get();
	}

	@Override
	public List<HistorialNotificaciones> readAll() {
		// TODO Auto-generated method stub
		return historialnotificacionesrepository.findAll();
	}

}
