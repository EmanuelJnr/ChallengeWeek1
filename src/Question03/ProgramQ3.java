package Question03;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgramQ3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		QuestionsAnswers QA;
		
		System.out.print("Enter your name: ");
		String name = input.nextLine();
		
		System.out.println("1-General knowledge questions");
		System.out.println("2-Anime questions");
		String op = input.nextLine();
		if(op.equals("1"))
			QA = new General();
		else
			QA = new Anime();
		ArrayList<String> questions = QA.questions();
		ArrayList<String> answers = QA.answers();
		
		int contRight=0;
		for(int i=0;i<questions.size();i++) {
			System.out.println(questions.get(i));
			String answer = input.nextLine().toLowerCase();
			
			if(answers.get(i).contains(answer)) {
				System.out.println("Right answer");
				contRight++;
			}
			else
				System.out.println("Wrong answer");
		}
		
		System.out.println("\nUser "+name);
		System.out.println("Right: "+contRight);
		System.out.println("Wrong: "+(answers.size()-contRight));
		
		input.close();
	}
}