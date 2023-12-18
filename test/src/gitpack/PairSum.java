/*@author Joseph Nakhle 
@version: 2023-03 (4.27.0)
@since release 12/12/23 
*/
package gitpack;

public class PairSum {
	//Two pointer technique based solution to find
    // if there is a pair in a sorted array with a given sum.
	public static boolean hasPairWithSum(int[]arr,int value) {
		int n=arr.length;
		//first pointer
		int i=0;
		//second pointer
		int j=n-1;
		
		while(i<j) {
			//if we find a pair.
			if(arr[i]+arr[j]==value) {
				return true;
			}
			// If sum of elements at current
            // pointers is more, we move towards
            // lower values by doing j--
			else if(arr[i]+arr[j]>value) {
				j--;
			}
			// If sum of elements at current
            // pointers is less, we move towards
            // higher values by doing i++
			else {
				i++;
			}
			
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]arr= {1,2,4,7,11,15};

int target=9;
//calling function.
boolean result=hasPairWithSum(arr,target);

System.out.println(result);

	}

}
