package org.foobarspam.cotxox.test;

import static org.junit.Assert.*;

import org.foobarspam.cotxox.conductores.Conductor;
import org.junit.Test;

public class ConductorTest {

	@Test
	public void testConductor() {

		String[] nombres = {"Samantha", "Fox", "Mola"};
		String[] matricula = {"4ABC123", "5DHJ444", "7JKK555"};
		String[] modelos = {"Chevy Malibu", "Toyota Prius", "Mercedes A"};
		
		Conductor conductor = new Conductor(nombres[1]);
		conductor.setMatricula(matricula[1]);
		conductor.setModelo(modelos[1]);
		
		System.out.println("Conductor:"+conductor.getNombre());
		System.out.println("Matricula:"+conductor.getMatricula());
		System.out.println("Modelo:"+conductor.getModelo());
		System.out.println("Valoracion:"+conductor.getValoracion());
	}
		
	
}
