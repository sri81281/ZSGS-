package inheritance;

import java.util.Scanner;

public class ParentPattern {

	public void print() {
		System.out.println("enter the row size");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int Loop = input;
		int row = input * 2 - 1;
		int x = input;
		int firstLoop = input;
		int rowCount = 1;
		for (int i = row; i > 0; i--) {

			if (i >= 5) {
				for (int j = 1; j < firstLoop; j++) {
					System.out.print(" ");
				}
				firstLoop--;
				x = input;
				for (int j = i; j <= row; j++) {

					System.out.print(x);
					x--;

				}

			} else {
				for (int j = i; j < Loop; j++) {
					System.out.print(" ");
				}
				x = input;
				for (int j = i; j > 0; j--) {

					System.out.print(x);
					x--;
				}

			}

			System.out.println();
			rowCount++;

			System.out.println();
		}

	}

	public void stringPattern() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String Input");
		String input = sc.nextLine();
		char character[][] = new char[input.length()][input.length()];
		for (int i = 0; i < character.length; i++) {
			character[i][i] = input.charAt(i);
		}
		for (int i = character.length - 1, j = 0; i >= 0 && j < character.length; i--, j++) {
			character[i][j] = input.charAt(j);
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
