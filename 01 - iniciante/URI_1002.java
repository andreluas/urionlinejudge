/***
 * A fórmula para calcular a área de uma circunferência é: area = π . raio2. Considerando para este problema que π = 3.14159:
- Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.
 */
import java.util.Scanner;
import java.util.Locale;

public class URI_1002 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        double pi = 3.14159;
        double raio = input.nextDouble();
        double area = pi * Math.pow(raio, 2);
        System.out.printf("A=%.4f%n", area);

        input.close();
    }
}