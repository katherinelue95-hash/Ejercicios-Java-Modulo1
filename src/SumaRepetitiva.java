import java.util.Scanner;

public class SumaRepetitiva {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, num2, suma;
        String opcion = "si";

        while (opcion.equalsIgnoreCase("si")) {

            System.out.print("Ingrese el primer numero: ");
            num1 = sc.nextInt();

            System.out.print("Ingrese el segundo numero: ");
            num2 = sc.nextInt();

            suma = num1 + num2;

            System.out.println("La suma es: " + suma);

            System.out.print("Desea continuar? ");
            opcion = sc.next();
        }
    }
}