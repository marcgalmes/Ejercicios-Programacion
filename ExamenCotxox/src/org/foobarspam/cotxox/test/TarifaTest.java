package org.foobarspam.cotxox.test;

import static org.junit.Assert.*;

import org.foobarspam.cotxox.carrera.Carrera;
import org.foobarspam.cotxox.tarifa.Tarifa;
import org.junit.Test;

public class TarifaTest {

	@Test
	public void test() {
		System.out.println(Tarifa.getCosteDistancia(10));
		System.out.println(Tarifa.getCosteTiempo(10));
		
		String tarjetaCredito = "4916119711304546";
		String origen = "Aeroport Son Sant Joan";
		String destino= "Magaluf";
		double distancia = 7.75;
		int tiempoEsperadoMinutos = 10;
		Carrera carrera = new Carrera(tarjetaCredito);
		carrera.setOrigen(origen);
		carrera.setDestino(destino);
		carrera.setDistancia(distancia);
		carrera.setTiempoEsperado(tiempoEsperadoMinutos);
		
		System.out.println(Tarifa.getCosteTotalEsperado(carrera));
		
	}
	
	@Test
	public void test0() {
		System.out.println(Tarifa.getCosteDistancia(10));
		System.out.println(Tarifa.getCosteTiempo(10));
		
		String tarjetaCredito = "4916119711304546";
		String origen = "Aeroport Son Sant Joan";
		String destino= "Magaluf";
		double distancia = 0;
		int tiempoEsperadoMinutos = 0;
		Carrera carrera = new Carrera(tarjetaCredito);
		carrera.setOrigen(origen);
		carrera.setDestino(destino);
		carrera.setDistancia(distancia);
		carrera.setTiempoEsperado(tiempoEsperadoMinutos);
		
		System.out.println(Tarifa.getCosteTotalEsperado(carrera));
		
	}

}
