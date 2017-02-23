package es.salesianos.edu.models;

import java.io.Serializable;

public class Alumno implements Serializable{
	
	private String namealumno;
	private String bocadillo;
	
	public String getBocadillo() {
		return bocadillo;
	}
	public void setBocadillo(String bocadillo) {
		this.bocadillo = bocadillo;
	}
	public String getNamealumno() {
		return namealumno;
	}
	public void setNamealumno(String nameAlumno) {
		this.namealumno = nameAlumno;
	}
	
	
	


}
