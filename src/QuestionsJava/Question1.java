package QuestionsJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Q1Employee> employees = new ArrayList<>();
		
		System.out.print("Indicate how many employees there are in the company: ");
		int amount = Integer.parseInt(input.nextLine());
		
		for(int i=0;i<amount;i++) {
			System.out.print("Enter the name of the "+(i+1)+"º employee: ");
			String name = input.nextLine();
			System.out.print("Report the employee's salary: ");
			float salary = Float.parseFloat(input.nextLine());
			employees.add(new Q1Employee(name, salary));
		}
		for(Q1Employee employee : employees) {
			System.out.println("\nEmployee: "+employee.getName());
			System.out.printf("Salary: R$ %.2f\n",employee.getSalary());
			System.out.printf("Bonus: R$ %.2f\n",employee.getBonus());
			System.out.printf("Liquid salary: R$ %.2f\n\n",employee.getLiqSalary());
		}
		input.close();
	}
}