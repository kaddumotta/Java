package applications;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos números serão digitados?");
		int n = sc.nextInt();

		int[] vect = new int[n];

		// vai fazer a as repetições de entradas de valores
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Digite um número:");
			vect[i] = sc.nextInt();
		}

		// vai fazer a leitura dentro do vetor, para saber quais números são negativos
		System.out.println("Números Negativos:");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
	}

}
