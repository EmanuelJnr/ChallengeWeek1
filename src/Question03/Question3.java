package Question03;

import java.util.ArrayList;
import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> questions;
		ArrayList<String> answers;
		
		System.out.print("Enter your name: ");
		String name = input.nextLine();
		
		System.out.println("1-General knowledge questions");
		System.out.println("2-Anime questions");
		String op = input.nextLine();
		if(op.equals("1")) {
			questions = QuestionsAnswers.generalQuestions();
			answers = QuestionsAnswers.generalAnswers();
		}
		else{
			questions = QuestionsAnswers.animeQuestions();
			answers = QuestionsAnswers.animeAnswers();
		}
		
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
		System.out.println("User "+name);
		System.out.println("Right: "+contRight);
		System.out.println("Wrong: "+(answers.size()-contRight));
		
		input.close();
	}
}