/*
 * Maximum Subarray Sum
 *
 * Given an integer array of size N find the contingous subarray ( Containing atleast one number) 
 * which has the largest sum and returns its sum
 *
 * Input : [-2,1,-3,4,-1,2,1,-5,4]
 * Output : 6
 * Explanation : [4,-1,2,1] == 6
 *
 */

import java.util.*;

class Demo{
	public static void main(String []a ){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int [] arr = new int[N];
		for(int i = 0;i<N;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println( subarrayMaxSum(arr,N));

                System.out.println( maxSubarraySum(arr,N));
	}
	/*
	 * PrefixSum Method ---
	 * TC : O(N^2)
	 * SC : O(N)
	 */
	static int maxSubarraySum(int arr[],int N){
		int [] pref = arr;
		int maxSum = Integer.MIN_VALUE;
		for(int i = 1;i<N;i++){
			pref[i] = pref[i-1] + arr[i];
		}
		for(int i = 0;i<N;i++){
			for(int j = i;j<N;j++){
				int sum = 0;
				if(i == 0)
					sum = pref[j];
				else 
					sum = pref[j] - pref[i-1];
				if(sum>maxSum)
					maxSum = sum;
			}
		}
		return maxSum;
	}

	/*
	 * Kadane's Algorithm -----
	 * TC : O(N)
	 * SC : O(1)
	 */
	static int subarrayMaxSum(int arr[],int N){
		int sum = 0;
		int maxSum = Integer.MIN_VALUE;
		for(int i = 0;i<arr.length;i++){
			sum = sum + arr[i];

			if(maxSum<sum)
				maxSum = sum;
		
			if(sum<0)
				sum = 0;
		}
		return maxSum;
	}
}
