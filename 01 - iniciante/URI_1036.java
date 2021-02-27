/*
Leia 3 valores de ponto flutuante e efetue o calculo das raizes da equacao de Bhaskara. Se nao for possivel calcular as raizes, mostre a mensagem correspondente Impossivel calcular, caso haja uma divisao por 0 ou raiz de numero negativo. 
*/

import java.util.Scanner;
import java.util.Locale;

public class URI_1036 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();
        double delta = Math.pow(B, 2) - 4 * A * C; 
        double raiz =  Math.sqrt(delta);
        double denominador = 2 * A;

        double bhaskaraR1 = (-1 * B + raiz) / denominador;
        double bhaskaraR2 = (-1 * B - raiz) / denominador;  

        if(denominador == 0 || delta < 0){
            System.out.println("Impossivel calcular");
        } else {
            System.out.printf("R1 = %.5f%n", bhaskaraR1); 
            System.out.printf("R2 = %.5f%n", bhaskaraR2); 
        }
        
        input.close();
    }
}