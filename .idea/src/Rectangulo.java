import java.util.Scanner;

public class Rectangulo{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double base, altura, area;

        System.out.println("Ingrese lal base del rectángulo:");
        base = entrada.nextDouble();

        System.out.println("Ingrese la altura del rectángulo:");
        altura = entrada.nextDouble();

        area = base * altura;

        System.out.println("El área del rectángulo es: " + area);
    }
}
