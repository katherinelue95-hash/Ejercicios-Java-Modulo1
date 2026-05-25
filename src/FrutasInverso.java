import java.util.Scanner;

public class FrutasInverso {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] frutas = new String[10];

        for (int i = 0; i < frutas.length; i++) {

            System.out.print("Ingrese una fruta: ");
            frutas[i] = sc.nextLine();
        }

        System.out.println("Frutas en orden inverso:");

        for (int i = frutas.length - 1; i >= 0; i--) {

            System.out.println(frutas[i]);
        }
    }
}