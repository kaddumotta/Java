package applications;

import java.util.Locale;
import java.util.Scanner;
import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// Declaro a variável conta
		Conta conta;

		System.out.println("Nome do Titular da Conta:");
		String nome = sc.nextLine();

		System.out.println("Número da Conta:");
		int numeroConta = sc.nextInt();

		System.out.println("Deseja fazer um depósito incial?");
		sc.nextLine();
		char resp = sc.nextLine().charAt(0);

		if (resp == 's') {
			System.out.println("Valor Depositado:");
			double depositoInicial = sc.nextDouble();
			// Com a variável conta declarada, aqui cria a instância com os 3 valores
			// atribuídos
			conta = new Conta(nome, numeroConta, depositoInicial);
		} else {
			// Com a variável conta declarada, aqui cria a instância com os 2 valores
			// atribuídos
			conta = new Conta(nome, numeroConta);
		}

		System.out.println(conta);

		System.out.println("");

		System.out.println("Deposite um valor:");
		double valorDeposito = sc.nextDouble();
		conta.deposito(valorDeposito);

		System.out.println("");
		System.out.println("Atualizando");

		System.out.println(conta);

		System.out.println("");

		System.out.println("Saque um valor:");
		double valorSaque = sc.nextDouble();
		conta.saque(valorSaque);

		System.out.println("");

		System.out.println("Atualizando");
		System.out.println(conta);
	}
}
