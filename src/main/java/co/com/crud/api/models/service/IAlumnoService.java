package co.com.crud.api.models.service;

import java.util.List;

import co.com.crud.api.models.entity.Alumno;

public interface IAlumnoService {
	public List<Alumno> findAll();
}