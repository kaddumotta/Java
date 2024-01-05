package applications;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos terão cada vetor?");
		int n = sc.nextInt();

		int[] vect1 = new int[n];
		int[] vect2 = new int[n];

		System.out.println("Digite os valores do vetor 1:");
		for (int i = 0; i < vect1.length; i++) {
			vect1[i] = sc.nextInt();
		}

		System.out.println("Digite os valores do vetor 2:");
		for (int i = 0; i < vect2.length; i++) {
			vect2[i] = sc.nextInt();
		}

		System.out.println("Vetor Resultante");
		
		for (int i = 0; i < vect1.length; i++)
		System.out.println(" " + (vect1[i] + vect2[i]));

	}

}
