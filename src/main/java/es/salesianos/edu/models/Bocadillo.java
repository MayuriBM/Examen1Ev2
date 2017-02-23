package es.salesianos.edu.models;

import java.io.Serializable;

public class Bocadillo implements Serializable {
	private String tofu;
	private String longaniza;
	
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
