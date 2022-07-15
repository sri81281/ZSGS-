package pakageImport;

import java.util.Scanner;


import Zsgs.ReverseANumber;

public class ReverseAndSubract {

	public void reverseAndSubract() {
		Scanner sc = new Scanner(System.in);
		int input = 0;
		boolean flag = true;
		do {
			System.out.println("Enter the input");
			try {
				input = sc.nextInt();
				flag = false;
			} catch (Exception e) {
				System.err.println("Invalid input please enter the input properly");
			}
			sc.nextLine();
		} while (flag == true);
		sc.next();
		sc.close();
		int output = ReverseANumber.reverse(input);

		int result = output - input;
		System.out.println(result);

	}

	public static void main(String[] args) {
		new ReverseAndSubract().reverseAndSubract();
	}
}
