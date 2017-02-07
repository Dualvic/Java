package Test;
import estacion.Estacion;

import static org.junit.Assert.*;

import org.junit.Test;

import bicicleta.Bicicleta;


public class EstacionTest {

	@Test
	public void visualizarEstadoEstacion() {
		
		Estacion estacion = new Estacion(1, "Manacor", 6);
		
		String mensaje_esperado = "id: " + 1 + "\n" + "direccion: " + "Manacor" + "\n" + "numero de anclajes: " + 6;
		
		assertEquals(mensaje_esperado, estacion.consultarEstacion());
		
	}
	
	@Test
	public void anclajesLibresTest() {
		
		Estacion estacion = new Estacion(1, "manacor", 6);
		
		String mensaje_esperado = "Anclajes libres: " + 6; 
		
		assertEquals(mensaje_esperado, estacion.anclajesLibres());
			
	}
	
	@Test
	public void anclarBicicletasTest() {
		
		Estacion estacion = new Estacion(1, "manacor", 6);
		
		Bicicleta[] bicicletas = {291, 292, 293, 294};
		
		String mensaje_esperado = 	"Bicicleta: " + 291 + "anclada en el anclaje: " + 1 + "\n" + 
									"Bicicleta: " + 292 + "anclada en el anclaje: " + 2 + "\n" + 
									"Bicicleta: " + 293 + "anclada en el anclaje: " + 3 + "\n" + 
									"Bicicleta: " + 294 + "anclada en el anclaje: " + 4 + "\n"; 
		
		assertEquals(mensaje_esperado, estacion.anclarBicicletas(bicicletas));
		
	}
}
