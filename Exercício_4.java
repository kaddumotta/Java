
// programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

import java.util.Locale;
import java.util.Scanner;

public class Exercício_4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		int numero;
		double hora , valorHora , Salario;
		
		numero =  sc.nextInt();
		hora =  sc.nextDouble();
		valorHora =  sc.nextDouble();
		
		Salario = hora * valorHora;
		
				
		System.out.println("NUMEBER = " + numero);
		System.out.printf("SALARY = U$ %.2f", Salario);
		
		sc.close();
		
	}

}
