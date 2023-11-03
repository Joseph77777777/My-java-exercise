/*@author Joseph Nakhle 
@version: 2023-03 (4.27.0)
@since release 5/26/23 
*/

//This Java program is used to check if a number is negative or positive.
//By taking input from the user.

package gitpack;

import java.util.Scanner;

public class Negativeorpositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Taking input from the user using Scanner Class.
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a number: ");
		
		int numb = 0;
		
		try {
			numb=sc.nextInt();
		}
		catch(Exception e) {
			System.out.println("Please enter a valid number");
			System.exit(0);
		}
		//Checking  if the given number is negative or positive using if ,else if and else.
	if(numb>=0) {
		System.out.println("The number is positive");
	}
	
	else{
		System.out.println("The number is negative");
	}
	}
	}


