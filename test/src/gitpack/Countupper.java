/*@author Joseph Nakhle 
@version: 2023-03 (4.27.0)
@since release 12/8/23 
*/

package gitpack;
import java.util.Scanner;
public class Countupper {
//method to count the upper letters in a word.
	public static void  Upper(String str) {
		
		int size=str.length();
		int count=0;
		
		for(int i=0;i<size;i++) {
			char ch=str.charAt(i);
			if(ch>='A'&& ch<='Z') {
				count++;
			}
		}
		//Display the count of upper letters.
		System.out.println("The number of upper letters is : " + count);
		
	}
	
	
	//Driver code
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a sentence : ");

String S=sc.nextLine();
//calling Upper() method.
Upper(S);

	}

}
