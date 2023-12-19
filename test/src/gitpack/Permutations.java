/*@author Joseph Nakhle 
@version: 2023-03 (4.27.0)
@since release 12/15/23 
*/
package gitpack;

public class Permutations {
	//function to swap two elements.
static void swap(int[]arr,int l,int i) {
	int temp =arr[l];
	arr[l]=arr[i];
	arr[i]=temp;
	
}
//permutation function.
static void permute(int[] arr,int l,int r) {
	if(l==r) {
		for(int elements :arr) {
			System.out.print(elements);	
			}
	}
	
	for (int i=l;i<=r;i++) {
		swap(arr,l,i);
		permute(arr,l+1,r);
		swap(arr,l,i);
	}
}
//Driver code.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Permutations Solution =new Permutations();
		int[]arr= {1,2,3};
		int n=arr.length;
		Solution.permute(arr, 0, n-1);
	}

}
