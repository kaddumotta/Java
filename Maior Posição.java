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

		int maiorValor = 0;
		int pos = 0;

		// vai fazer as repetições de entradas de valores de acordo com o numero
		// digitado
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Digite um número:");
			vect[i] = sc.nextInt();
			if (vect[i] > maiorValor) {
				maiorValor = vect[i];
				pos = i;
			}
		}

		System.out.println("Maior Valor = " + maiorValor);
		System.out.print("Posição do Maior Valor = " + pos);

	}

}
