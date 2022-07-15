package Interface;

import java.util.Scanner;

public class OutputClass extends ArrayImplementation {

	public void startUp() {
		OutputClass obj = new OutputClass();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array");
		int n = sc.nextInt();
		int input[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("enter" + " " + i + " " + "Indexof element");
			input[i] = sc.nextInt();
		}
		int condition = 0;
		do {
			System.out.println();
			System.out.println("Enter 1 to get even and Odd position of array");
			System.out.println("Enter 2 to get left rotation  of array");
			System.out.println("Enter 3 to get right rotation  of array");
			System.out.println("Enter 4 to get Array Sorting");
			System.out.println("Enter 5 to get Duplicates Elements in Array");
			System.out.println("Enter 6 to get First MAX and First Min in Array");
			System.out.println("Enter 7 to get Elements Present in Array");
			System.out.println("Enter 8 to get the Frequency of Each Elements");
			System.out.println("Enter 9 to get the small and large Element in Array ");
			System.out.println("Enter 10 to get the left Rotate of multidimentional Array");

			switch (sc.nextInt()) {
			case 1:
				System.out.println("output");
				obj.arrayEvenAndOdd(input);
				condition++;
				break;
			case 2:
				System.out.println("output");
				obj.arrayLeftRotation(input);
				condition++;
				break;
			case 3:
				System.out.println("output");
				obj.arrayRightRotation(input);
				condition++;
				break;
			case 4:
				System.out.println("output");
				obj.arraySorting(input);
				condition++;
				break;
			case 5:
				System.out.println("output");
				obj.duplicateElementsInArray(input);
				condition++;
				break;
			case 6:
				System.out.println("output");
				obj.firstMaxAndFirstMin(input);
				condition++;
				break;

			case 7:
				System.out.println("Output");
				obj.elementsPresentInArray(input);
				condition++;
				break;
			case 8:
				System.out.println("Output");
				obj.frequencyOfArrayElements(input);
				condition++;
				break;
			case 9:
				System.out.println("Output");
				obj.largeAndSmallElement(input);
				condition++;
				break;
			case 10:
				System.out.println("output");
				obj.leftRotate();
				condition++;
				break;
			}
		} while (condition != 11);
		sc.close();
	}

	public static void main(String[] args) {
		new OutputClass().startUp();
	}
}
