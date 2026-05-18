import java.util.Scanner;

public class Circunferencia{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double radio, area;

        System.out.println("Ingrese el radio de la circunferencia");
        radio = entrada.nextDouble();

        //Usamos Math.PI para máxima precicsión acádemica
        area = Math.PI * Math.pow(radio,2);

        System.out.println("El área de la circunferencia es: " + area);
    }
}
