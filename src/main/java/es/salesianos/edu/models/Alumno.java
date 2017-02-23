package es.salesianos.edu.models;

import java.io.Serializable;

public class Alumno implements Serializable{
	
	private String name;
	
	public String getBocadillo() {
		return bocadillo;
	}
	public void setBocadillo(String bocadillo) {
		this.bocadillo = bocadillo;
	}
	private String bocadillo;
	


}
