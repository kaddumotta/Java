package entities;

public class Conta {

	private String nome;
	private int numeroConta;
	private double valorConta;

	public Conta() {

	}

	public Conta(String nome, int numeroConta, double depositoInicial) {
		this.nome = nome;
		this.numeroConta = numeroConta;
		deposito(depositoInicial);
	}

	public Conta(String nome, int numeroConta) {
		super();
		this.nome = nome;
		this.numeroConta = numeroConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getValorConta() {
		return valorConta;
	}

	public void deposito(double valorDeposito) {
		this.valorConta += valorDeposito;
	}

	public void saque(double valorSaque) {
		this.valorConta = valorConta - valorSaque - 5.00;
	}

	public String toString() {
		return "Numero da Conta: " + numeroConta + ", Nome do titular: " + nome
				+ String.format(", Saldo: %.2f%n", valorConta);
	}

}
