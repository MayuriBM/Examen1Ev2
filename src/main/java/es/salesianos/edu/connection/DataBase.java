package es.salesianos.edu.connection;

import java.util.ArrayList;

import es.salesianos.edu.models.Alumno;

public class DataBase {

	private ArrayList<Alumno> Alumno = new ArrayList<Alumno>();

	public ArrayList<Alumno> getAlumno() {
		return Alumno;
	}

	public void setAlumno(ArrayList<Alumno> alumno) {
		this.Alumno = alumno;
	}
	
	
}
