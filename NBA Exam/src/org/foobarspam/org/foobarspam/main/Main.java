package org.foobarspam.org.foobarspam.main;

/**
 * Created by viC on 07/06/2017.
 */

import org.foobarspam.item.CompuestoItem;
import org.foobarspam.item.Item;
import org.foobarspam.item.SimpleItem;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n *** crear item simple y testear su nombre *** \n");


        SimpleItem Lakers = new SimpleItem("Lakers");
        System.out.println("equipo: " + Lakers.getNombre());


        System.out.println("\n *** crear item compuesto y testear su nombre *** \n");


        CompuestoItem Pacific = new CompuestoItem("Pacific");
        System.out.println("division: " + Pacific.getNombre());


        System.out.println("\n *** añadir item simple a compuesto y comprobar nombre *** \n");


        Pacific.anhadir(Lakers);
        System.out.println("OK: se ha añadido item equipo: " + Lakers.getNombre());



        System.out.println("\n *** recorrer un item compuesto mostrando su nombre y el de sus hijos: 1 hijo, profundidad 1 *** \n");


        System.out.println(Pacific.getNombre());
        Pacific.iterable();


        System.out.println("\n ***añadir varios hijos desde array de strings y recorrer un item compuesto mostrando su nombre y el de sus hijos: n hijos, profundidad 1 *** \n");


        String[] equiposAtlantic = {"Celtics", "Nets", "Knicks", "76ers", "Raptors"};
        CompuestoItem Atlantic = new CompuestoItem("Atlantic");

        for (String equipo : equiposAtlantic) {
            Atlantic.anhadir(new SimpleItem(equipo));
        }
        System.out.println(Atlantic.getNombre());
        Atlantic.iterable();

        System.out.println("\n *** recorrer un item compuesto por otros compuestos, mostrando su nombre y el de sus hijos: n hijos, profundidad n *** \n");


        CompuestoItem NBA = new CompuestoItem("NBA");
        CompuestoItem Este = new CompuestoItem("Este");
        NBA.anhadir(Este);
        Este.anhadir(Atlantic);
        System.out.println(NBA.getNombre());
        NBA.iterable();
        Este.iterable();
        Atlantic.iterable();


        System.out.println("\n *** crear un elemento compuesto de simples a partir de un array de strings *** \n");



        String[] equiposCentral = {"Bulls", "Cavs", "Pistons", "Pacers", "Bucks"};
        CompuestoItem Central = new CompuestoItem("Central");
        System.out.println(Central.getNombre());
        Central.composite(equiposCentral);
        Central.iterable();


        System.out.println("\n *** crear un elemento compuesto de elementos compuestos a partir de un array de objetos simples *** \n");

        String[] equiposSouthEast = {"Heat", "Hawks", "Hornets", "Wizzards", "Magic"};


        CompuestoItem SouthEast = new CompuestoItem("SouthEast");
        SouthEast.composite(equiposSouthEast);
        System.out.println(SouthEast.getNombre());
        SouthEast.iterable();


        System.out.println("\n *** crear un elemento compuesto de elementos compuestos a partir de un array de objetos compuestos *** \n");


        CompuestoItem[] divisiones = {Atlantic, Central, SouthEast};

        CompuestoItem East = new CompuestoItem("Este");
        System.out.println(East.getNombre());
        East.composite(divisiones);
        East.iterable();

        System.out.println("\n *** eliminar un hijo a profundidad n *** \n");


        East.quitar("Atlantic");
        East.iterable();

        // Crea la conferencia Oeste completa y añadela a la liga; muestra por pantalla la liga completa

        System.out.println("\n *** Liga NBA completa con sus conferencias, divisiones y equipos *** \n");

        Item West = new CompuestoItem("Oeste");

        String[] equiposNoroeste = {"Denver", "Minnesota", "Oklahoma", "Portland", "Utah"};
        Item NorthEast = new CompuestoItem("Noroeste");
        NorthEast.composite(equiposNoroeste);

        String[] equiposSuroeste = {"Dallas", "Houston", "Memphis", "Pelicans", "Spurs"};
        SouthEast.composite(equiposSuroeste);

        String[] equiposPacifico = {"Warriors", "Clippers", "Lakers", "Suns", "Kings"};
        Pacific.composite(equiposPacifico);

        Item[] oesteEquipos = {NorthEast, SouthEast, Pacific};
        West.composite(oesteEquipos);
        
        NBA.quitar("Este");
        NBA.anhadir(West);
        NBA.anhadir(East);
        NBA.iterable();

    }




}