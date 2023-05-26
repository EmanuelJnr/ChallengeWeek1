package Question01;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class ProgramQ1 {
	public static void main(String[] args) {
		/*
		 * pesquisar Java SE 15 ultilização das variáveis
		 * usar var para não deixar anbíguo
		 * 
		 * usar uma classe apenas para validação, inputs e impressão
		 * usar big decimal para valores monetários...
		 * usar wrapers
		 * pesquisar sobre o Logger, Kubernetes e @Slij4
		 * estudar um pouco sobre NoSQL
		 * idioma em inglês
		 * separar responsabilidade
		 * tratamento de exceção
		 * utilizar o "var"
		 * utilização dos tipos primitivos e classes wrapper
		 */
		var input = new Scanner(System.in);
		ArrayList<Employee> employees = new ArrayList<>();

		System.out.print("Indicate how many employees there are in the company: ");
		int amount = Integer.parseInt(input.nextLine());

		for(int i=1;i<=amount;i++) {//new class only this code
			System.out.print("Enter the name of the " + i + "º employee: ");
			String name = input.nextLine();
			System.out.print("Report the employee's salary: ");
			float salary = Float.parseFloat(input.nextLine());
			employees.add(new Employee(name, salary));
		}
		for(Employee employee : employees) {//new class only this code
			var dinheiro = NumberFormat.getCurrencyInstance(new Locale("pt","BR"));
			System.out.println("\nEmployee: " + employee.getName());
			System.out.println("Salary: " + dinheiro.format(employee.getSalary()));
			System.out.println("Bonus: " + dinheiro.format(employee.getBonus()));
			System.out.println("Liquid salary: " + dinheiro.format(employee.getLiqSalary()));
		}
		input.close();
	}
}