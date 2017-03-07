package ejercicios;


public class Ejercicio18 {
    public static void main(String[] args) {

        int[][] matriz = new int[10][10];

        //damos valores y los escribimos
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                }
                else{
                    matriz[i][j] = 0;
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
