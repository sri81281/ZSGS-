package inheritance;

public class SubChild extends ChildPattern {
	public void printPattern(int input) {
		System.out.println("Output");
		System.out.println("enter the row size");
		int row = input / 2, n = 1;

		for (int i = 0; i < row; i++) {
			for (int j = row; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print(n + " ");
				n++;
			}

			System.out.println();
		}
	}

	public void printStringPattern(String sign) {
		int input = 4;

		for (int i = 0; i < input; i++) {
			System.out.print(sign);
			for (int j = 0; j < input; j++) {
				if (i == 0 || i == input - 1) {
					System.out.print(sign);
				}
			}
			System.out.println();
		}
		sc.close();
	}

	public void input() {
		ChildPattern obj = new ChildPattern();
		ParentPattern obj1 = new ParentPattern();
		SubChild obj2 = new SubChild();
		System.out.println("Enter 1 to get the pattern 47 output");
		System.out.println("Enter 2 to get the pattern 48 output");
		System.out.println("Enter 3 to get pattern 49 output");
		System.out.println("Enter 4 to get pattern 50 output");
		System.out.println("Enter 5 to get pattern 7 output");
		System.out.println("Enter 6 to get the pattern 57 Output ");
		System.out.println("Enter 7 to get the pattern of 56 output");
		System.out.println("Enter 8 to get the pattern of 55 output");
		switch (sc.nextInt()) {
		case 1:

			obj1.print();
			break;
		case 2:

			obj.print();
			break;
		case 3:

			obj.printStringPattern("*");
			break;
		case 4:
			obj.printPattern(9);
			break;
		case 5:
			obj.stringPattern();
			break;
		case 6:
			obj1.stringPattern();
			break;
		case 7:
			obj2.printPattern(10);
			break;
		case 8:
			obj2.printStringPattern("*");
			break;

		}
	}

	public static void main(String[] args) {
		new SubChild().input();
	}
}
