package org.foobarspam.item;

import org.foobarspam.interfaces.Composite;
import org.foobarspam.interfaces.Iterable;

import java.util.ArrayList;

/**
 * Created by viC on 07/06/2017.
 */

public abstract class Item implements Composite, Iterable {

    private String nombre;
    private boolean compuesto;
    ArrayList<Item> hijos = new ArrayList<>();

    //Constructor

    public Item(String nombre, boolean compuesto) {
        this.nombre = nombre;
        this.compuesto = compuesto;
    }

    //Getters

    public String getNombre() {
        return this.nombre;
    }

    public boolean isCompuesto() {
        return this.compuesto;
    }

    //

    public void anhadir(Item item) {
        hijos.add(item);
    }
}

