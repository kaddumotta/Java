
//-- Uma operadora de telefonia cobra R$50.00 por um plano básico que dá direito a 100 minutos. 
// Cada minuto que exceder será cobrado R$2,00. Programa que Leia a quantidade de minutos consumidos e retorne o valor a pagar.

import java.util.Locale;
import java.util.Scanner;

public class Exercício_13 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int consumo;
		double valorPagar;
						
		System.out.println("DIGITE O CONSUMO MENSAL");
		consumo = sc.nextInt();
		
		
		if (consumo <= 0) {
			valorPagar = 50 ;
		} else {
			valorPagar = (consumo - 100) * 2.0 + 50;
		}

		 System.out.printf("Valor a pagar: R$%.2f", valorPagar);
		 
		sc.close();
	}
}
