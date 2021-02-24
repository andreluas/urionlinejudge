/**
 * Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem eh o maior
 */

import java.util.Scanner;
import java.util.Locale;

public class URI_1013 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();

        int maiorAB = (A + B + Math.abs(A - B)) / 2;
        int maiorABC  = (maiorAB + C + Math.abs(maiorAB - C)) / 2;

        System.out.println(maiorABC + " eh o maior");

        input.close();
    }
}