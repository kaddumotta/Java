
//-- Programa que  leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.


import java.util.Locale;
import java.util.Scanner;

public class Exercício_11 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cod, qntd;

		System.out.println("DIGITE O CÓDIGO DO PRODUTO (SENDO DE 1 A 5");
		cod = sc.nextInt();

		System.out.println("DIGITE A QUANTIDADE");
		qntd = sc.nextInt();

		if (cod == 1) {
			double preco1 = 4.00 * qntd;
			System.out.printf("CACHORRO QUENTE - Total: R$ %.2f%n", preco1);
		} else if (cod == 2) {
			double preco2 = 4.50 * qntd;
			System.out.printf("X-SALADA - Total: R$ %.2f%n", preco2);
		} else if (cod == 3) {
			double preco3 = 5.00 * qntd;
			System.out.printf("X-BACON - Total: R$ %.2f%n", preco3);	
		} else if (cod == 4) {
			double preco4 = 2.00 * qntd;
			System.out.printf("TORRADA SIMPLES - Total: R$ %.2f%n", preco4);	
		} else if (cod == 5) {
			double preco5 = 1.50 * qntd;
			System.out.printf("REFRIERANTE - Total: R$ %.2f%n", preco5);	
		} else {
			System.out.println("PRODUTO NÃO CADASTRADO");
		}

		sc.close();
	}
}
