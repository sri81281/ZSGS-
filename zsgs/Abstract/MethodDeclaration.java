package Abstract;

import java.util.Scanner;

public class MethodDeclaration extends StringProblems {

	Scanner sc = new Scanner(System.in);

	public void subStringOf() {
		System.out.println("Enter the First String");
		String input = sc.nextLine();
		System.out.println("Enter the Second String");
		String input2 = sc.nextLine();

		int output = input.indexOf(input2);
		System.out.println("Index of the Second SubString" + output);

	}

	public void reverseString() {
		System.out.println("Enter the String Input");
		String input = sc.nextLine();
		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			output += input.charAt(i);
		}
		System.out.println(output);

	}

	public void input() {
		System.out.println("Enter 1 to get the Alphabet Printing");
		System.out.println("Enter 2 to get the String Reverse");
		System.out.println("Enter 3 to get the String Line Reverse");
		System.out.println("Enter 4 to get the SubString IndexOf");

		MethodDeclaration obj = new MethodDeclaration();
		switch (sc.nextInt()) {
		case 1:
			obj.alphabetPrinting();
			break;
		case 2:
			obj.reverseString();
			break;
		case 3:
			obj.stringReverseLine();
			break;
		case 4:
			obj.subStringOf();
			break;
		}
	}

	public static void main(String[] args) {
		new MethodDeclaration().input();
	}

}
