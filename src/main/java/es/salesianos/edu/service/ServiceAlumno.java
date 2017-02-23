package es.salesianos.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import es.salesianos.edu.models.Alumno;
import es.salesianos.edu.repository.Repository;

public class ServiceAlumno {
	@Autowired
	Repository repository;
		
	public boolean insert(Alumno alumno) {
		repository.insertAlumno(alumno);
		
		return true;
	}
	
	public boolean show() {
		
		return true;
	}
	
	public List<Alumno> addListAlumno() {
		return repository.getDb().getAlumno();
	}

}
