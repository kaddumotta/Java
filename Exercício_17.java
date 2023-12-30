
// Programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano. 
// Para cada ponto escrever o quadrante a que ele pertence. 
// O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA 
// (nesta situação sem escrever mensagem alguma).

import java.util.Scanner;

public class Exercício_16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número");
		
		int x = sc.nextInt();
				
		for (int i = 1; i <= x; i++) {
			if ( i % 2 != 0) {
				System.out.println(i);
			}
			
		}
		
		
		sc.close();
	}}

	