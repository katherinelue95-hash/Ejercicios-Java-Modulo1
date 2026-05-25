import java.util.Scanner;

public class ParesImpares {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[12];

        int pares = 0;
        int impares = 0;

        for (int i = 0; i < numeros.length; i++) {

            System.out.print("Ingrese un numero: ");
            numeros[i] = sc.nextInt();

            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
    }
}