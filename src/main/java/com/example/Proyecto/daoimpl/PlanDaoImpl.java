package com.example.Proyecto.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Proyecto.dao.PlanDao;
import com.example.Proyecto.entity.Plan;
import com.example.Proyecto.repository.PlanRepository;

@Component
public class PlanDaoImpl implements PlanDao{

	@Autowired
	private PlanRepository planrepository;
	
	@Override
	public Plan create(Plan a) {
		// TODO Auto-generated method stub
		return planrepository.save(a);
	}

	@Override
	public Plan update(Plan a) {
		// TODO Auto-generated method stub
		return planrepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		planrepository.deleteById(id);
	}

	@Override
	public Plan read(Long id) {
		// TODO Auto-generated method stub
		return planrepository.findById(id).get();
	}

	@Override
	public List<Plan> readAll() {
		// TODO Auto-generated method stub
		return planrepository.findAll();
	}

}
