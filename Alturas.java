package applications;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas serão cadastradas?");
		int n = sc.nextInt();

		double media = 0;
		double sum = 0;
		int menos_16 = 0;
		double mediaIdade = 0.0;

		String[] nomes = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Dados da " + (i + 1) + "ª pessoa:");
			System.out.print("Nome:");
			nomes[i] = sc.nextLine();
			System.out.print("Idade:");
			idade[i] = sc.nextInt();
			System.out.print("Altura:");
			altura[i] = sc.nextDouble();
		}

		System.out.println("");
		System.out.print("Altura Media: ");

		for (int i = 0; i < n; i++) {
			sum += altura[i];
		}

		media = sum / n;

		System.out.printf("%.2f%n", media);

		System.out.println("");
		System.out.print("Pessoas com menos de 16 anos: ");

		for (int i = 0; i < n; i++) {
			if (idade[i] < 16) {
				menos_16 += 1;
				mediaIdade = ((double) menos_16 / n) * 100.0;
				System.out.printf("%.2f", mediaIdade);
				System.out.println("%");
				System.out.println(nomes[i]);
			}

		}
	}

}
