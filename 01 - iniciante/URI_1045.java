/**
 * URI_1045
 */

import java.util.Scanner;

public class URI_1045 {
    public static void main(String[] args) {
        double a, b, c;
        double  aux, a2, bc;
        Scanner input = new Scanner(System.in);

        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        if(b > a){
            aux = a;
            a = b;
            b = aux;
        }

        if(c > a){
            aux = a;
            a = c;
            c = aux;
        }

        a2 = Math.pow(a, 2);
        bc = Math.pow(b, 2) + Math.pow(c, 2);

        if(a >= b + c){
            System.out.println("NAO FORMA TRIANGULO");
        } 
        else {
            if(a2 > bc){
                System.out.println("TRIANGULO OBTUSANGULO");
            } else if (a2 < bc) {
                System.out.println("TRIANGULO ACUTANGULO");
            } else {
                System.out.println("TRIANGULO RETANGULO");
            }
        }

        if(a == b && b == c){
            System.out.println("TRIANGULO EQUILATERO");
        }
        else if(a == b || a == c || b == c) {
            System.out.println("TRIANGULO ISOSCELES");
        }

        input.close();
    }    
}