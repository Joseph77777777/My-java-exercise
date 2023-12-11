/*@author Joseph Nakhle 

@version: 2023-03 (4.27.0)
@since release 12/9/23 
*/
package gitpack;
import java.util.Scanner;
public class ReverseString {
	//Reverse method that returns a new String that contains the characters of str in reverse order.
public static void reverse(String str) {
	int size=str.length();
	//using for loop
	for(int i=size-1;i>=0;i--) {
		char ch=str.charAt(i);
		System.out.print(ch);
	}
			
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a sentence :");
String str=sc.nextLine();
System.out.print("Sentence in reverse order : ");
//calling reverse() method.
reverse(str);
	}

}
