import java.util.Scanner;

public class DescuentoEtiquetas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double compra, descuento = 0, total;
        String etiqueta;

        System.out.print("Ingrese el valor de la compra: ");
        compra = sc.nextDouble();

        System.out.print("Ingrese el color de la etiqueta: ");
        etiqueta = sc.next();

        switch (etiqueta.toLowerCase()) {
            case "verde":
                descuento = compra * 0.05;
                break;

            case "roja":
                descuento = compra * 0.10;
                break;

            case "azul":
                descuento = compra * 0.15;
                break;

            case "dorada":
                descuento = compra * 0.20;
                break;

            default:
                descuento = 0;
        }

        total = compra - descuento;

        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + total);
    }
}