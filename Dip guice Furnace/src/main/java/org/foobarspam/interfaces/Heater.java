
package org.foobarspam.interfaces;

import org.foobarspam.types.RoomTemperature;

public interface Heater {

    void engage(RoomTemperature temperature);
    void disengage(RoomTemperature temperature);

}