/*
 * Fiven an array of size N , Reverse tge array withoud using extraa space 
 * Space Complexity : O(!)
 *
 */

import java.util.*;

class Demo{
	public static void main(String []a ){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] arr = new int [N]; 
		for(int i = 0;i<N;i++){
			arr[i] = sc.nextInt();
		}
		int [] arr1 = reverseOne(arr,N);
		for(int i : arr1){
			System.out.println(i);
		}
	}
	static int [] reverseOne(int [] arr,int N){
		int i = 0;
		int j = N-1;
		while(i<j){
			int temp = arr[i];
			arr[i]=arr[j];
			arr[j]= temp;
			i++;
			j--;
		}
		return arr;
	}
}


