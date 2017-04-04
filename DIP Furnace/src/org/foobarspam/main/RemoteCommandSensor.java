package org.foobarspam.main;

public class RemoteCommandSensor implements Thermometer {

	@Override
	public double read(AmbientTemperature temp) {
		return temp.getTemp();
	}
	
}

