package com.example.Proyecto.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Proyecto.dao.UsuarioDao;
import com.example.Proyecto.entity.Usuario;
import com.example.Proyecto.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioDao usuariodao;
	
	@Override
	public Usuario create(Usuario a) {
		// TODO Auto-generated method stub
		return usuariodao.create(a);
	}

	@Override
	public Usuario update(Usuario a) {
		// TODO Auto-generated method stub
		return usuariodao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		usuariodao.delete(id);
	}

	@Override
	public Usuario read(Long id) {
		// TODO Auto-generated method stub
		return usuariodao.read(id);
	}

	@Override
	public List<Usuario> readAll() {
		// TODO Auto-generated method stub
		return usuariodao.readAll();
	}
	

}
