package applications;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos valores terá o vetor?");
		int n = sc.nextInt();
		
		double media = 0;
		double sum = 0;
		
		double[] vect1 = new double[n];
		
		System.out.println("Digite os valores do vetor:");
		for (int i = 0; i < vect1.length; i++) {
			vect1[i] = sc.nextDouble();
		}

		
		System.out.print("Media do Vetor = ");
		
		for (int i = 0; i < vect1.length; i++) {
		sum += vect1[i];
		media = sum / vect1.length;
	}
	System.out.println(media);	
	
	
	System.out.println("Elementos abaixo da media do vetor = ");
	
	for (int i = 0; i < vect1.length; i++) {
		if (vect1[i] < media) {
			System.out.println(" " + vect1[i]);
		}
}
	
	
	}
}
