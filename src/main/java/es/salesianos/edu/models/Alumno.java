package es.salesianos.edu.models;

import java.io.Serializable;

public class Alumno implements Serializable{
	
	private String nameAlumno;
	private String bocadillo;
	
	public String getBocadillo() {
		return bocadillo;
	}
	public void setBocadillo(String bocadillo) {
		this.bocadillo = bocadillo;
	}
	public String getNameAlumno() {
		return nameAlumno;
	}
	public void setNameAlumno(String nameAlumno) {
		this.nameAlumno = nameAlumno;
	}
	
	
	


}
