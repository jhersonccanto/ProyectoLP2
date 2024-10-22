package com.example.Proyecto.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Proyecto.dao.PlanDao;
import com.example.Proyecto.entity.Plan;
import com.example.Proyecto.service.PlanService;

@Service
public class PlanServiceImpl implements PlanService {

	@Autowired
	private PlanDao plandao;
	
	@Override
	public Plan create(Plan a) {
		// TODO Auto-generated method stub
		return plandao.create(a);
	}

	@Override
	public Plan update(Plan a) {
		// TODO Auto-generated method stub
		return plandao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		plandao.delete(id);
	}

	@Override
	public Plan read(Long id) {
		// TODO Auto-generated method stub
		return plandao.read(id);
	}

	@Override
	public List<Plan> readAll() {
		// TODO Auto-generated method stub
		return plandao.readAll();
	}
	

}