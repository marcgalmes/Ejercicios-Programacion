package org.foobarspam.JAXBCotxox;

import java.util.ArrayList;

public class Conductor {

	private String nombre = "";
	private String matricula = "";
	private String modelo = "";
	private double valoracionMedia = 0;
	private ArrayList<Byte> valoraciones = new ArrayList();
	private boolean ocupado = true;

	public Conductor(String nombre) {
		this.nombre  = nombre;
	}

	public void setMatricula(String matricula) {
		this.matricula=matricula;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setValoracion(byte valoracion) {
		valoraciones.add(valoracion);
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public boolean isOcupado() {
		// todo auto-generated method stub
		return this.ocupado ;
	}

	public double getValoracion() {
		valoracionMedia = 0;
		for (byte valoracion:valoraciones) {
			valoracionMedia += valoracion;
		}
		valoracionMedia /= valoraciones.size(); 
		return valoracionMedia;
	}

	public void setOcupado(boolean b) {
		ocupado = b;
	}


}
