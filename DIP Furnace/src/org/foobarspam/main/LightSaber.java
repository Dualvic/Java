package org.foobarspam.main;

public class LightSaber implements Heater {
	
	@Override
	public void engage(AmbientTemperature temp){
		temp.increaseTemperature(100);
	}
	
	@Override
	public void disengage(AmbientTemperature temp) {
		temp.increaseTemperature(-100);
	}

}
