package org.foobarspam.hardware;


import org.foobarspam.injector.Force;
import org.foobarspam.interfaces.Heater;
import org.foobarspam.interfaces.Regulate;
import org.foobarspam.interfaces.Thermometer;
import org.foobarspam.types.RegulatorDisplayCodes;
import org.foobarspam.types.RoomTemperature;

import com.google.inject.Inject;

public class Regulator implements Regulate {

    private Thermometer t;
    private Heater h;
    private double minTemp;
    private double maxTemp;
    private RoomTemperature temperature;
    private RegulatorDisplayCodes code;

    @Inject
    Regulator(Thermometer t, @Force Heater h) {
        this.t = t;
        this.h = h;
    }

    public void setTemperature(RoomTemperature temperature) {
        this.temperature = temperature;
    }

    public void setMinTemp(double minTemp) {
        this.minTemp = minTemp;
    }

    public void setMaxTemp(double maxTemp) {
        this.maxTemp = maxTemp;
    }

    public void regulate(){
        while(t.read(temperature) < maxTemp){
            this.code = RegulatorDisplayCodes.HEATING;
            h.engage(temperature);
            message();
        }
        while (t.read(temperature) > minTemp){
            this.code = RegulatorDisplayCodes.WAITING;
            h.disengage(temperature);
            message();
        }
    }

    public void message(){
        switch(code){
            case HEATING:
                System.out.println("Heating --> temperature "+ temperature.getTemperature());
                break;
            case WAITING:
                System.out.println("Turning off --> temperature " + temperature.getTemperature());
                break;
            default:
                System.out.println("Something went wrong");
                break;
        }
    }

}