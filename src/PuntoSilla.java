import java.util.Scanner;

public class PuntoSilla {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][4];

        for (int fila = 0; fila < 3; fila++) {

            for (int columna = 0; columna < 4; columna++) {

                System.out.print("Ingrese valor: ");
                matriz[fila][columna] = sc.nextInt();
            }
        }

        boolean encontrado = false;

        for (int fila = 0; fila < 3; fila++) {

            int menor = matriz[fila][0];
            int columnaMenor = 0;

            for (int columna = 1; columna < 4; columna++) {

                if (matriz[fila][columna] < menor) {
                    menor = matriz[fila][columna];
                    columnaMenor = columna;
                }
            }

            boolean puntoSilla = true;

            for (int i = 0; i < 3; i++) {

                if (matriz[i][columnaMenor] > menor) {
                    puntoSilla = false;
                }
            }

            if (puntoSilla) {
                System.out.println("Punto de silla: " + menor);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No existe punto de silla");
        }
    }
}
