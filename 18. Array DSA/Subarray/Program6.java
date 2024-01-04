/*
 * Given an array of soze N find the total sum of all subarray sum
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
		System.out.println(totalSum(arr));
	}
	/*
	 * TC : O(N^3)
	 * SC : O(1)
	 */
	static int totalSum(int arr[]){
		int sum = 0;
		for(int i = 0;i<arr.length;i++){
			for(int j = i;j<arr.length;j++){
				for(int k = i;k<=j;k++){
					sum += arr[j];
				}
			}
		}
		return sum;
	}
}

