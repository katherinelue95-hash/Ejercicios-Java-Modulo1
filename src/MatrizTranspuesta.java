import java.util.Scanner;

public class MatrizTranspuesta {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        for (int fila = 0; fila < 3; fila++) {

            for (int columna = 0; columna < 3; columna++) {

                System.out.print("Ingrese valor: ");
                matriz[fila][columna] = sc.nextInt();
            }
        }

        System.out.println("Matriz transpuesta:");

        for (int fila = 0; fila < 3; fila++) {

            for (int columna = 0; columna < 3; columna++) {

                System.out.print(matriz[columna][fila] + " ");
            }

            System.out.println();
        }
    }
}