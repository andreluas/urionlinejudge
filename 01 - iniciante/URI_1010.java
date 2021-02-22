/**
 * Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.
 */
import java.util.Scanner;
import java.util.Locale;

public class URI_1010 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int itemCod1 = input.nextInt();
        int itemQtd1 = input.nextInt();
        double valorUn1 = input.nextDouble();
        int itemCod2 = input.nextInt();
        int itemQtd2 = input.nextInt();
        double valorUn2 = input.nextDouble();

        double calc = (itemQtd1 * valorUn1) + (itemQtd2 * valorUn2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", calc);
        input.close();
        
    }
}