package org.foobarspam.hardware;

import org.foobarspam.interfaces.Heater;
import org.foobarspam.types.RoomTemperature;

import com.google.inject.Singleton;

@Singleton
public class GasHeater implements Heater {

    public void engage(RoomTemperature temperature){
        temperature.incrementTemperature(1);
    }

    public void disengage(RoomTemperature temperature){
        temperature.incrementTemperature(-1);
    }
}