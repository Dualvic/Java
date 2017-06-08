package org.foobarspam.item;

/**
 * Created by viC on 07/06/2017.
 */
public class CompuestoItem extends Item{

    public CompuestoItem(String nombre) {
        super(nombre, true);
    }

    @Override
    public void iterable() {
        for (int i= 0; i < hijos.size(); i++) {
            if (hijos.get(i).isCompuesto() == true){
                System.out.println(hijos.get(i).getNombre());
            }else {
                System.out.println("---------- [ " + hijos.get(i).getNombre());
            }
        }
    }
}
