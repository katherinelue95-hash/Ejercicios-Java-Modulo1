import java.util.Scanner;

public class SumaNumeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        int suma = 0;
        String opcion;

        do {

            System.out.print("Ingrese un numero: ");
            numero = sc.nextInt();

            suma += numero;

            System.out.print("Desea continuar? ");
            opcion = sc.next();

        } while (opcion.equalsIgnoreCase("si"));

        System.out.println("La suma total es: " + suma);
    }
}
