package Ananymous;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ananym {
	public static void main(String[] args) {
		ImplementAnanymous obj = new ImplementAnanymous() {
			public void sortTheArrayOddAndEvenPosition() {
				// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				System.out.println("enter the size of an array");
				int n = sc.nextInt();
				ArrayList<Integer> arrayList = new ArrayList<Integer>();
				for (int i = 0; i < n; i++) {
					System.out.println("enter" + " " + i + " " + "Indexof element");
					arrayList.add(sc.nextInt());
				}
				ArrayList<Integer> evenList = new ArrayList<Integer>();
				ArrayList<Integer> oddList = new ArrayList<Integer>();
				int i = 0;
				for (Integer elements : arrayList) {
					if (i % 2 == 0) {
						evenList.add(elements);
					}
					if (i % 2 != 0) {
						oddList.add(elements);
					}
					i++;
				}

				Collections.sort(oddList);
				Collections.sort(evenList, Collections.reverseOrder());
				int oddLength = oddList.size();
				int evenLength = evenList.size();
				int length = oddLength > evenLength ? oddLength : evenLength;

				for (int j = 0; j < length; j++) {
					if (j < evenLength) {
						System.out.print(evenList.get(j) + " ");
					}
					if (j < oddLength) {
						System.out.print(oddList.get(j) + " ");
					}
				}
				sc.close();
			}
		};
		obj.sortTheArrayOddAndEvenPosition();
	}

}