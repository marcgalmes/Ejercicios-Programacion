package org.foobarspam.JAXBCotxox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Carrera", propOrder = {
    "tiempoEsperado",
    "tiempoCarrera",
    "costeTotal",
    "origen",
    "destino",
    "distancia",
    "tarjetaCredito",
    "conductor"
})
public class Carrera {

    @XmlElement(required = true)
	private int tiempoEsperado = 0;
    @XmlElement
	private int tiempoCarrera = 0;
	@XmlElement
	private int costeTotal = 0;
    @XmlElement(required = true)
	private Conductor conductor = null;
	private String tarjetaCredito = "";
	private String origen = "";
	//private Conductor conductor;
	private String destino = "";
	private double distancia = 0;
	private int propina =0;


	public Carrera(String tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;
	}

	/*
	 * devuelve el numero de la tarjeta de cr�dito del usuario
	 */
	public String getTarjetaCredito() {
		return this.tarjetaCredito;
	}

	public String getOrigen() {
		return this.origen;
	}

	public String getDestino() {
		return this.destino;
	}

	public double getDistancia() {
		return this.distancia;
	}

	public double getCosteEsperado() {
		return  Tarifa.getCosteTotalEsperado(this);
	}

	public void asignarConductor(PoolConductores conductores) {
		conductor = conductores.getConductor();
	}

	public void realizarPago(double costeEsperado) {
		costeTotal += costeEsperado;
	}

	public void recibirPropina(int propina) {
		this.propina  = propina;
	}

	public void liberarConductor() {
		this.conductor.setOcupado(false);		
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public void setDestino(String destino) {
		this.destino = destino;		
	}

	public void setTiempoEsperado(int tiempoEsperadoMinutos) {
		this.tiempoEsperado = tiempoEsperadoMinutos;
		
	}

	public void setDistancia(double distancia) {

		this.distancia = distancia;
	}

	public Conductor getConductor() {
		return this.conductor;
	}

	public int getPropina() {
		return this.propina;
	}

	public double getCosteTotal() {
		return Tarifa.getCosteTotalEsperado(this);
	}
	
	/**
	 * @return the tiempoEsperado
	 */
	public int getTiempoEsperado() {
		return tiempoEsperado;
	}

	/**
	 * @return the tiempoCarrera
	 */
	public int getTiempoCarrera() {
		return tiempoCarrera;
	}


}
