/**
 * Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
 */
import java.util.Scanner;
import java.util.Locale;

public class URI_1008 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        int numeroFuncionario = input.nextInt();
        int qtdHorasTrabalhadas = input.nextInt();
        double valorHora = input.nextDouble();
        double salario = qtdHorasTrabalhadas * valorHora;

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f%n", salario);
        
        input.close();
    }
}