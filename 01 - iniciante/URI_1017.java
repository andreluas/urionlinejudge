/**
 * Joaozinho quer calcular e mostrar a quantidade de litros de combustível gastos em uma viagem, ao utilizar um automóvel que faz 12 KM/L. Para isso, ele gostaria que você o auxiliasse através de um simples programa. Para efetuar o cálculo, deve-se fornecer o tempo gasto na viagem (em horas) e a velocidade média durante a mesma (em km/h). Assim, pode-se obter distância percorrida e, em seguida, calcular quantos litros seriam necessários. Mostre o valor com 3 casas decimais após o ponto.
 */

import java.util.Scanner;
import java.util.Locale;

public class URI_1017 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int tempoViagem = input.nextInt();
        int velocidade = input.nextInt();
        double calc = (tempoViagem * velocidade) / 12.0;

        System.out.printf("%.3f%n", calc);
        input.close();
    }
}