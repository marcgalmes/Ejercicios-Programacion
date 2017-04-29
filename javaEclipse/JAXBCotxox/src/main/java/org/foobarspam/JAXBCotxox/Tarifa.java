package org.foobarspam.JAXBCotxox;

public class Tarifa {
	private static double costeMilla = 1.35;
	private static double costeMinuto = 0.35;
	private double costeMinimo = 5.0;
	private double porcentajeComision = 20;
	public static double getCosteDistancia(double distancia){
		return getCosteMilla() * distancia;
	}
	public static double getCosteTiempo(int minutos) {
		return getCosteMinuto() * minutos;
	}
	public static double getCosteTotalEsperado(Carrera carrera) {
		return getCosteDistancia(carrera.getDistancia())+getCosteTiempo(carrera.getTiempoEsperado());
	}
	/**
	 * @return the costeMilla
	 */
	public static double getCosteMilla() {
		return costeMilla;
	}
	/**
	 * @return the costeMinuto
	 */
	public static double getCosteMinuto() {
		return costeMinuto;
	}
	/**
	 * @return the costeMinimo
	 */
	public double getCosteMinimo() {
		return costeMinimo;
	}
	/**
	 * @return the porcentajeComision
	 */
	public double getPorcentajeComision() {
		return porcentajeComision;
	}

}
