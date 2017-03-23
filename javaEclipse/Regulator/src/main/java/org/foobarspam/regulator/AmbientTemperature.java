package org.foobarspam.regulator;

public class AmbientTemperature {

	private double temperature;

	public AmbientTemperature(double d) {
		temperature = d;
	}
	
	public double getTemperature() {
		return this.temperature;
	}
	
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	
	public void incrementTemperature(double increment){
		this.temperature += increment; 
	}

}
