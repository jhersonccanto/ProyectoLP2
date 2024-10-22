package com.example.Proyecto.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Proyecto.dao.TipoDocumentoDao;
import com.example.Proyecto.entity.TipoDocumento;
import com.example.Proyecto.repository.TipoDocumentoRepository;

@Component
public class TipoDocumentoDaoImpl implements TipoDocumentoDao{

	@Autowired
	private TipoDocumentoRepository tipodocumentorepository;
	
	@Override
	public TipoDocumento create(TipoDocumento a) {
		// TODO Auto-generated method stub
		return tipodocumentorepository.save(a);
	}

	@Override
	public TipoDocumento update(TipoDocumento a) {
		// TODO Auto-generated method stub
		return tipodocumentorepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		tipodocumentorepository.deleteById(id);
	}

	@Override
	public TipoDocumento read(Long id) {
		// TODO Auto-generated method stub
		return tipodocumentorepository.findById(id).get();
	}

	@Override
	public List<TipoDocumento> readAll() {
		// TODO Auto-generated method stub
		return tipodocumentorepository.findAll();
	}

}
