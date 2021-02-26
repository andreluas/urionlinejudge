/**
 * Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.
 */

import java.util.Scanner;
import java.util.Locale;

public class URI_1019 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int entradaSegundos = input.nextInt();
        int horas = entradaSegundos/3600;
        entradaSegundos = entradaSegundos%3600;
        int minutos = entradaSegundos/60;
        entradaSegundos = entradaSegundos%60;
        System.out.println(horas + ":" + minutos + ":" + entradaSegundos);
        input.close();
    }
}
