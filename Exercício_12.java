
//-- Programa que Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. 
// A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).


import java.util.Locale;
import java.util.Scanner;

public class Exercício_12 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x, y;
		String quadrante;
				
		System.out.println("DIGITE O VALOR DE X");
		x = sc.nextDouble();
		
		System.out.println("DIGITE O VALOR DE Y");
		y = sc.nextDouble();

		if (x > 0 && y > 0) {
			quadrante = "Q1";
		} else if (x > 0 && y < 0) {
			quadrante = "Q4";
		} else if (x > 0 && y == 0 || x < 0 && y == 0 ) {
			quadrante = "Eixo X";
		} else if (x < 0 && y > 0) {
			quadrante = "Q2";
		} else if (x < 0 && y < 0) {
			quadrante = "Q3";
		} else if (y > 0 && x == 0 || y < 0 && x == 0 ) {
			quadrante = "Eixo Y";
		} else {
			quadrante = "Origem";
		}

		 System.out.printf("%s", quadrante);
		 
		sc.close();
	}
}
