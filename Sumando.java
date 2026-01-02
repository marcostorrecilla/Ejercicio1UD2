package sumando;

import java.util.Scanner;

public class Sumando {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();

        System.out.println("La suma es: " + (num1 + num2));

        sc.close();
    }
}

