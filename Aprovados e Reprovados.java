package applications;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos serão calculados?");
		int n = sc.nextInt();

		double media = 0;
		double sum = 0;

		String[] nomes = new String[n];
		double[] nota1 = new double[n];
		double[] nota2 = new double[n];

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Digite o nome do aluno, a 1ª nota e a 2ª nota:");
			nomes[i] = sc.nextLine();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();
		}

		System.out.println("");
		System.out.println("Alunos Reprovados:");

		for (int i = 0; i < n; i++) {
			sum = (nota1[i] + nota2[i]);
			media = sum / 2;

			if (media < 6.0) {

				System.out.println(nomes[i] +" Media = " + media);
			}
		}

		System.out.println("");
		System.out.println("Alunos Aprovados:");

		for (int i = 0; i < n; i++) {
			sum = (nota1[i] + nota2[i]);
			media = sum / 2;

			if (media > 6.0) {

				System.out.println(nomes[i] +" Media = " + media);
			}
		}

	}
}
