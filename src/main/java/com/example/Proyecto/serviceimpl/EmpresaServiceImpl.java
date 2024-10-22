package com.example.Proyecto.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Proyecto.dao.EmpresaDao;
import com.example.Proyecto.entity.Empresa;
import com.example.Proyecto.service.EmpresaService;

@Service
public class EmpresaServiceImpl implements EmpresaService {

	@Autowired
	private EmpresaDao empresadao;
	
	@Override
	public Empresa create(Empresa a) {
		// TODO Auto-generated method stub
		return empresadao.create(a);
	}

	@Override
	public Empresa update(Empresa a) {
		// TODO Auto-generated method stub
		return empresadao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		empresadao.delete(id);
	}

	@Override
	public Empresa read(Long id) {
		// TODO Auto-generated method stub
		return empresadao.read(id);
	}

	@Override
	public List<Empresa> readAll() {
		// TODO Auto-generated method stub
		return empresadao.readAll();
	}
	

}
