/*@author Joseph Nakhle 
@version: 2023-03 (4.27.0)
@since release 12/8/23 
*/
package gitpack;
import java.util.Scanner;
public class StringModification {
	//java program that reads a sentence from the user.
	//Modifying the sentence by removing white space and dash character.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a sentence : ");

String str=sc.nextLine();
//replacing white space.
String str1=str.replace(" ","");
//replacing the dash character.
String strModified=str1.replace("-","");

//Display the sentence after modification.
System.out.println("Sentence after modification :" + strModified);

	}

}
