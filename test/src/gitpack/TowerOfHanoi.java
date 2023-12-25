/*@author Joseph Nakhle 
@version: 2023-03 (4.27.0)
@since release 12/20/23 
*/

package gitpack;
//Java recursive function to solve tower of hanoi puzzle
public class TowerOfHanoi {
public static void Hanoi(int n ,char fromRod ,char toRod,char auxRod) {
	if (n==1) {
		System.out.println("Move disk 1 from "+ fromRod + " to "+ toRod);
		return;
		}
	Hanoi(n-1,fromRod,auxRod,toRod);
	System.out.println("Move disk " + n+ " from "+ fromRod + " to "+ toRod);
	Hanoi(n-1,auxRod,toRod,fromRod);
}
//Driver code
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Number of disks		
int n=3;
//function call
Hanoi(3,'A','C','B');
	}

}
