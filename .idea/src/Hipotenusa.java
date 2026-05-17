import java.util.Scanner;

public class Hipotenusa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double cateto1, cateto2, hipotenusa;

        System.out.println("Ingrese la longitud del primer cateto:");
        cateto1 = entrada.nextDouble();

        System.out.println("Ingrese la longitud del segundo cateto:");
        cateto2 = entrada.nextDouble();

        hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        System.out.println("La hipotenusa del triángulo es: " + hipotenusa);
    }
}
