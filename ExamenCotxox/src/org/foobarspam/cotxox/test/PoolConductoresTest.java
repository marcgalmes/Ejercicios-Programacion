package org.foobarspam.cotxox.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.foobarspam.cotxox.conductores.Conductor;
import org.foobarspam.cotxox.conductores.PoolConductores;
import org.junit.Test;

public class PoolConductoresTest {

	@Test
	public void test() {

		ArrayList<Conductor> conductores = new ArrayList<>();
		Conductor conductor = null;
		String[] nombres = {"Samantha", "Fox", "Mola"};
		for(String nombre: nombres){
			conductor = new Conductor(nombre);
			conductores.add(conductor);
		}
		
		String[] matricula = {"4ABC123", "5DHJ444", "7JKK555"};
		String[] modelos = {"Chevy Malibu", "Toyota Prius", "Mercedes A"};
		PoolConductores poolConductores = new PoolConductores(conductores);
		System.out.println(poolConductores.getConductor());
	}

}
