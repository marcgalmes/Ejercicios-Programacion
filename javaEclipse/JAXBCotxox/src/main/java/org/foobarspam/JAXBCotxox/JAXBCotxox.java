package org.foobarspam.JAXBCotxox;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class JAXBCotxox {

	public static void main(String[] args) {
		try {
			
			JAXBContext jc = JAXBContext.newInstance(Carrera.class.getPackage().getName());			
			Unmarshaller u = jc.createUnmarshaller();
			InputStream in = new FileInputStream("/JAXBCotxox/src/main/resources/org/foobarspam/JAXBCotxox/xml/cotxox.xml");
			
			JAXBElement<Carrera> objetoCarrera = (JAXBElement<Carrera>)u.unmarshal(in);
			System.out.println(objetoCarrera.getName() + " : ");
			System.out.println("Origen: " + objetoCarrera.getValue().getOrigen());
			System.out.println("Destino: " + objetoCarrera.getValue().getDestino());
			System.out.println("Distancia: " + objetoCarrera.getValue().getDistancia());
			
			//marshall
			System.out.println("Objeto en memoria marshalled a XML: ");
			
			Marshaller m = jc.createMarshaller(); 			
			m.marshal( objetoCarrera, System.out );
			
			
			File fichero = new File("marshalizado.xml");
			fichero.createNewFile();
			
			m.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "https://api.mobipalma.mobi/docs/ cotxox.xsd");
			
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			m.marshal(objetoCarrera, fichero );
			System.out.println("\n Objeto en memoria marshalled a fichero: " + fichero.getPath());
			
		} 
		catch (JAXBException | IOException ex) {
			ex.printStackTrace();
		}

	}
}
