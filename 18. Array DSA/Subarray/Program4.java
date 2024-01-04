/*
 * Given an arrayof size N 
 * print all the subarray 
 * int [] arr = new int []{2,4,1,3}
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
		printSubarray(arr);
	}
	/*
	 * TC : O(N^3)
	 * SC : O(1)
	 */
	static void printSubarray(int arr[]){
		for(int i = 0;i<arr.length;i++){
			for(int j = i;j<arr.length;j++){
				for(int k = i;k<=j;k++){
					System.out.print(arr[k]+ " ");
				}
				System.out.println();
			}
		}
	}
}
