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
	
	//Java Program to check if a value is present in an array or not.
	public static void check(int arr[],int value) {
		
		//Function return true if given value found in array.
		boolean test=false;
		for(int i : arr) {
			if(i==value) {
				test=true;
				break;
			}
		}
		//Display the result
		System.out.println("Is "+value + " present in the array ? : "+ test);
	}
	
	//Function to reverse an array
	public static void reverseArray(int arr[],int start,int end) {
		int temp;
		while(start<end) {
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	//method to print out an array.
	public static void printArray(int arr[]) {
		for(int i :arr) {
			System.out.print(i + " ");
		}
	}
	
	//function to find the index of an element.
	public static int findIndex(int arr[],int element) {
		//if array is null
		if (arr==null) {
			return -1;
		}
		int i=0;
		while(i<arr.length) {
			if(arr[i]==element) {
				return i;
			}
			else {
				i=i+1;
			}
		}
		return -1;
	}
	
	//Merge two sorted arrays
	public static void mergeArrays(int arr1[],int arr2[],int arr3[],int L1,int L2) {
		int i = 0,j=0,k = 0;
		while(i<L1) {
			arr3[k++]=arr1[i++];
		}
		while(j<L2) {
			arr3[k++]=arr2[j++];
		}
		Arrays.sort(arr3);
	}
	
	//Moving all negative elements to one side of an array using sorted method
		public static void move(int arr[]) {
			Arrays.sort(arr);
		}
		
	//count occurrence of an element
		public static int occurrence(int arr[],int L,int x) {
			int count=0;
			for(int i=0;i<L;i++) {
				if(arr[i]==x) {
					count++;
				}
			}
			return count;
		}
	//Cyclically rotate an array by one
		public static void rotate(int arr[],int N) {
			int temp=arr[N-1];
			for(int i=1;i<N;i++) {
				arr[N-i]=arr[N-i-1];
			}
			arr[0]=temp;
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        //Driver code of how to iterate an array in java 
		//1st method
		int arr[]= {1,2,3,4,5};
		//Using for loop
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		//2nd method
		int array[]= {1,2,3};
		//Using for each loop
		for(int element:array) {
			System.out.print(element + " ");
		}
		System.out.println();
		
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
		
		//Driver code checking if a value is present in an array or not.
		int arr3[]= {1,2,3,4,5};
		int value=3;
		//print the array
		System.out.println("Array:" + Arrays.toString(arr));
		// Function call check
		check(arr,value);
		
		//Driver code of getting the largest number in an array.
		int arr4[]= {10,20,30,40};
		// Initialize maximum element
		int maximum=arr4[0];
		// Traverse array elements
		for(int i=1;i<arr4.length;i++) {
			if (arr4[i]>maximum) {
				maximum=arr4[i];
			}
		}
		System.out.println("The largest number in arr4 is : " + maximum);
		
		//Driver code of copying an array into another array.
		//Using clone() method.
		int arrA[]= {1,2,3};
		 // Copying elements of arrA[] to arrB[] using clone() method.
		int arrB[]=arrA.clone();
		
		System.out.println("contents of arrA :");
		for(int elementA:arrA) {
			System.out.print(elementA + " ");
		}
		System.out.println();
		
		System.out.println("contents of arrB :");
		for(int elementB:arrB) {
			System.out.print(elementB + " ");
		}
		
		System.out.println();
		
		//Driver code of reversing an array.
		int arr5[]= {10,30,50,70};
		System.out.print("arr5 before reverse : ");
		//function call printArray
		printArray(arr5);
		//function call reverseArray
		reverseArray(arr5,0,3);
		
		System.out.println();
		
		System.out.print("arr5 after reverse : ");
		//function call printArray
		printArray(arr5);
		
		System.out.println();
		
		//Driver code of getting the index of an element
		int arr6[]= {50,60,80,100};
		// find the index of 50 using findIndex method
		System.out.println("Index of 50 is : " + findIndex(arr6,50));
		// find the index of 100 using findIndex method
		System.out.println("Index of 100 is : " +findIndex(arr6,100));
		
		System.out.println();
		
		//Driver code of merging two arrays.
		int arr7[]={10,15,20};
		int arr8[]= {1,2,3};
		
		int L1=arr7.length;
		int L2=arr8.length;
		
		int arr9[]=new int[L1+L2];
		
		//function call mergeArrays.
		mergeArrays(arr7,arr8,arr9,L1,L2);
		
		System.out.println("Array 9 after merging : ");
		//function call printArray
		printArray(arr9);
		
		System.out.println();
		
		//Driver code of moving all negative elements to one side.
		int arr10[]= {1,2,-1,3,-2,-4,-5};
		//function call move
		move(arr10);
		System.out.println("Array 10 after moving: ");
		//function call printArray
		printArray(arr10);
		
		System.out.println();
		
		//Driver code to find the occurrence of an integer in the array
		int arr11[]= {1,2,1,3,4,4,5,6};
		int L=arr11.length;
		//function call occurrence
		System.out.println("Number 4 occurs " + occurrence(arr11,L,4) + " times in arr11");
		
		System.out.println();
		
		//Driver code of Cyclically rotate an array by one
		int arr12[]= {5,1,2,3,4};
		int N=arr12.length;
		//function call rotate
		rotate(arr12,N);
		System.out.println("arr12 after rotation by one : " );
		printArray(arr12);
}
}