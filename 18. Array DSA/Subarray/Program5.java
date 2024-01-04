/*
 * Given array of size N 
 * int arr []
 * A. Print the sum of every single subarray
 * B. Print the sum of every subarray using prefix sum
 * C. Print the sum of every single subarray with TC O(N^2)
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
		sumOfSubarray(arr,n);
		subOfsubarray(arr,n);
		sumofSubarray(arr,n);
	}
	/*
	 * TC : O(N^3)
	 * SC : O(1)
	 */
	static void sumOfSubarray(int arr[],int N){
		System.out.println("Output for 1");
		for(int i = 0;i<N;i++){
			for(int j = i;j<arr.length;j++){
				int sum = 0;
				for(int k = i;k<=j;k++){
					sum = sum+arr[k];
				}
				System.out.println(sum);
			}
		}
	}
	/*
	 * TC : O(N^2)
	 * SC : O(N)
	 */
	
	static void sumofSubarray(int arr[],int N){
		System.out.println("Output for 2");
		int pref[] = arr;

		for(int i = 1;i<arr.length;i++){
			pref[i] = pref[i-1] + arr[i];
		}
		
		for(int i = 0;i<arr.length;i++)	{
			for(int j=i;j<arr.length;j++){
				if(i == 0)
					System.out.println(pref[j]);
				else
					System.out.println(pref[j]-pref[i-1]);
				
			}
		}
	}
	
	/*
	 * TC : O(N^2)
	 * SC : O(0)
	 */
	static void subOfsubarray(int arr[],int N){
		System.out.println("Output of 3");
		for(int i = 0;i<arr.length;i++){
			int sum = 0;
			for(int j = i;j<arr.length;j++){
				sum += arr[j];
				System.out.println(sum);
			}
		}
	}
}

