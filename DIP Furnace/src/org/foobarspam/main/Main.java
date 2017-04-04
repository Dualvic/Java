package org.foobarspam.main;

public class Main {
		
	public static void main(String[] args) {
		double minTemp = 15.0;
		double maxTemp = 22.0;
		AmbientTemperature temperature = new AmbientTemperature(15.0);
		Thermometer remoteCommand = new RemoteCommandSensor();
		Heater gasHeat = new GasHeater();
		Regulator regulador = new Regulator();
		
		System.out.println("#GasHeater Test");
		System.out.println("\n");
		GasHeater heatedGas = new GasHeater();
		regulador.regulate(remoteCommand, heatedGas, minTemp, maxTemp, temperature);

		System.out.println("\n");
		System.out.println("#LightSaber Test ~May the force guide you~");
		System.out.println("\n");
		maxTemp = 4000;
		Heater lightSaber = new LightSaber();
		regulador.regulate(remoteCommand, lightSaber, minTemp, maxTemp, temperature);
	}

}