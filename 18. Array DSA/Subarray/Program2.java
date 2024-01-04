/*
 *
 * Quiz 1 : 
 * Given an array of sizr N
 * Total no of subarrray possible ?
 *
 * A = N*(N-1)
 * B = N*(N-1)/2
 * C = N*(N+1)/2
 * D = N*(N+1)
 *
 * Option C is correct 
 *
 */

/*
 * Quiz 2 : 
 * Find the number of subarray in given array
 * arr : [4,2,10,3,12,-2,15]
 *
 */

import java.util.*;

class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}

		System.out.println(SubarrayCount(arr,n));
		System.out.println(subarrayCount(arr,n));
	}
	/*
	 * TC : O(n^2)
	 * SC : O(1)
	 */
	static int SubarrayCount(int arr[],int N){
		int count = 0;
		for(int i = 0;i<N;i++){
			for(int j = i;j<N;j++){
				count++;
			}
		}
		return count;
	}

	/*
	 * TC : O(1)
	 * SC : O(1)
	 */
	static int subarrayCount(int arr[],int N){
		return N*(N+1)/2;
	}
}


