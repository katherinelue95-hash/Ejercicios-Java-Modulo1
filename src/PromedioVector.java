import java.util.Scanner;

public class PromedioVector {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[12];
        int suma = 0;
        double promedio;

        for (int i = 0; i < numeros.length; i++) {

            System.out.print("Ingrese un numero: ");
            numeros[i] = sc.nextInt();

            suma += numeros[i];
        }

        promedio = suma / 12.0;

        System.out.println("Promedio: " + promedio);
    }
}