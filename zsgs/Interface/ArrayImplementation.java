package Interface;

import java.util.Arrays;

import java.util.Scanner;

public class ArrayImplementation implements ArrayProblems {

	public void arrayEvenAndOdd(int[] input) {

		for (int i = 0; i < input.length; i++) {
			if (i % 2 == 0) {
				System.out.println("Even position=" + input[i]);
			} else {
				System.out.println("Odd Position=" + input[i]);
			}
		}

	}

	public void arraySorting(int[] input) {
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] > input[j]) {
					int temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
		}

	}

	public void arrayLeftRotation(int[] input) {
		for (int iterate : input) {
			System.out.print(iterate + " ");
		}
		int firstIndex = input[0];
		int i = 0;
		int j = 1;
		while (i < input.length - 1) {
			input[i++] = input[j++];
		}
		input[i++] = firstIndex;

		System.out.println();
		for (int iterate : input) {
			System.out.print(iterate + " ");
		}

	}

	public void arrayRightRotation(int[] input) {
		for (int iterate : input) {
			System.out.print(iterate + " ");
		}
		int lastIndex = input[input.length - 1];
		int i = input.length - 1;
		int j = i - 1;
		while (i >= 1) {
			input[i--] = input[j--];
		}
		input[i--] = lastIndex;

		System.out.println();
		for (int iterate : input) {
			System.out.print(iterate + " ");
		}

	}

	public void arrayCopy(int[] input) {
		int output[] = new int[input.length];

		for (int i = 0; i < output.length; i++) {
			output[i] = input[i];
		}
		for (int elements : output) {
			System.out.print(elements + " ");
		}

	}

	public void duplicateElementsInArray(int[] input) {

		new ArrayImplementation().arraySorting(input);
		for (int i = 0; i < input.length - 1; i++) {
			if (input[i] == input[i + 1]) {
				System.out.println(input[i]);
			}
		}

	}

	public void firstMaxAndFirstMin(int[] input) {
		new ArrayImplementation().arraySorting(input);
		int i = 0;
		int j = input.length - 1;
		while (i < j) {
			System.out.print(input[j] + " ");
			System.out.print(input[i] + " ");
			i++;
			j--;
		}
		if (input.length % 2 != 0) {
			int x = input.length / 2;
			System.out.print(input[x]);
		}

	}

	public void multiLeftRotate(int[][] input) {
		System.out.println("input");
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				System.out.print(input[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("output");
		for (int i = input.length - 1; i >= 0; i--) {
			for (int j = 0; j < input.length; j++) {
				System.out.print(input[j][i] + " ");
			}
			System.out.println();
		}

	}

	public void elementsPresentInArray(int[] input) {

		for (int iterate : input) {
			System.out.print(iterate + " ");
		}
	}

	public void frequencyOfArrayElements(int[] input) {
		int result[] = new int[input.length];
		int d = -1;
		for (int i = 0; i < input.length; i++) {
			int count = 1;
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] == input[j]) {
					count++;
					input[j] = d;
				}
			}
			result[i] = count;
		}
		for (int i = 0; i < input.length; i++) {
			if (input[i] != d) {
				System.out.println(input[i] + " " + result[i]);
			}
		}

	}

	public void largeAndSmallElement(int[] input) {
		Arrays.sort(input);
		int max = input[0];
		int min = input[0];
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] > input[j]) {
					max = input[i];
				} else {
					max = input[j];
				}
			}
		}
		System.out.println("Maximum value of array=" + max + "\n" + "Minimum value of Array=" + min);

	}
	public void leftRotate() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of row");
		int row = sc.nextInt();
		System.out.println("enter the number of colum");
		int colum = sc.nextInt();
		int input[][] = new int[row][colum];
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				System.out.println("enter the value of" + i + "" + j);
				input[i][j] = sc.nextInt();
			}
		}
		System.out.println("input");
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				System.out.print(input[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("output");
		for (int i = input.length - 1; i >= 0; i--) {
			for (int j = 0; j < input.length; j++) {
				System.out.print(input[j][i] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
