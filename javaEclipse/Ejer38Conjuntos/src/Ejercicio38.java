import java.util.TreeSet;

public class Ejercicio38 {
	public static void main(String[] args) {
  
String frase = "dabale arroz a la zorra el abad";
  
TreeSet <Character> caracteres = new TreeSet <Character>(); 
  
for(int i = 0; i < frase.length(); i++) {
   caracteres.add(frase.charAt(i)); 
}
  
for(Character letra:caracteres){
   System.out.print(letra + "  ");
}
	}
}
