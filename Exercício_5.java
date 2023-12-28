
//  programa para ler o código de uma peça 1, quantidade de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, a quantidade de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago. 

import java.util.Locale;
import java.util.Scanner;

public class Exercício_5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		int cod1, quantidade1, cod2, quantidade2;
		double valorUnitario1, valorUnitario2, valorTotal;
		
		
		cod1 = sc.nextInt();
		quantidade1 =  sc.nextInt();
		valorUnitario1 =  sc.nextDouble();
		cod2 = sc.nextInt();
		quantidade2 =  sc.nextInt();
		valorUnitario2 =  sc.nextDouble();
		
				
		valorTotal = quantidade1 * valorUnitario1 + quantidade2 * valorUnitario2;
				
				
		System.out.printf("VALOR A PAGAR : R$ %.2f%n", valorTotal);
		
		sc.close();
		
	}

}
