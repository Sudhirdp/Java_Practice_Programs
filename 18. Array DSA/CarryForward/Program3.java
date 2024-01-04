/*
 * Given an integer array of size N 
 * Builf an array rightMax for the int i to the index N-1
 *	
 * Arr : [-3,6,2,4,5,2,8,-9,3,1]
 * int N : 10;
 * rightMax : [8,8,8,8,8,8,8,3,3,1]
 *
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

                int []rightMax = rightMax(arr,N);

                for(int i : rightMax){
                        System.out.println(i);
                }
	}
	/*
	 * TC : O(N);
	 * SC : O(1);
	 */
	static int [] rightMax(int arr[],int N){
		int [] rightMax = new int[N];
		rightMax[N-1] = arr[N-1];
		for(int i = N-2;i>=0;i--){
			if(rightMax[i+1]>arr[i])
				rightMax[i] = rightMax[i+1];
			else
				rightMax[i] = arr[i];
		}
		return rightMax;
	}
}


