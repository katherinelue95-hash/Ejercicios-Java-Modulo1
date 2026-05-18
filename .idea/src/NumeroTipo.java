import java.util.Scanner;

public class NumeroTipo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Ingrese un número entero:");
        numero = entrada.nextInt();

        if (numero > 0) {
            System.out.println("El número es POSITIVO");
        } else if (numero < 0) {
            System.out.println("El número es NEGATIVO");
        } else {
            System.out.println("El número es NEUTRO (Cero)");
        }
    }
}
