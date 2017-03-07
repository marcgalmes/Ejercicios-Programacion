package figuras;

public class Cuadrado extends FiguraGeometrica {
	
	/* Cuadrado no hereda de Rect�ngulo porque la relaci�n IS-A o ES-Una 
	 * trata sobre el comportamiento de objeto. 
	 * Un cuadrado no se comporta como un rect�ngulo. 
	 * El comportamiento determina la programaci�n por contrato de la clase Cuadrado y sus m�todos.
	 * Una instancia de Rect�ngulo no verificar�a la condici�n anchura = altura,
	 * por lo que se violar�a el principio de substituci�n de Liskov (LSP).
	 * */
	
	double lado = 0d;

	/* Sobrecarga de constructores: utilizo el constructor de la superclase FiguraGeometrica */
	
	public Cuadrado() {
		super();
	}

	public Cuadrado(double lado){
		super();
		this.lado = lado;
	}
	
	public Cuadrado(String nombre, double lado){
		super(nombre);
		this.lado = lado;
	}
	
	public double getLado(){
		return this.lado;
	}
	
	public void setlado(double lado){
		this.lado = lado;
	}
	
	@Override
	public double area(){
		return Math.pow(getLado(), 2);
	}
	
}