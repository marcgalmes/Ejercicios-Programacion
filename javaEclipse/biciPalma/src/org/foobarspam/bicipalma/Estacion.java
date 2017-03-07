package org.foobarspam.bicipalma;

public class Estacion {
	
	private int id = 0;
	private String direccion = "";
	private int numeroAnclajes = 0;
	private Bicicleta[] anclajes = null;
	
	public Estacion () {
		
	}
	
	public Estacion (int id ,String direccion, int numeroAnclajes) {
		this.id = id;
		this.direccion = direccion;
		this.numeroAnclajes = numeroAnclajes ;
		this.anclajes = new Bicicleta[numeroAnclajes];
		
	}
	
	

}
