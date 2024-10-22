package com.example.Proyecto.service;

import java.util.List;

import com.example.Proyecto.entity.Usuario;

public interface UsuarioService {
	Usuario create(Usuario a);
	Usuario update(Usuario a);
	void delete(Long id);
	Usuario read(Long id);
	List<Usuario> readAll();
}
