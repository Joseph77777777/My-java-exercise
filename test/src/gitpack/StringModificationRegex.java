/*@author Joseph Nakhle 
@version: 2023-03 (4.27.0)
@since release 12/20/23 
*/

package gitpack;
import java.util.Scanner;
public class StringModificationRegex {
public static String removeWhiteSpaceAndDash(String input) {
	 // pattern to match white spaces and dash characters
	String regex="[\\s-]";
	//Replace matched characters with an empty string
	return input.replaceAll(regex, "");
}
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
//Driver code
Scanner sc=new Scanner(System.in);
System.out.print("Enter a sentence :");
String S=sc.nextLine();
//calling function
String modified=removeWhiteSpaceAndDash(S);
System.out.print("Modified sentence: "+modified );
	}

}
