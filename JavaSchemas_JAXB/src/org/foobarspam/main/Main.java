package org.foobarspam.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;



public class Main {
    public static void main( String[] args ){
    	try {
    		JAXBContext jc = JAXBContext.newInstance(Carrera.class.getPackage().getName());
			Unmarshaller u = jc.createUnmarshaller();
			InputStream in = Main.class.getResourceAsStream("src/schemas/cotxox.xml");
			JAXBElement<Carrera> objetoCarrera = (JAXBElement<Carrera>)u.unmarshal(in);
			
			
			System.out.println(objetoCarrera.getName() + " : ");
			System.out.println("Tipo de tarjeta: " + objetoCarrera.getValue().getTarjetaCredito());
			System.out.println("Origen: " + objetoCarrera.getValue().getOrigen());
			System.out.println("Destino: " + objetoCarrera.getValue().getDestino());
			System.out.println("Distancia del recorrido: " + objetoCarrera.getValue().getDistancia()+ "km");
			System.out.println("Coste total: " + objetoCarrera.getValue().getCosteTotal() + "�");
			System.out.println("Propina: " + objetoCarrera.getValue().getPropina() + "�");
			System.out.println("Conductor asignado: " + objetoCarrera.getValue().getConductor().getNombre());
			System.out.println("media valoracion: " + objetoCarrera.getValue().getConductor().getValoracionMedia());
			System.out.println("modelo de coche: " + objetoCarrera.getValue().getConductor().getModeloCoche());
			System.out.println("matricula: " + objetoCarrera.getValue().getConductor().getMatricula());
			
			
			System.out.println("Objeto en memoria marshalled a XML: ");
			Marshaller m = jc.createMarshaller(); 			
			m.marshal( objetoCarrera, System.out );
			File fichero = new File("marshalizado.xml");
			fichero.createNewFile();
			m.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "https://api.mobipalma.mobi/docs/ cotxox.xsd");
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			m.marshal( objetoCarrera, fichero );
			System.out.println("\n Objeto en memoria marshalled a fichero: " + fichero.getPath());
    	}catch (JAXBException | IOException ex) {
			ex.printStackTrace();
		}
    }
}