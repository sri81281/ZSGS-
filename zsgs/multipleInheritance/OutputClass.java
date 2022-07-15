package multipleInheritance;

import java.util.Scanner;

public class OutputClass extends ImplementedMethods {

	public void input() {
		OutputClass obj = new OutputClass();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1 to get the 18th output");
		System.out.println("enter 2 to get the 19th output");
		System.out.println("enter 3 to get the 20th output");
		System.out.println("enter 4 to get the 21th output");
		System.out.println("enter 5 to get the 22th output");
		System.out.println("enter 6 to get the 23rd output");

		switch (sc.nextInt()) {
		case 1:
			obj.problem18();
			break;
		case 2:
			obj.problem19();
			break;
		case 3:
			obj.problem20();
			break;
		case 4:
			obj.problem21();
			break;
		case 5:
			obj.problem23();
			break;

		}
		sc.close();
	}

	public static void main(String[] args) {
		new OutputClass().input();
	}

}
