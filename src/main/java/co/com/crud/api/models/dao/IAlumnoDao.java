package co.com.crud.api.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.crud.api.models.entity.Alumno;

public interface IAlumnoDao extends JpaRepository<Alumno, Integer> {

}
