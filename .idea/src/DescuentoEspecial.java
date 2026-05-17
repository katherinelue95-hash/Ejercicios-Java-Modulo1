import java.util.Scanner;

public class DescuentoEspecial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double compra, porcentajeDesc = 0, montoDesc, totalPagar;

        System.out.println("Ingrese el valor total de la compra:");
        compra = entrada.nextDouble();

        // Estructura de rangos
        if (compra < 100) {
            porcentajeDesc = 0.0;
        } else if (compra >= 100 && compra <= 300) {
            porcentajeDesc = 0.10; // 10%
        } else if (compra > 300) {
            porcentajeDesc = 0.15; // 15%
        }

        montoDesc = compra * porcentajeDesc;
        totalPagar = compra - montoDesc;

        System.out.println("Porcentaje aplicado: " + (porcentajeDesc * 100) + "%");
        System.out.println("Monto del descuento: $" + montoDesc);
        System.out.println("Total final a pagar: $" + totalPagar);
    }
}
