/**
 * Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.
 */

import java.util.Scanner;
import java.util.Locale;

public class URI_1018 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int entrada = input.nextInt();
        System.out.println(entrada);
        System.out.println(entrada/100 + " nota(s) de R$ 100,00");
        entrada = entrada%100;
        System.out.println(entrada/50 + " nota(s) de R$ 50,00");
        entrada = entrada%50;
        System.out.println(entrada/20 + " nota(s) de R$ 20,00");
        entrada = entrada%20;
        System.out.println(entrada/10 + " nota(s) de R$ 10,00");
        entrada = entrada%10;
        System.out.println(entrada/5 + " nota(s) de R$ 5,00");
        entrada = entrada%5;
        System.out.println(entrada/2 + " nota(s) de R$ 2,00");
        entrada = entrada%2;
        System.out.println(entrada/1 + " nota(s) de R$ 1,00");

        input.close();
    }
}