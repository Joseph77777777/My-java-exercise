/*@author Joseph Nakhle 
@version: 2023-03 (4.27.0)
@since release 12/8/23 
*/
package gitpack;

public class LargestSum {
	//Returns maximum sum of a subarray
public  int maxSubarraySum(int[]arr) {
	int n=arr.length;
	int maxSum=0;
	int windowSum=0;
	
	for(int i=0;i<n;i++) {
		windowSum=windowSum+arr[i];
		if(windowSum>maxSum) {
			maxSum=windowSum;
		}
		else if(windowSum<0) {
			windowSum=0;
		}
	}
	return maxSum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LargestSum Solution =new LargestSum();	
int arr[]= {-2, 1, -3, 4, -1, 2, 1, -5, 4};
int result=Solution.maxSubarraySum(arr);
System.out.print("The largest sum is : " );
System.out.println(result);
	}

}
