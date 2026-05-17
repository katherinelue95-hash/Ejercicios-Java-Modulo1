import java.util.Scanner;

public class NotasBasico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, nota3, promedio;

        System.out.println("Ingrese la nota 1:");
        nota1 = entrada.nextDouble();

        System.out.println("Ingrese la nota 2:");
        nota2 = entrada.nextDouble();

        System.out.println("Ingrese la nota 3:");
        nota3 = entrada.nextDouble();

        promedio = (nota1 + nota2 + nota3) / 3;

        System.out.println("Su promedio es: " + promedio);

        if (promedio >= 6.0) {
            System.out.println("Estado: APROBADO");
        } else {
            System.out.println("Estado: REPROBADO");
        }
    }
}
