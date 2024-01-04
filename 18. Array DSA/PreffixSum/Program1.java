/*
 * Prefix Sum : when the problems statements are regardig range of querries
 * 
 * Que : Given an array of size N and Q number of queries 
 * Query contains two parameter(s,e) s=> start index and e = > end index for all queries print the sum fo all elements 
 * from s to e inex
 *
 * Arr : [-3,6,2,4,5,2,8,-9,3,1]
 * N = 10
 * Q = 3
 * Query 1 : 1,3
 * Query 2 : 2,7
 * Query 3 : 1,1
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
		int Q = sc.nextInt();
		sumOfRange(arr,N,Q,sc);
		sumOfRangePS(arr,N,Q,sc);
	}
	/*
	 * Brute Force Aprroach 
	 * TC :: O(Q*N);
	 * SC :: O(1);
	 */
	static void sumOfRange(int [] arr, int N,int Q,Scanner sc){
		
		for(int i = 0;i<Q;i++){
			int sum = 0;
			int s = sc.nextInt();
			int e = sc.nextInt();
			for(int j = s;j<=e;j++){
				sum = sum+arr[j];
			}
			System.out.println(sum);
		}
	}
	/*
	 * Little Optimized Code 
	 * TC :: O(N+Q) or O(max of N/Q);
	 * SC :: O(1);
	 */
	static void sumOfRangePS(int [] arr,int N,int Q,Scanner sc){
		for(int i = 1;i<N;i++){
			arr[i]=arr[i]+arr[i-1];
		}
		for(int i = 1;i<=Q;i++){
			int s = sc.nextInt();
			int e = sc.nextInt();
			if(s==0)
				System.out.println(arr[e]);
			else
				System.out.println(arr[e]-arr[s-1]);
		}
	}
}


