/**
 * Dois carros (X e Y) partem em uma mesma direção. O carro X sai com velocidade constante de 60 Km/h e o carro Y sai com velocidade constante de 90 Km/h.
 */

import java.util.Scanner;
import java.util.Locale;

public class URI_1016 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int distancia = input.nextInt();
        int minutos = (60 * distancia) / 30;

        System.out.println(minutos + " minutos");
        input.close();
    }
}