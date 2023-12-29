
//-- Programa que Leia a hora inicial e a hora final de um jogo. 
//A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, 
//tendo uma duração mínima de 1 hora e máxima de 24 horas. 

import java.util.Scanner;

public class Exercício_10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x, y;

		System.out.println("DIGITE O HORÁRIO DE INÍCIO");
		x = sc.nextInt();

		System.out.println("DIGITE O HORÁRIO DO TÉRMINO");
		y = sc.nextInt();

		if (x > y) {
			int a = 24 - x + y;
			System.out.println("O JOGO DUROU " + a + "HORA(S)");
		} else if (x == 0 && y == 0) {
			System.out.println("O JOGO DUROU 24 HORA(S)");
		} else {
			int b = y - x;
			System.out.println("O JOGO DUROU " + b + "HORA(S)");
		}

		sc.close();
	}
}
