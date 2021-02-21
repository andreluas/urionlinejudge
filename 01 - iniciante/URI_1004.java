/**
 * Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua esta operação à variável PROD. A seguir mostre a variável PROD com mensagem correspondente.   
 */
import java.util.Scanner;

public class URI_1004 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int PROD = A*B;
        System.out.println("PROD = " + PROD);

        input.close();
    }
}
