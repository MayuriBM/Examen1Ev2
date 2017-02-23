package es.salesianos.edu.repository;



import java.util.List;

import es.salesianos.edu.connection.DataBase;
import es.salesianos.edu.models.Alumno;




@org.springframework.stereotype.Repository
public class Repository{

	 private DataBase db = new DataBase();

	public DataBase getDb() {
		return db;
	}

	public void setDb(DataBase db) {
		this.db = db;
	}

	public void insertAlumno(Alumno alumno) {
		db.getAlumno().add(alumno);
		return;
		
	}
public List<Alumno> listAlumno() {
		
		return db.getAlumno();
	}
	
	

	
}
