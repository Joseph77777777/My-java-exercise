/*@author Joseph Nakhle 
@version: 2023-03 (4.27.0)
@since release 12/12/23 
*/
package gitpack;

public class MaximumSumSubarray {
	//Returns maximum sum of a subarray of size x.
public static int maxSumSubarray(int[]arr,int n,int x) {
	// n is the size of array ,must be greater then x
if(n<x) {
	System.out.println("Invalid");
	return -1;
}
int maxSum=0;
//Compute sum of first window of size x
for(int i=0;i<x;i++) {
	maxSum=maxSum+arr[i];
}
//Compute sums of remaining windows by
// removing first element of previous
// window and adding last element of
// current window
int windowSum=maxSum;
for(int i=x;i<n;i++) {
	windowSum=windowSum+arr[i]-arr[i-x];
	maxSum=Math.max(maxSum, windowSum);
}
return maxSum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaximumSumSubarray Solution =new MaximumSumSubarray();
		int[]arr= {1,4,2,10,2,3,1,0,20};
		int n=arr.length;
		int k=3;
		System.out.print("The maximum sum of subarray is : ");
		// function call
		int result=Solution.maxSumSubarray(arr, n, k);
		System.out.println(result);
	}

}
