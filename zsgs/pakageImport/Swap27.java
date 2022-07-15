package pakageImport;

import java.util.Scanner;

public class Swap27 {
	public void input() {
		Scanner sc = new Scanner(System.in);
		int firstValue=0;
		int secondValue=0;
		boolean flag=true;
		do {
			
		try {
		System.out.println("enter the first value");
		 firstValue = sc.nextInt();
		System.out.println("enter the second value");
		 secondValue = sc.nextInt();
		 flag=false;
		}
		catch(Exception e)
		{
			System.err.println("Invalid input Please enter the number");	
		}
		sc.nextLine();
		}
		while(flag==true);
		
		System.out.println("input");
		System.out.println("firstValue=" + firstValue + "\n" + "secondValue=" + secondValue);
		System.out.println();
		firstValue = firstValue + secondValue;
		secondValue = firstValue - secondValue;
		firstValue = firstValue - secondValue;
		System.out.println();
		System.out.println("output");
		System.out.println("firstValue=" + firstValue + "\n" + "secondValue=" + secondValue);
		sc.close();
	}

	public static void main(String[] args) {
		Swap27 obj = new Swap27();
		obj.input();
	}
}
