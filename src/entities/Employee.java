package entities;

public class Employee {
	
	//Declarando atributos da classe Employee
	public String nameEmployee;
	public double grossSalary;
	public double tax;
	
	//Criando método netSalary
	
	public double netSalary() {
		double netSalary = grossSalary - tax;
		return netSalary;
	}
	
	//Criando método increaseSalary
	
	public void increaseSalary(double percentage) {
		this.grossSalary =+ percentage;
	}
	
	public void showEmployeeData() {
		System.out.printf("Employee: %s, R$%.2f", nameEmployee, netSalary());
	}

}
