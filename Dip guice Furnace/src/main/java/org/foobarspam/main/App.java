package org.foobarspam.main;


import org.foobarspam.hardware.Regulator;
import org.foobarspam.injector.ReguladorModule;
import org.foobarspam.stuff.Jedi;
import org.foobarspam.types.RoomTemperature;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class App
{
    public static void main( String[] args )
    {
        final double minTemp = 15.0;
        final double maxTemp = 21.0;

        RoomTemperature temperature = new RoomTemperature(15);

        Injector injector = Guice.createInjector(new ReguladorModule());
        Regulator regulador = injector.getInstance(Regulator.class);
        regulador.setMinTemp(minTemp);
        regulador.setMaxTemp(maxTemp);
        regulador.setTemperature(temperature);

        System.out.println( "Turning on..." );
        regulador.regulate();

        Jedi yoda = new Jedi();
        System.out.println( "\n Yoda getting started: " );
        regulador.regulate();
        yoda.speak();
    }
}