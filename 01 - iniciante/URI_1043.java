/**
 * Leia 3 valores reais A, B e C e verifique se eles formam ou não um triangulo. Em caso positivo, calcule o perimetro do triangulo e apresente a mensagem
 */

import java.util.Scanner;

public class URI_1043 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a, b, c, areaTriangulo, perimetroTriangulo;

        a = input.nextFloat();        
        b = input.nextFloat();        
        c = input.nextFloat();        

        if((a < (float)(b+c)) && (b < (float)(a+c)) && (c < (float)(b+a))){
            perimetroTriangulo = a+b+c;
            System.out.printf("Perimetro = %.1f\n", perimetroTriangulo);
        } else {
            areaTriangulo = ((a+b) * c)/2;
            System.out.printf("Area = %.1f\n", areaTriangulo);
        }

        input.close();
    }
}