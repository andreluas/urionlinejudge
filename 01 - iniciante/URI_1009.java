/**
 * Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas casas decimais.
 */
import java.util.Scanner;
import java.util.Locale;

public class URI_1009 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        String nomeFuncionario = input.next();
        double salarioFixo = input.nextDouble();
        double vendasEfetuadas = input.nextDouble();
        double comissao = vendasEfetuadas * 0.15;
        double salarioFinal = salarioFixo + comissao;

        System.out.printf("TOTAL = R$ %.2f%n", salarioFinal);

        input.close();
    }
}