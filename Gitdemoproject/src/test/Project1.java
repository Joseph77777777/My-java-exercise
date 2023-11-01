package test;

import java.util.Scanner;

public class Project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a year:  ");
		int year=sc.nextInt();
		boolean compare=(year %4==0);
		if (compare) {
			System.out.println("The year of "+ year + " is a leap year");
		}
		else {
			System.out.println("The year of "+ year + " is not a leap year");
		}
	}

}
