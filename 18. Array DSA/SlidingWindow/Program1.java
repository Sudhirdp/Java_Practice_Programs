/*
 *
 * Given an array of size N 
 * Find the maximum subarray sum of length k
 *
 * Input : Arr : [-3,4,-2,5,3,-2,8,2,1,4]
 * Output : 18
 *
 */
import java.util.*;

class Demo{
	/*
	 * TC : O(N)
	 * SC : O(1)
	 */
	static int maxSumSubarray(int [] arr,int k){

		int sum = 0;
		
		int i = 0;
		while(i<k){
			sum = sum+arr[i];
			i++;
		}
		int maxSum = sum;

		int s = 0;
		int e = k;
		while(e<arr.length){
			sum = sum+arr[e]-arr[s];
			s++;
			e++;
			if(sum>maxSum){
			
				maxSum = sum;
			}
		}
		return maxSum;
	}

	/*
	 * TC : O(N)
	 * SC : O(N)
	 */
	static int maxSubarraysum(int [] arr,int k){
		int pref [] = new int[arr.length];
		pref[0] = arr[0];

		for(int i = 1;i<arr.length;i++){
			pref[i] = pref[i-1]+arr[i];
		}

		int maxSum = Integer.MIN_VALUE;
		int sum = Integer.MIN_VALUE;

		int s = 0;
		int e = k-1;

		while(e<arr.length){
			if(e==k-1){
				sum = pref[e];
			}
			else{
				sum = pref[e]-pref[s];
				s++;
			}
			if(sum>maxSum)
				maxSum = sum;
			e++;
		}
		return maxSum;
		
	}
	/*
	 * TC : O(N^2)
	 * SC : O(1)
	 */
	static int maxSubarraySum(int arr[],int k){
		int maxSum = Integer.MIN_VALUE;

		for(int i = 0;i<arr.length-k+1;i++){
			int sum = 0;
			for(int j = i;j<i+k;j++){
				sum = sum+arr[j];
			}
			if(sum>maxSum)
				maxSum = sum;
		}
		return maxSum;
	}
	public static void main(String []a){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int [] arr = new int[n];

		for(int i = 0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		System.out.println(maxSubarraySum(arr,k));
		System.out.println(maxSubarraysum(arr,k));
		System.out.println(maxSumSubarray(arr,k));
	}
}
