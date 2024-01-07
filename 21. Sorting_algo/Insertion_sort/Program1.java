/*
 * Insertion sort works same as like cards 
 * in insertion sort the smallest element is taken aside and compared with all the prceding 
 * elements and is kept at the proper index 
 * in this the swapping operation is reduced 
 * as compared to bubble sort 
 *
 */

import java.util.*;

class Demo{
	int [] insertionsort(int arr[]){
		for(int i = 1;i<arr.length;i++){
			int ele = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>ele){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1] = ele;
		}
		return arr;
	}
	public static void main(String []a ){
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];

		for(int i = 0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		arr = new Demo().insertionsort(arr);
		for(int i : arr)
			System.out.println(i);

	}
}
