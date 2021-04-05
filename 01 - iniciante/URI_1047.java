/**
 * URI_1047
 */

import java.util.Scanner;

public class URI_1047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int mt1 = (h1*60) + m1;
        int mt2 = (h2*60) + m2;
        int h24 = (24*60);
        int resultado = 0;
        if(mt2 > mt1){
            resultado = mt2 - mt1;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",(resultado/60), (resultado%60));
        }else if(mt1 > mt2){
            resultado = (h24 - mt1) + (mt2);
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",(resultado/60), (resultado%60));
        }else if(mt2 == mt1){
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",24, 0);
        }
       sc.close();
    }

}