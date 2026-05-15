import java.util.Scanner;

public class ParesWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero, i = 0;

        System.out.print("Ingrese un numero: ");
        numero = sc.nextInt();

        while (i <= numero) {

            if (i % 2 == 0) {
                System.out.println(i);
            }

            i++;
        }
    }
}