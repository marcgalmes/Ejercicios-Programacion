package org.foobarspam.regulator;

public class GasHeater implements Heater {

	public void engage(AmbientTemperature temperature) {
		temperature.increase();
		
	}

	public void disengage(AmbientTemperature temperature) {
		// TODO Auto-generated method stub
		
	}

}
