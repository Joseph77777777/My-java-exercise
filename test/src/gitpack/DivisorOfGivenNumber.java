/*@author Joseph Nakhle 

@version: 2023-03 (4.27.0)
@since release 8/10/23 
*/

//This Java program is used to find the divisors of a given number.
//By taking input from the user.

package gitpack;
import java.util.Scanner;

public class DivisorOfGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Taking input from the user using Scanner Class.
Scanner sc=new Scanner(System.in);

System.out.println("Enter a number : ");
int numb=sc.nextInt();

System.out.println("The divisors are : ");

for(int i=1;i<=numb;i++) {
	//if remainder is zero then numb is divided by i
	if(numb%i==0) {
		System.out.print(i + " ");
	}
}

	}

}
