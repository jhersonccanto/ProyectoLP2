package com.example.Proyecto.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Proyecto.dao.UsuarioDao;
import com.example.Proyecto.entity.Usuario;
import com.example.Proyecto.repository.UsuarioRepository;

@Component
public class UsuarioDaoImpl implements UsuarioDao{

	@Autowired
	private UsuarioRepository usuariorepository;
	
	@Override
	public Usuario create(Usuario a) {
		// TODO Auto-generated method stub
		return usuariorepository.save(a);
	}

	@Override
	public Usuario update(Usuario a) {
		// TODO Auto-generated method stub
		return usuariorepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		usuariorepository.deleteById(id);
	}

	@Override
	public Usuario read(Long id) {
		// TODO Auto-generated method stub
		return usuariorepository.findById(id).get();
	}

	@Override
	public List<Usuario> readAll() {
		// TODO Auto-generated method stub
		return usuariorepository.findAll();
	}

}

