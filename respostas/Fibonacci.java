package respostas;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();
        scanner.close();

        if (isFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence a sequencia de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " nao pertence a sequencia de Fibonacci.");
        }
    }

    public static boolean isFibonacci(int num) {
        if (num < 0) return false;

        int a = 0, b = 1;
        while (a <= num) {
            if (a == num) return true;
            int temp = a;
            a = b;
            b = temp + b;
        }
        return false;
    }
}
