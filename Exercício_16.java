
// Programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano. 
// Para cada ponto escrever o quadrante a que ele pertence. 
// O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA 
// (nesta situação sem escrever mensagem alguma).

import java.util.Scanner;

public class Exercício_16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int gasolina = 0;
		int alcool = 0;
		int diesel = 0;
		
		System.out.println("Digite um número");
		int tipo = sc.nextInt();

		while (tipo != 4) {
			if (tipo == 1) {
				alcool = alcool + 1;
			} else if (tipo == 2) {
				gasolina = gasolina + 1;
			} else if (tipo == 3) {
				diesel = diesel + 1;
			} else {
				System.out.println("Inválido! Digite um novo número");
			}
			tipo = sc.nextInt();

		}

		System.out.printf("Muito Obrigado%n");
		System.out.printf("Alcool: %d%n", alcool);
		System.out.printf("Gasolina: %d%n", gasolina);
		System.out.printf("Diesel: %d%n", diesel);
		sc.close();
	}
}
