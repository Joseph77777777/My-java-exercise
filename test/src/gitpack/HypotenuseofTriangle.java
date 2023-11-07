/*@author Joseph Nakhle 

@version: 2023-03 (4.27.0)
@since release 6/4/23 
*/

//This Java program is used to calculate the hypotenuse of a triangle.
//By taking input from the user.



package gitpack;
import java.util.Scanner;

public class HypotenuseofTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Taking input from the user using Scanner Class.		
Scanner sc=new Scanner(System.in);

System.out.println("Enter the adjacent Side");
Double adjacent=sc.nextDouble();

System.out.println("Enter the opposite Side");
Double opposite=sc.nextDouble();

adjacent=Math.pow(adjacent, 2);
opposite=Math.pow(opposite, 2);

//find the hypotenuse by using Pythagoras formula.
Double hypotenuse=Math.sqrt(adjacent+opposite);

//print the result
System.out.println("The hypotenuse is : " +hypotenuse);


	}

}
