package org.foobarspam.injector;

import org.foobarspam.hardware.GasHeater;
import org.foobarspam.hardware.Sensor;
import org.foobarspam.interfaces.Heater;
import org.foobarspam.interfaces.Thermometer;
import org.foobarspam.stuff.Jedi;

import com.google.inject.AbstractModule;

public class ReguladorModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(Heater.class).to(GasHeater.class);
        bind(Heater.class).annotatedWith(Force.class).to(Jedi.class);
        bind(Thermometer.class).to(Sensor.class);
    }

}