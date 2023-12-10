/*@author Joseph Nakhle 
@version: 2023-03 (4.27.0)
@since release 12/8/23 
*/

package gitpack;
import java.util.Scanner;
import java.util.random.*;
public class RandomString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("Enter a String: ");
String str=sc.nextLine();
//Ensure that the input string has at least 4 characters
if(str.length()<4) {
	System.out.println("The input must have four characters");
	System.exit(0);
}
System.out.print("Randomly generatod string : ");
for(int i=0;i<4;i++) {
	int index;
	//use math.random()
	 index=(int)(Math.random()*str.length());
     System.out.print( str.charAt(index));

	}

}

}
