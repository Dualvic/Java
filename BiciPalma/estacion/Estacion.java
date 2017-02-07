package estacion;

import bicicleta.Bicicleta;
import java.util.ArrayList;

import bicicleta.Bicicleta;

public class Estacion {

	private int id;
	private String direccion;
	private int numeroAnclajes;
	private Bicicleta[] anclajes = new Bicicleta[0];

	// Constructor

	public Estacion(int id, String direccion, int anclajes) {

		this.id = id;
		this.direccion = direccion;
		this.numeroAnclajes = anclajes;
		this.anclajes = new Bicicleta[anclajes];
	}

	// getters

	public int getNumeroAnclajes() {
		return this.numeroAnclajes;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public int getId() {
		return this.id;
	}

	public Bicicleta[] getAnclajes() {
		return this.anclajes;
	}

	// methods

	public String consultarEstacion() {
		return ("id: " + this.id + "\n" + "direccion: " + this.direccion + "\n" + "numero de anclajes: "
				+ this.numeroAnclajes);
	}

	public String anclajesLibres() {
		String mensaje = "Anclajes libres: " + getNumeroAnclajes();

		return mensaje;
	}

	public void anclarBicicletas(Bicicleta bicicleta) {

		for (int i = 0; i < anclajes.length; i++) {
			if (getAnclajes()[i] != null) {
				getAnclajes()[i] = bicicleta;
			}
		}
		mostrarAnclajes(bicicleta);
	}

	public void mostrarAnclajes(Bicicleta bicicleta) {
		for (int i = 0; i < anclajes.length; i++) {
			if (getAnclajes()[i] != null) {
				System.out.println("Anclaje: " + i + " " + anclajes[i] + ".");
			} else {
				System.out.println("Anclaje; " + i + " bicicleta no asignada.");
			}

		}

	}

}
