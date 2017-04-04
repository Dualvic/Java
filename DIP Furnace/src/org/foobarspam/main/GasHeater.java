package org.foobarspam.main;

public class GasHeater implements Heater{
	
	@Override
	public void engage(AmbientTemperature temp) {
		temp.increaseTemperature(1.0);
	}
	
	@Override
	public void disengage(AmbientTemperature temp) {
		temp.increaseTemperature(-1.0);
	}
}
