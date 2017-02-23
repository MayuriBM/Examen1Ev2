package es.salesianos.edu.connection;

import java.util.ArrayList;

import es.salesianos.edu.models.Alumno;

public class DataBase {

	private ArrayList<Alumno> alumno = new ArrayList<Alumno>();

	public ArrayList<Alumno> getAlumno() {
		return alumno;
	}

	public void setAlumno(ArrayList<Alumno> alumno) {
		this.alumno = alumno;
	}
	
	
}
