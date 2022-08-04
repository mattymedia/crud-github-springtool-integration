package co.com.crud.api.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.crud.api.models.dao.IAlumnoDao;
import co.com.crud.api.models.entity.Alumno;

@Service
public class ImplAlumnoService implements IAlumnoService{

	@Autowired
	private IAlumnoDao alumnoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Alumno> findAll() {
		return alumnoDao.findAll();
	}

	@Override
	public Alumno findById(Integer id) {
		return alumnoDao.findById(id).orElse(null);
	}

}
