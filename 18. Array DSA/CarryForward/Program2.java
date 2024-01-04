/*
 * Given an integer array of size N 
 * build an array leftmax of size in N
 * LeftMax of i contains the maximum for the indix of 0 to index i
 * Arr : [-3,6,2,4,5,8,-9,1]
 * N : 10
 * leftMax : [-3,6,6,6,6,6,8,8,8,8]
 */

import java.util.*;

class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] arr = new int [N];
		for(int i = 0;i<N;i++){
			arr[i] = sc.nextInt();
		}
		
		int []leftMax = leftMax(arr,N);
		
		for(int i : leftMax){
			System.out.println(i);
		}
		
		int [] leftMaxfast = leftMaxFast(arr,N);
		
		for(int i : leftMaxfast){
			System.out.println(i);
		}	
	}
	/* Iteration : N*(N+1)/2
	 * 		so 
	 *
	 * TC : O(N^N)
	 * SC : O(1) 
	 * 	we have created a array left max but the que itself says that you have to built the array 
	 * 	so this array wont be considered as a extra space 
	 *
	 */
	static int[] leftMax(int arr[],int N){
		
		int [] leftMax = new int[N];

		int max = Integer.MIN_VALUE;
	
		for(int i = 0;i<N;i++){

			for(int j = 0;j<=i;j++){
				if(arr[j]>max)
					max=arr[j];
			}
			leftMax[i] = max;
		}
		return leftMax;
	}
	/*
	 * TC : O(N);
	 * SC : O(1)
	 */
	static int[] leftMaxFast(int arr[], int N){
		int [] leftMax = new int[N];
		leftMax[0] = arr[0];
		for(int i = 1;i<N;i++){
			if(leftMax[i-1]>arr[i])
				leftMax[i] = leftMax[i-1];
			else
				leftMax[i] = arr[i];
		}
		return leftMax;
	}
}

