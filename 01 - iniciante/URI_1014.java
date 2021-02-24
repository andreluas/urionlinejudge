/**
 * Calcule o consumo médio de um automóvel sendo fornecidos a distância total percorrida (em Km) e o total de combustível gasto.
 */

import java.util.Scanner;
import java.util.Locale;

public class URI_1014 {
    public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       Scanner input = new Scanner(System.in);
       
        int X = input.nextInt();
        double Y = input.nextDouble();
        double calc = X/Y; 

        System.out.printf("%.3f km/l%n", calc);

       input.close();
    }
}