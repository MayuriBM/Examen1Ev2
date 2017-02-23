package es.salesianos.edu.models;

import java.io.Serializable;

public class Bocadillo implements Serializable {
	private String tofu;
	private String longaniza;
	private String precio;
	
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public String getTofu() {
		return tofu;
	}
	public void setTofu(String tofu) {
		this.tofu = tofu;
	}
	public String getLonganiza() {
		return longaniza;
	}
	public void setLonganiza(String longaniza) {
		this.longaniza = longaniza;
	}


}
