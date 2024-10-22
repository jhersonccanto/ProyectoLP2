package com.example.Proyecto.service;

import java.util.List;

import com.example.Proyecto.entity.TipoDocumento;

public interface TipoDocumentoService {
	TipoDocumento create(TipoDocumento a);
	TipoDocumento update(TipoDocumento a);
	void delete(Long id);
	TipoDocumento read(Long id);
	List<TipoDocumento> readAll();
}
