package applications;

import java.util.Locale;
import java.util.Scanner;

import Entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee employee = new Employee();

		System.out.println("Nome do Funcionário:");
		employee.name = sc.next();

		System.out.println("Digite o Salário Atual:");
		employee.grossSalary = sc.nextDouble();

		System.out.println("Digite o Desconto:");
		employee.tax = sc.nextDouble();

		System.out.println("Nome: " + employee.name);
		System.out.println("Salário: " + employee.grossSalary);
		System.out.println("Desconto: " + employee.tax);

		System.out.println();
		System.out.println("Employee:" + employee.name + ", $" + employee.netSalary());

		System.out.println();
		System.out.println("Digite a parcentagem do aumento:");
		employee.increment = sc.nextDouble();

		System.out.println();
		System.out.println("Update data:" + employee.name + ", $" + employee.increaseSalary());
	}

}
