package applications;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos números serão digitados?");
		int n = sc.nextInt();

		double[] vect = new double[n];

		// vai fazer as repetições de entradas de valores de acordo com o numero
		// digitado
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Digite um número:");
			vect[i] = sc.nextDouble();
		}

		// vai fazer a leitura dentro do vetor, e devolver os números pares
		int numPar = 0;
		System.out.print("Números Pares = ");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				numPar += +1;
				System.out.printf("%.1f ", vect[i]);

			}

		}

		System.out.println("");
		System.out.print("Quantidade de Pares = ");
		System.out.println(numPar);
	}

}
