package org.foobarspam;

public class Year {

	//propiedad year
	private int year = 0;

	public Year(int year) {
		//propiedad year,constructor
		this.year  = year;
	}
	
	public Boolean esBisiesto() {
		// calcular si es bisiesto (divisible por 4)
		return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
	}

	private int getYear() {
		// propiedad year
		return this.year;
	}

}
