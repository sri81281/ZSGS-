package inheritance;

import java.util.Scanner;

public class ChildPattern extends ParentPattern {
	Scanner sc = new Scanner(System.in);

	public void print() {
		System.out.println("output");
		System.out.println("enter the row size");
		int row = sc.nextInt();
		for (int i = row; i >= 1; i--) {
			for (int j = 1; j <= i * 2; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <= row; j++) {
				System.out.print(j + " ");
			}
			for (int j = row - 1; j >= i; j--) {
				System.out.print(j + " ");
			}

			System.out.println();
		}

	}

	public void printStringPattern(String sign) {
		System.out.println("output");
		System.out.println("enter the row size");
		int row = sc.nextInt();

		for (int i = 0; i < row; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j < row; j++) {
				System.out.print(sign + " ");
			}
			System.out.println();
		}
	}

	public void printPattern(int input) {
		System.out.println("Output");
		int row = sc.nextInt();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j < row; j++) {
				System.out.print(input + " ");

			}
			input--;
			System.out.println();
		}
	}

	public void stringPattern() {

		System.out.println("enter the String Input");
		String input = sc.nextLine();
		char character[][] = new char[input.length()][input.length()];
		for (int i = 0; i < character.length; i++) {
			character[i][i] = input.charAt(i);
		}
		for (int i = character.length - 1, j = 0; i >= 0 && j < character.length; i--, j++) {
			character[i][j] = input.charAt(i);
		}
		for (int i = 0; i < character.length; i++) {
			for (int j = 0; j < character.length; j++) {
				System.out.print(character[i][j]);

			}
			System.out.println();
		}
		sc.close();
	}

}
