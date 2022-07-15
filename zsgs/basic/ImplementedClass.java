package basic;

import java.util.Scanner;

public class ImplementedClass implements Basic {
	Scanner sc = new Scanner(System.in);

	@Override
	public void input() {

		char c = sc.next().charAt(0);
		int i = (int) c;
		System.out.println(i);
		sc.close();

	}

	@Override
	public void twoConcentricCircles() {
		double R = 2;
		double r = 1;
		double result = (22 * ((R * R) - (r * r))) / 7;
		System.out.println(result);
	}

	@Override
	public void areaOfSquare() {
		System.out.println("Enter the value of s");
		int s = sc.nextInt();
		int area_square = s * s;
		System.out.println(area_square);

	}

	@Override
	public void areaOfCylinder() {
		System.out.println("enter the radius ");
		float radius = sc.nextFloat();
		System.out.println("Enter the height");
		float height = sc.nextFloat();

		float areaOfCylinder = 2 * 22 * radius * (height + radius) / 7;
		System.out.println("areaOfCylinder=" + areaOfCylinder);

	}

	@Override
	public void bitwise() {
		System.out.println("enter the value of x");
		int x = sc.nextInt();
		System.out.println("enter the value of y");
		int y = sc.nextInt();
		System.out.println("And bitwise operator output" + (x & y));
		System.out.println("enter the value of a");
		int a = sc.nextInt();
		System.out.println("enter the value of b");
		int b = sc.nextInt();
		System.out.println("Or bitwise operator output" + (a | b));
		System.out.println("enter the value of c");
		int c = sc.nextInt();
		System.out.println("enter the value of d");
		int d = sc.nextInt();
		System.out.println("Exor bitwise Operator output" + (c ^ d));
		System.out.println("enter the value of k");
		int k = sc.nextInt();
		System.out.println("Not operator output" + (~k));

	}

	@Override
	public void positiveOrNegative() {
		int input = sc.nextInt();
		if (input > 0) {
			System.out.println("positive value");
		} else if (input < 0) {
			System.out.println("negative value");
		} else {
			System.out.println("neither positive nor negative");
		}
	}

	public static void main(String[] args) {
		Basic obj = new ImplementedClass();
		obj.bitwise();
		obj.positiveOrNegative();
		obj.input();
		obj.twoConcentricCircles();
		obj.accessPrivate();

	}
}
