/*@author Joseph Nakhle 
@version: 2023-03 (4.27.0)
@since release 12/8/23 
*/
package gitpack;
import java.util.Scanner;
public class StringCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);

System.out.print("Enter the first string : ");
String S1=sc.nextLine();
System.out.print("Enter the second string : ");
String S2=sc.nextLine();

if(S1.length()%2!=0 || S2.length()%2!=0) {
	System.out.println("Strings must have an even number of characters");
	System.exit(0);
}
String S3=S2.substring(0, S2.length()/2);
String S4=S1.substring(S1.length()/2, S1.length());
String S5=S2.substring((S2.length()/2), S2.length());
String S6=S1.substring(0, (S1.length()/2));
System.out.print("S:"+S3+S4+S5+S6);
	}

}
