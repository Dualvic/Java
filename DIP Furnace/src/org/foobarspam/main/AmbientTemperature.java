package org.foobarspam.main;

public class AmbientTemperature {
	
	private double temperature = 0.0d;
	
	public AmbientTemperature(double temp) {
		this.temperature = temp;
	}
	
	// getters & setters
	
	public void setTemperature(double temp) {
		this.temperature = temp;
	}
	
	public double getTemp() {
		return temperature;
	}
	
	public void increaseTemperature(double temp) {
		this.temperature += temp;
	}

}
