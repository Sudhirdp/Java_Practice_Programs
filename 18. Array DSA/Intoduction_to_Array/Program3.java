/*
 * Que : 3 
 * Given an array of size N
 * Return the count of pairs (i,j) with Arr[i]+Arr[j] == k
 * Arr : [3,5,2,1,-3,7,8,15,6,13]
 * N : 10
 * K : 10
 * Output : 6
 *
 */

import java.util.*;

class Demo{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int k = sc.nextInt();
		int [] arr = new int[N];
		for(int i = 0;i<N;i++){
			arr[i]= sc.nextInt();
		}
		System.out.println(sumEqualK(arr,N,k));
		System.out.println(sumEqual2K(arr,N,k));
	}
	/*
	 *	TC : O(N^2)
	 *	SC : O(1)
	 */
	static int sumEqualK(int arr[],int N,int k){
		int count =0;
		for(int i = 0;i<N;i++){
			for(int j = 0;j<N;j++){
				if(i!=j && arr[i] + arr[j] == k)
					count++;
			}
		}
		return count;
	}
	/*
	 *	TC : O(N^2) but here iteratons are half
	 *	SC : o(1)
	 */
	static int sumEqual2K(int arr[],int N,int k){
                int count =0;
                for(int i = 0;i<arr.length;i++){
			for(int j = i+1;j<arr.length;j++){
				if(arr[i]+arr[j]==k)
					count++;
			}
		}
                return count*2;
        }
}

