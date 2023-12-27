/*@author Joseph Nakhle 
@version: 2023-03 (4.27.0)
@since release 12/20/23 
*/

package gitpack;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountUpperRegex {
public static int Count(String input) {
	Pattern p=Pattern.compile("[A-Z]");
	Matcher m=p.matcher(input);
	
	int count=0;
	while(m.find()) {
		count++;
	}
	return count;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("Enter a string: ");
String S=sc.nextLine();
int Count=Count(S);
System.out.println("The count of upper letters in S is : "+ Count);
	}

}
