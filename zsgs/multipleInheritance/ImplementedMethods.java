package multipleInheritance;

import java.util.Scanner;

public class ImplementedMethods implements OperatorProblems , OperatorProblems2 {
	Scanner sc = new Scanner(System.in);

	@Override
	public void problem21() {
		System.out.println("enter the value of y");
		int y = sc.nextInt();
		int z = (++y * (y++ + 5));
		System.out.println(z);
	}

	@Override
	public void problem23() {
		System.out.println("enter the value of x");
		int x = sc.nextInt();
		int x1 = ++x - x++ + -x;
		System.out.println("output of 23" + x1);

	}

	@Override
	public void problem18() {
		System.out.println("enter the value of a");

		int a = sc.nextInt();
		System.out.println("enter the value of b");
		int b = sc.nextInt();
		System.out.println("++a-b-- =" + " " + (++a - b--));
		System.out.println("a%b++ =" + " " + (a % b++));
		System.out.println("a*=b+5 =" + " " + (a *= b + 5));
		System.out.println("69>>>2 =" + " " + (69 >>> 2));
	}

	
	public void problem19() {
		System.out.println("enter the value of a");
		int a = sc.nextInt();
		a += a++ + ++a + --a + a--;
		System.out.println("output of 19=" + a);

	}

	
	public void problem20() {
		System.out.println("enter the value of x");
		int x = sc.nextInt();
		x = x++ * 2 + 3 * -x;
		System.out.println("20th output=" + x);

	}

}
