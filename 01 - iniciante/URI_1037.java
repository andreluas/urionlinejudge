/**
 * Voce deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes intervalos 0,25, 25,50, 50,75, 75,100 este valor se encontra. Obviamente se o valor nao estiver em nenhum destes intervalos, devera ser impressa a mensagem Fora de intervalo.
 */

import java.util.Locale;
import java.util.Scanner;

public class URI_1037 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double valor = input.nextDouble();

        if (valor < 0 || valor > 100){
            System.out.println("Fora de intervalo");
        } 

        if (valor >= 0 && valor <= 25){
            System.out.println("Intervalo [0,25]");
        } 

        if (valor > 25 && valor <= 50){
            System.out.println("Intervalo (25,50]");
        }

        if (valor > 50 && valor <= 25){
            System.out.println("Intervalor (50,75]");
        } 
        
        else if (valor > 75 && valor <= 100) {
            System.out.println("Intervalo (75,100]");
        }
        
        input.close();
    }
}
