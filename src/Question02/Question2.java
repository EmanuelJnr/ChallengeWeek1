package Question02;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int contFun=0;
		int contUpset=0;
		String fun = ":-)";
		String upset = ":-(";
		
		System.out.print("Enter a text: ");
		String text = input.nextLine();
		String[] textSplited = text.split(" ");
		
		for (String t : textSplited) {
			if(t.contains(fun))
				contFun++;
			else if(t.contains(upset))
				contUpset++;
		}
		
		if(contFun>contUpset)
			System.out.println("fun");
		else if(contUpset>contFun)
			System.out.println("upset");
		else
			System.out.println("neutral");
		
		input.close();
	}
}