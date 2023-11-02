/*@author Joseph Nakhle
@version: 2023-03 (4.27.0)
@since release 6/1/23 
*/

//This Java program is used to check if a year is a leap year or not.
//By taking input from the user.

package gitpack;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Taking input from the user using Scanner Class.
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a year:  ");
		int year=sc.nextInt();
		
		//Method that checks if the year is a leap year or not.   
		boolean compare=(year %4==0);
		
		if (compare) {
			System.out.println("The year of "+ year + " is a leap year");
		}
		else {
			System.out.println("The year of "+ year + " is not a leap year");
		}
			}

	}


