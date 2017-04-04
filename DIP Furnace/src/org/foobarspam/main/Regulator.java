package org.foobarspam.main;

public class Regulator {

	public void regulate(Thermometer t, Heater h, double minTemp, double maxTemp, AmbientTemperature temperature) {
		RegulatorDisplayCodes code;
		while (t.read(temperature) < maxTemp) {
			code = RegulatorDisplayCodes.HEATING;
			h.engage(temperature);
			message(code, temperature);
		}
		while (t.read(temperature) > minTemp) {
			code = RegulatorDisplayCodes.WAITING;
			h.disengage(temperature);
			message(code, temperature);
		}
	}

	private void message(RegulatorDisplayCodes code, AmbientTemperature temperature) {

		switch (code) {
		case HEATING:
			System.out.println("Heating... Temperature: " + temperature.getTemp() + " ºC");
			break;
		case WAITING:
			System.out.println("Shutting off... Temperature: " + temperature.getTemp() + " ºC");
			break;
		default:
			System.out.println("Something went wrong... :(");
			break;
		}
	}

}
