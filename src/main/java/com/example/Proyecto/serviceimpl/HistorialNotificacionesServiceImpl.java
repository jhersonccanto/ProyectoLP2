package com.example.Proyecto.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Proyecto.dao.HistorialNotificacionesDao;
import com.example.Proyecto.entity.HistorialNotificaciones;
import com.example.Proyecto.service.HistorialNotificacionesService;

@Service
public class HistorialNotificacionesServiceImpl implements HistorialNotificacionesService {

	@Autowired
	private HistorialNotificacionesDao historialnotificacionesdao;
	
	@Override
	public HistorialNotificaciones create(HistorialNotificaciones a) {
		// TODO Auto-generated method stub
		return historialnotificacionesdao.create(a);
	}

	@Override
	public HistorialNotificaciones update(HistorialNotificaciones a) {
		// TODO Auto-generated method stub
		return historialnotificacionesdao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		historialnotificacionesdao.delete(id);
	}

	@Override
	public HistorialNotificaciones read(Long id) {
		// TODO Auto-generated method stub
		return historialnotificacionesdao.read(id);
	}

	@Override
	public List<HistorialNotificaciones> readAll() {
		// TODO Auto-generated method stub
		return historialnotificacionesdao.readAll();
	}
	

}
