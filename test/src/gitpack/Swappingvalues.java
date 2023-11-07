/*@author Joseph Nakhle 

@version: 2023-03 (4.27.0)
@since release 10/2/23 
*/

//This Java program is used to swap the values of two variables without using a temporary variable.

package gitpack;

public class Swappingvalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2;
		int b=3;
		//printing the values before swapping.
		System.out.println("Before swapping a= "+ a +" and b= " +b);
		
	//swapping the values of two variables without using a temporary variable.
		a=a+b;
		b=a-b;
		a=a-b;
		//printing the values after swapping.
		System.out.println("After swapping a= "+ a +" and b= " +b);
	}

}
