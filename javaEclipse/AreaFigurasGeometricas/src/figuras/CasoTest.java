package figuras;

import static org.junit.Assert.*;

public class CasoTest {

	public static void main(String[] args) {
		Rectangulo rectangulo = new Rectangulo(3,4);
		assert (12 == rectangulo.area());
		
		Cuadrado cuadrado = new Cuadrado(3);
		assert (9 == cuadrado.area());
		
		Elipse elipse = new Elipse(3,4);
		
		System.out.println("ok");
	}

}
