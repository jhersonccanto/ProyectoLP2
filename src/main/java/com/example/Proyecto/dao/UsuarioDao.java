package com.example.Proyecto.dao;

import java.util.List;

import com.example.Proyecto.entity.Usuario;

public interface UsuarioDao {
	Usuario create(Usuario a);
	Usuario update(Usuario a);
	void delete(Long id);
	Usuario read(Long id);
	List<Usuario> readAll();
}
