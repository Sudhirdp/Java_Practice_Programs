/*
 * Arr : [3,4,5,1,2,7,9,8]
 * N : 8
 * i : 3
 *
 * find the maximum in given range index i
 */

import java.util.*;

class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] arr = new int[N];
		for(int i = 0;i<N;i++){
			arr[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		System.out.println(maxInRange(arr,x,N));
	}
	/*
	 * TC : O(N)
	 * SC : O(1)
	 */
	static int maxInRange(int arr[],int x,int N){
		int max = Integer.MIN_VALUE;
		for(int i = 0;i<x;i++){
			if(arr[i]>max)
				max = arr[i];
		}
		return max;
	}
}





