/**
 * Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno. A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5. Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.
 */
import java.util.Locale;
import java.util.Scanner;

public class URI_1006 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();
        double MEDIA = (A*2 + B*3 + C*5) / 10.0;

        System.out.printf("MEDIA = %.1f%n", MEDIA);
        
        input.close();
    }
}