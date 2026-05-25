import java.util.Scanner;

public class MatrizInvertida {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[][] articulos = new String[3][3];

        for (int fila = 0; fila < 3; fila++) {

            for (int columna = 0; columna < 3; columna++) {

                System.out.print("Ingrese articulo: ");
                articulos[fila][columna] = sc.nextLine();
            }
        }

        System.out.println("Matriz invertida:");

        for (int fila = 2; fila >= 0; fila--) {

            for (int columna = 0; columna < 3; columna++) {

                System.out.print(articulos[fila][columna] + " ");
            }

            System.out.println();
        }
    }
}