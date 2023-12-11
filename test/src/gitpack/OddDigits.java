/*@author Joseph Nakhle 


@version: 2023-03 (4.27.0)
@since release 12/9/23 
*/
package gitpack;
import java.util.Scanner;
public class OddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number :");
int n=sc.nextInt();
//convert integer into a string
String N=Integer.toString(n);
int oddcount=0;
int Sum=0;
//using for loop to traverse the string.
for(int i=0;i<N.length();i++) {
	char ch=N.charAt(i);
    //checking if it is odd number.
	if(ch %2!=0) {
		Sum=Sum+Character.getNumericValue(ch);
		oddcount++;
		
	}
	
}
//display odd count.
System.out.println("Number of odd digits found is : " + oddcount);

double AVG=(Sum)/2;
//display Average of the odd numbers.
System.out.println("Average of the odd digits found is : "+AVG);
	}

}
