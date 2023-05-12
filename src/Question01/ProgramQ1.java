package Question01;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class ProgramQ1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Employee> employees = new ArrayList<>();
		
		System.out.print("Indicate how many employees there are in the company: ");
		int amount = Integer.parseInt(input.nextLine());
		
		for(int i=1;i<=amount;i++) {
			System.out.print("Enter the name of the "+i+"º employee: ");
			String name = input.nextLine();
			System.out.print("Report the employee's salary: ");
			float salary = Float.parseFloat(input.nextLine());
			employees.add(new Employee(name, salary));
		}
		for(Employee employee : employees) {
			NumberFormat money = NumberFormat.getCurrencyInstance(new Locale("pt","BR"));
			System.out.println("\nEmployee: "+employee.getName());
			System.out.println("Salary: R$ "+money.format(employee.getSalary()));
			System.out.println("Bonus: R$ "+money.format(employee.getBonus()));
			System.out.println("Liquid salary: R$ "+money.format(employee.getLiqSalary()));
		}
		input.close();
	}
}