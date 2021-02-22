/**
 * Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
 */

import java.util.Scanner;
import java.util.Locale;

public class URI_1012 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();
        double pi = 3.14159;

        double trianguloCalc =  (A*C)/2;
        double circuloCalc = pi * Math.pow(C, 2);
        double trapezioCalc = (A+B)*C/2;
        double quadradoCalc = Math.pow(B, 2);
        double retanguloCalc = A*B;

        System.out.printf("TRIANGULO: %.3f%n", trianguloCalc);
        System.out.printf("CIRCULO: %.3f%n", circuloCalc);
        System.out.printf("TRAPEZIO: %.3f%n", trapezioCalc);
        System.out.printf("QUADRADO: %.3f%n", quadradoCalc);
        System.out.printf("RETANGULO: %.3f%n", retanguloCalc);

        input.close();
    }
}