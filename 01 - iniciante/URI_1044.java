/**
 * Leia 2 valores inteiros A e B. Após, o programa deve mostrar uma mensagem Sao Multiplos ou Nao sao Multiplos, indicando se os valores lidos são múltiplos entre si
 */

import java.util.Scanner;
import java.io.IOException;

public class URI_1044 {
    public static void main(String[] args) throws IOException {
        int A, B;
        Scanner input = new Scanner(System.in);
        
        A = input.nextInt();
        B = input.nextInt();

        if(B%A == 0 || A%B == 0){
            System.out.print("Sao Multiplos\n");
        } else {
            System.out.print("Nao sao Multiplos\n");
        }

        input.close();
    }
}