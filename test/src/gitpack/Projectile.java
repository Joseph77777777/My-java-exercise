/*@author Joseph Nakhle 


@version: 2023-03 (4.27.0)
@since release 12/9/23 
*/

package gitpack;
import java.util.Scanner;
import java.util.*;

public class Projectile {
	//method that convert angle from degrees to radiant.
public static double angleRad(double angledeg) {
	double Rad=angledeg*(Math.PI/180);
	return Rad;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the initial Speed in m/s:");
int V0=sc.nextInt();
System.out.println("Enter the initial angle in degrees :");
double a=sc.nextDouble();

final double G= 9.8;
//Equation of the distance.
double d=((Math.pow(V0, 2)*Math.sin(2*angleRad(a)))/G);

System.out.print("The distance travelled is : ");
//format the output to 2 significant digits.
System.out.printf("%,.2f",d );
System.out.print(" meters");

	}

}
