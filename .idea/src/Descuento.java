import java.util.Scanner;

public class Descuento{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double totalCompra, descuento, totalPagar;

        System.out.println("Ingrese el total de la compra");
        totalCompra = entrada.nextDouble();

        descuento = totalCompra * 0.10;
        totalPagar = totalCompra - descuento;

        System.out.println("Monto del descuento (10%): $" + descuento);
        System.out.println("Total neto a pagar: $" + totalPagar);
    }
}

