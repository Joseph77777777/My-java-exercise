/*@author Joseph Nakhle 


@version: 2023-03 (4.27.0)
@since release 12/9/23 
*/

package gitpack;
public class CountPrime {
public static boolean isPrime(int number) {
	if(number<=1) {
		return false;
	}
	for(int i=2;i<=Math.sqrt(number);i++) {
		if(number%i==0) {
			return false;
		}
		
		else {
			return true;
		}
	}
	return false;
}
public static void arrayCountPrime(int[]arr) {
	int count =0;
	for(int numb:arr) {
		if(isPrime(numb)) {
			count++;
		}
	}
	System.out.print( count);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]arr= {3,5};
System.out.print("The numbers of prime values :");
arrayCountPrime(arr);
	}

}
