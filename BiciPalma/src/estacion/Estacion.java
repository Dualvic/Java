package estacion;

import bicicleta.Bicicleta;
import tarjetausuario.TarjetaUsuario;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import bicicleta.Bicicleta;

public class Estacion {

	private int id = 0;
	private String direccion = null;
	private int numeroAnclajes = 0;
	private Bicicleta[] anclajes;

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

	public Bicicleta getAnclaje(int anclaje) {
		return this.anclajes[anclaje];
	}

	// methods

	public void consultarEstacion() {
		String mensaje = "id: " + this.id + "\n" + "direccion: " + this.direccion + "\n" + "numero de anclajes: "
				+ this.numeroAnclajes;

		System.out.println(mensaje);
	}

	public int anclajesLibres() {

		int libres = 0;
		for (int i = 0; i < anclajes.length; i++) {
			if (anclajes[i] == null) {
				libres += 1;
			}
		}

		return libres;
	}

	public void anclarBicicleta(Bicicleta bicicleta) {

		for (int i = 0; i < anclajes.length; i++) {
			if (getAnclaje(i) == null) {
				anclajes[i] = bicicleta;
				mostrarAnclaje(bicicleta, i);
				break;
			}
		}
	}

	public void mostrarAnclaje(Bicicleta bicicleta, int numeroAnclaje) {

		System.out.println("Bicleta: " + bicicleta.getId() + " anclada en el anclaje: " + numeroAnclaje);

	}

	public void consultarAnclajes() {
		for (int i = 0; i < anclajes.length; i++) {
			if (getAnclajes()[i] != null) {
				mostrarAnclaje(getAnclajes()[i], i);
			} else {
				System.out.println("Anclaje "+ i +": " + "libre");
			}
		}
	}

	public Boolean leerTarjetaUsuario(TarjetaUsuario tarjetaUsuario) {

		return tarjetaUsuario.getActivada();

	}

	public void retirarBicicleta(TarjetaUsuario tarjetaUsuario) {
		if (tarjetaUsuario.getActivada() == true) {

			int anclajeAleatorio = generarAnclaje();

			mostrarBicicleta(getAnclajes()[anclajeAleatorio], anclajeAleatorio);
			getAnclajes()[anclajeAleatorio] = null;

		}
	}

	public int generarAnclaje() {
		int anclaje = ThreadLocalRandom.current().nextInt(getAnclajes().length - 1);
		while (getAnclajes()[anclaje] == null) {
			anclaje = ThreadLocalRandom.current().nextInt(getAnclajes().length - 1);
		}
		return anclaje;
	}

	public void mostrarBicicleta(Bicicleta bicicleta, int numeroAnclaje) {
		System.out.println("Bicicleta retirada: " + bicicleta.getId() + " del anclaje: " + numeroAnclaje);
	}
}
