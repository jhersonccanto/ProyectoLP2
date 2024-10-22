package com.example.Proyecto.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Proyecto.dao.UbigeoDao;
import com.example.Proyecto.entity.Ubigeo;
import com.example.Proyecto.service.UbigeoService;

@Service
public class UbigeoServiceImpl implements UbigeoService {

	@Autowired
	private UbigeoDao ubigeodao;
	
	@Override
	public Ubigeo create(Ubigeo a) {
		// TODO Auto-generated method stub
		return ubigeodao.create(a);
	}

	@Override
	public Ubigeo update(Ubigeo a) {
		// TODO Auto-generated method stub
		return ubigeodao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		ubigeodao.delete(id);
	}

	@Override
	public Ubigeo read(Long id) {
		// TODO Auto-generated method stub
		return ubigeodao.read(id);
	}

	@Override
	public List<Ubigeo> readAll() {
		// TODO Auto-generated method stub
		return ubigeodao.readAll();
	}
	

}
