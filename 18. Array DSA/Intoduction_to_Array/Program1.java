/*
 * Given an array of size N , Print all the elemnts 
 * Arr : [5,6,2,3,1,3]
 * N : 6
 */

import java.util.*;

class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		for(int i = 0;i<N;i++){
			arr[i] = sc.nextInt();
		}
		printall(arr,N);
	}
	static void printall(int []arr,int N){
		for(int i = 0;i<N;i++){
			System.out.println(arr[i]);
		}
	}
}

