package applications;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Digite a Altura do Retângulo:");
		rectangle.height = sc.nextDouble();
		
		System.out.println("Digite a largura do Retângulo:");
		rectangle.width = sc.nextDouble();
		
		System.out.println("Area: " + rectangle.area());
		System.out.println("Area: " + rectangle.perimeter());
		
	
		
	}

}
