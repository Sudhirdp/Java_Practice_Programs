/*
 * Que 2 :
 * Given an integer array of size N 
 * count the no of elements having atleast 1 element greater than itself 
 * Arr : [2,5,1,4,8,0,8,1,3,8]
 * N : 10
 * Output : 7
 *
 */

import java.util.*;

class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		for(int i = 0;i<N;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println(alleastOne(arr,N));
		System.out.println(atleastOne(arr,N));
	}
	/*
	 *	Time Complexity : O(N^2)
	 *	Space Complexity : O(1)
	 */
	static int alleastOne(int arr[],int N){
		int count = 0;
		for(int i =0;i<N;i++){
			for(int j =0;j<N;j++){
				if(arr[j]>arr[i]){
					count++;
					break;
				}
			}
		}
		return count;
	}

	/*
	 * 	Time Complexity : O(N);
	 * 	Space Complexity : O(1);
	 */
	static int atleastOne(int arr[],int N){
		int max = Integer.MIN_VALUE;
		for(int i = 0;i<N;i++){
			if(arr[i]>max)
				max = arr[i];
		}
		int count = 0;
		for(int i = 0;i<N;i++){
			if(arr[i] == max)
				count++;
		}
		return N-count;
	}
}

