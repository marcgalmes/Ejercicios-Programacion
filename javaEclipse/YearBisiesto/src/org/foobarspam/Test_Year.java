package org.foobarspam;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_Year {

	@Test
	public void test_esBisiesto_1998() {
		Year year = new Year(1998);
		assertEquals("caso test year bisiesto 1998",false,year.esBisiesto());
	}
	
	@Test
	public void test_esBisiesto_1200() {
		Year year = new Year(1200);
		assertEquals("caso test year bisiesto 1200",true,year.esBisiesto());
	}
	
	@Test
	public void test_esBisiesto_1300() {
		Year year = new Year(1300);
		assertEquals("caso test year bisiesto 1300",false,year.esBisiesto());
	}
	
	@Test
	public void test_esBisiesto_0() {
		Year year = new Year(0);
		assertEquals("caso test year bisiesto 0",true,year.esBisiesto());
	}
	
	@Test
	public void test_esBisiesto_2000() {
		Year year = new Year(2000);
		assertEquals("caso test year bisiesto 2000",true,year.esBisiesto());
	}

}
