package org.foobarspam.hardware;

import org.foobarspam.interfaces.Thermometer;
import org.foobarspam.types.RoomTemperature;

import com.google.inject.Singleton;

@Singleton
public class Sensor implements Thermometer {

    public double read(RoomTemperature temperature){
        return temperature.getTemperature();
    }

}