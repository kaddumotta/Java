
import java.util.Scanner;

public class Exercício_18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Defina a quantidade de números");
		int N = sc.nextInt();

		int x = 0;
		int somaIn = 0;
		int somaOut = 0;

		for (int i = 1; i <= N; i++) {

			if (x >= 10 && x <= 20) {
				somaIn = somaIn + 1;
				x = sc.nextInt();
			} else {
				somaOut = somaOut + 1;
				x = sc.nextInt();
			}

		}

		System.out.println("");
		System.out.println("De acordo com os número digitados, é possível afirmar que:");
		System.out.println(somaIn + " número(s) está(ão) dentro do intervalo [10,20]");
		System.out.println(somaOut + " número(s) está(ão) fora do intervalo [10,20]");

		sc.close();
	}
}
