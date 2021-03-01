/**
 * Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
 */

import java.util.Scanner;
import java.util.Locale;

public class URI_1038 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int id = input.nextInt();
        int qtd = input.nextInt();

        if (id == 1){
            System.out.printf("Total: R$ %.2f%n", qtd * 4.00);
        }

        if (id == 2){
            System.out.printf("Total: R$ %.2f%n", qtd * 4.50);
        }

        if (id == 3){
            System.out.printf("Total: R$ %.2f%n", qtd * 5.00);
        }

        if (id == 4){
            System.out.printf("Total: R$ %.2f%n", qtd * 2.00);
        }

        if (id == 5){
            System.out.printf("Total: R$ %.2f%n", qtd * 1.50);
        }

        input.close();
    }
}