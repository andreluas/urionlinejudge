/**
 *  Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias

Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. Este é apenas um exercício com objetivo de testar raciocínio matemático simples.
 */

import java.util.Scanner;
import java.util.Locale;

public class URI_1020 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);   
    
        int dias = input.nextInt();
        int anos = dias/365;
        dias = dias%365;
        int meses = dias/30;
        int diasF = dias%60;
        System.out.println(anos + "ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(diasF + " dia(s)");
        input.close();
    }
}
