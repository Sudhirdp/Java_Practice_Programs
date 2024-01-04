/*
 * Find the second min in a array 
 */

import java.util.*;

class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr [] = new int[N];
		for(int i = 0;i<N;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println(secLargest(arr,N));
	}
	/*
	 * 	TC : O(N)
	 * 	Sc : O(1)
	 */
	static int secLargest(int arr[],int N){
		int max = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;

		for(int i = 0;i<arr.length;i++){
			if(arr[i]>max){
				secMax = max;
				max = arr[i];
			}
			if(arr[i]>secMax && arr[i]!=max)
				secMax = arr[i];
		}
		return secMax;
	}
}

