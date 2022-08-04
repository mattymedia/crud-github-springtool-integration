package co.com.crud.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.crud.api.models.entity.Alumno;
import co.com.crud.api.models.service.IAlumnoService;

@RestController
@RequestMapping("/api")
public class AlumnoController {

	@Autowired
	private IAlumnoService alumnoService;
	
	@GetMapping("alumnos")
	public List<Alumno> findAll(){
		return alumnoService.findAll();
	}
	
}
