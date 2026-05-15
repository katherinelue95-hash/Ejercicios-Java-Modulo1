import java.util.Scanner;

public class ParesEntreNumeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, num2;

        System.out.print("Ingrese el primer numero: ");
        num1 = sc.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        num2 = sc.nextInt();

        while (num1 <= num2) {

            if (num1 % 2 == 0) {
                System.out.println(num1);
            }

            num1++;
        }
    }
}
