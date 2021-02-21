/**
 * Leia dois valores inteiros, no caso para variáveis A e B. A seguir, calcule a soma entre elas e atribua à variável SOMA. A seguir escrever o valor desta variável.
 */

import java.util.Scanner;

public class URI_1003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int SOMA = A+B;
        System.out.println("SOMA = " + SOMA);

        input.close();
    }
}