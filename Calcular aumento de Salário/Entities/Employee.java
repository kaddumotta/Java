package Entities;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;
	public double increment;

	public double netSalary() {
		return grossSalary - tax;
	}

	public double increaseSalary() {

		return grossSalary = (grossSalary * (increment / 100)) + grossSalary - tax;

	}
}
