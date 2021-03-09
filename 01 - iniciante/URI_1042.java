/**
 * Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os valores em ordem crescente, uma linha em branco e em seguida, os valores na sequência como foram lidos.
 */

import java.util.Scanner;

public class URI_1042 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a, b, c, min1, min2 = 0, min3 = 0;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        min1 = Math.min(a, Math.min(b,c));
        
        if(min1 == a){
            min2 = Math.min(b,c);
            min3 = Math.max(b,c);
        }

        if(min1 == b){
            min2 = Math.min(a,c);
            min3 = Math.max(a,c);
        }

        if(min1 == c){
            min2 = Math.min(a,b);
            min3 = Math.max(a,b);
        }

        System.out.print(min1+"\n"+min2+"\n"+min3+"\n\n");
        System.out.print(a+"\n"+b+"\n"+c+"\n");
        
        input.close();
    }
}