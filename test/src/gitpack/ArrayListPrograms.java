/*@author Joseph Nakhle 



@version: 2023-03 (4.27.0)
@since release 8/10/23 
*/


package gitpack;

import java.util.Arrays;

public class ArrayListPrograms {

	// Java Program to find given two array are equal or not using sorting.
	
	public static boolean areEqual(int arr1[],int arr2[]) {
		int N=arr1.length;
		int M=arr2.length;
		
	// If the lengths of arrays are not equal it means they are not equal.
	if(N!=M) {
		return false;
	}
	
	// Sorting arrays
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	
	//comparing elements
	for(int i=0;i<N;i++) {
		if(arr1[i]!=arr2[i]) {
			return false;
		}
		// If all elements were same.
		else {
			return true;
		}
	}
	
	return false;
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Driver code of comparing two arrays equals or not
		int arr1[]= {1,5,4,2,6,8,7,3};
		int arr2[]= {2,4,6,1,5,8,7,3};
		
		// Function call areEqual
		if (areEqual(arr1,arr2)) {
			System.out.println("The two arrays are equal");
		}
		else {
			System.out.println("The two arrays are not equal");
		}

}
}