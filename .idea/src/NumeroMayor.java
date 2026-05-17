import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n1, n2, n3, mayor;

        System.out.println("Ingrese el primer número:");
        n1 = entrada.nextDouble();

        System.out.println("Ingrese el segundo número:");
        n2 = entrada.nextDouble();

        System.out.println("Ingrese el tercer número:");
        n3 = entrada.nextDouble();

        // Lógica de descarte para hallar el mayor
        if (n1 >= n2 && n1 >= n3) {
            mayor = n1;
        } else if (n2 >= n1 && n2 >= n3) {
            mayor = n2;
        } else {
            mayor = n3;
        }

        System.out.println("El número mayor de los tres es: " + mayor);
    }
}
