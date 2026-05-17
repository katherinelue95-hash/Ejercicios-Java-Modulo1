import java.util.Scanner;

public class Suma {
    public static void main(String[] args)
    {
        //instancia de la clase Scanner
        Scanner entrada = new Scanner(System.in);

        double num1, num2, suma;

        //captura de datos
        System.out.println("Escriba el primer número");
        num1 = Double.parseDouble(entrada.next());

        System.out.println("Escriba el segundo número");
        num2 = entrada.nextDouble();

        //Operar el resultado
        suma = num1 + num2;

        //Mostrar el resultado
        System.out.println("");
    }
}
