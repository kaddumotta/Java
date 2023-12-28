
//-- Programa para ler um número inteiro, e depois dizer se este número é negativo ou não. 


import java.util.Scanner;

public class Exercício_7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int x;

		System.out.println("DIGITE UM NÚMERO");
		x = sc.nextInt();
		
		if ( x >= 0) {
			System.out.println("POSITIVO");
			
		} else {
		
			System.out.println("NEGATIVO");
				}
		
		sc.close();
	}
}
