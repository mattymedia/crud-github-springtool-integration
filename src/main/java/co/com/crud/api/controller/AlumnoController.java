package co.com.crud.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.crud.api.models.entity.Alumno;
import co.com.crud.api.models.service.IAlumnoService;

@RestController
@RequestMapping("/api")
public class AlumnoController {

	@Autowired
	private IAlumnoService alumnoService;
	
	@GetMapping("/alumnos")
	public List<Alumno> findAll(){
		return alumnoService.findAll();
	}
	
	@GetMapping("/alumnos/{id}")
	public Alumno findById(@PathVariable Integer id) {
		return alumnoService.findById(id);
	}
	
	@PostMapping("/alumnos")
	public Alumno save(@RequestBody Alumno alumno) {
		return alumnoService.save(alumno);
	}
	
	@PutMapping("/alumnos/{id}")
	public Alumno update(@RequestBody Alumno alumno, @PathVariable Integer id) {
		Alumno encontrado  = alumnoService.findById(id);
		
		encontrado.setNombre(alumno.getNombre());
		encontrado.setApellido(alumno.getApellido());
		encontrado.setCedula(alumno.getCedula());
		encontrado.setEmail(alumno.getEmail());
		encontrado.setBirthDay(alumno.getBirthDay());
		
		alumnoService.save(encontrado);
		
		return encontrado;
	}
	
	@DeleteMapping("/alumnos/{id}")
	public void delete(@PathVariable Integer id) {
		alumnoService.delete(id);
	}
	
}
