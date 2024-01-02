package applications;

import java.util.Locale;
import java.util.Scanner;

import entities.NotaFinal;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		NotaFinal notaFinal = new NotaFinal();

		System.out.println("Nome do Aluno:");
		notaFinal.name = sc.nextLine();

		System.out.println("Digite a nota do Primeiro Trimestre (Max: 30):");
		notaFinal.nota1 = sc.nextDouble();

		System.out.println("Digite a nota do Segundo Trimestre (Max: 35):");
		notaFinal.nota2 = sc.nextDouble();

		System.out.println("Digite a nota do Terceiro Trimestre (Max: 35):");
		notaFinal.nota3 = sc.nextDouble();

		System.out.printf("Nota Final: %.2f%n", notaFinal.finalNota());

		if (notaFinal.nota4 < 60.0) {
			System.out.println("Falhou");
			System.out.printf("Faltaram %.2f Pontos%n", notaFinal.pontosRestantes());
		} else {
			System.out.println("Passou");
		}

	}

}
