/*
 * Que 1 :
 * Equilibrium Index 
 *
 * Given an array a of n positive numbers. The task is to find the first equilibrium point 
 * in an array. Equilibrium point in an array is an index(or position) such that the sum of 
 * all the elements before that index is same as sum of the elements afer it.
 *
 * Example 1;
 * INPUT :
 * N = 5
 * a = [1,3,5,2,2]
 * OUTPUT : 3
 *
 * Explanation :
 * equilibrius point is at position 3 as sum of elements before it (1+3) = 4 
 * and sum of elements after it (2+2)
 *
 */

import java.io.*;

class Demo{
	public static void main(String []a)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];

		for(int i = 0;i<n;i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println(equilibriumPoint(arr,n));

	}
	/*
	 * TC : O(N*N)
	 * SC : O(1)
	 */
	static int equilibriumPoint(int arr[],int n){
		for(int i = 0;i<arr.length;i++){
			int sumleft = 0;
			int sumright = 0;
			for(int j = 0;j<i;j++){
				sumleft = sumleft+arr[j];
			}
			for(int j = i+1;j<n;j++){
				sumright = sumright+arr[j];
			}
			if(sumleft == sumright)
				return i+1;
		}
		return -1;
	}
}

