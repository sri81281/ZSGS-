package Abstract;

import java.util.Scanner;

public abstract class StringProblems {
	Scanner sc = new Scanner(System.in);

	public abstract void subStringOf();

	public abstract void reverseString();

	public void stringReverseLine() {
		System.out.println("enter the String input");
		String input = sc.nextLine();
		String output = "";
		String splitString[] = input.split(" ");

		for (int i = splitString.length - 1; i >= 0; i--) {
			output += " " + splitString[i];
		}
		System.out.println(output);
		sc.close();
	}

	public void alphabetPrinting() {

		System.out.println("Enter the Input String");
		String input = sc.nextLine();
		String output = "";
		int length = input.length();
		int result = 0;
		int signal1 = 0;
		int signal2 = 0;
		char c = '\0';
		for (int i = 0; i < length; i++) {
			if (((int) input.charAt(i) >= 48) && ((int) input.charAt(i) <= 57)) {
				for (int k = i; k < length; k++) {
					signal1 = 1;
					if (((int) input.charAt(k) >= 48) && ((int) input.charAt(k) <= 57)) {

						int num = (int) input.charAt(k);
						int temp = num - 48;
						result = (result * 10) + temp;
						System.out.println("number=" + result);
					} else {
						break;
					}

				}
			}
			if (((int) input.charAt(i) >= 97) && ((int) input.charAt(i) <= 122)) {
				signal2 = 1;
				c = input.charAt(i);
				System.out.println("charater=" + c);
			}
			if (signal1 == 1 && signal2 == 1) {
				for (int j = 1; j <= result; j++) {
					output += c;
					signal1 = 0;
					signal2 = 0;
				}
				result = 0;
			}
		}
		System.out.println(output);
		sc.close();
	}

}
