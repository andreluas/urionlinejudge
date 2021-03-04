import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class URI_1040 {
	
	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		double N1 = input.nextDouble();
		double N2 = input.nextDouble();
		double N3 = input.nextDouble();
		double N4 = input.nextDouble();
        double MEDIA = ((N1*2) + (N2*3) + (N3*4) + (N4*1)) / 10;
		System.out.printf("Media: %.1f%n", MEDIA);
        if (MEDIA >= 7) {
        	System.out.println("Aluno aprovado.");
        } else if (MEDIA < 7 && MEDIA >= 5) {
        	System.out.println("Aluno em exame.");
        	double NExame = input.nextDouble();
			System.out.printf("Nota do exame: %.1f%n", NExame);
        	MEDIA = (MEDIA + NExame) / 2;
        	if (MEDIA >= 5) {
            	System.out.println("Aluno aprovado.");
        	} else {
            	System.out.println("Aluno reprovado.");
        	}
			System.out.printf("Media final: %.1f%n", MEDIA);
        } else {
        	System.out.println("Aluno reprovado.");
        }
		input.close();
	}
}