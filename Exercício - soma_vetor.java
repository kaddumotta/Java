package applications;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos números serão digitados?");
		int n = sc.nextInt();

		double[] vect = new double[n];

		// vai fazer as repetições de entradas de valores de acordo com o numero digitado
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Digite um número:");
			vect[i] = sc.nextDouble();
		}

		// vai fazer a leitura dentro do vetor, e devolver os valores digitados
		System.out.print("Valores = ");
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("%.1f ", vect[i]);

		}

		// vai fazer a leitura dentro do vetor, e devolver a soma dos valores digitados
		System.out.println("");
		System.out.print("Soma = ");
		double sum = 0;
		for (int i = 0; i < vect.length; i++) {
			sum = sum + vect[i];

		}
		System.out.print(sum);

		// vai fazer a leitura dentro do vetor, e devolver a média dos valores digitados
		System.out.println("");
		System.out.print("Media = ");
		double media = sum / vect.length;

		System.out.print(media);
	}

}
