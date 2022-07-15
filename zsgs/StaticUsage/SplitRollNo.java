package StaticUsage;

import Zsgs.Array;

public class SplitRollNo {

	public static void split() {
		int input[] = new Array().startup();

		for (int i = 0; i < input.length; i++) {
			if (i % 4 == 0) {

				System.out.println("group1="+input[i]);
			}
			if (i % 4 == 1) {

				System.out.println("group2="+input[i]);
			}
			if (i % 4 == 2) {

				System.out.println("group3="+input[i]);
			}
			
			if (i % 4 == 3) {

				System.out.println("group4="+input[i]);
			}

		}
	}

	public static void main(String[] args) {
		split();
	}
}
