package es.salesianos.edu.models;

import java.io.Serializable;

public class Alumno implements Serializable{
	
	private String name;
	private String bocadillo;
	
	public String getBocadillo() {
		return bocadillo;
	}
	public void setBocadillo(String bocadillo) {
		this.bocadillo = bocadillo;
	}
	
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	
	


}
