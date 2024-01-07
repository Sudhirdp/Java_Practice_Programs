/*
 * A we all know how to find the maximum element in array 
 * so we here divide the complete array into subarray of 2 elements
 * and find the maximum between then and we do this and move forward dividing
 * and finding maximumm between two element and carry the maximum to the end
 * if we are sorting in ascending order and vice versa
 *
 */

import java.util.*;

class Demo{
	/*
	 * TC : O(N^2)
	 * SC : O(1)
	 */
	static int[] bubblesort(int arr[]){

		for(int i =0;i<arr.length;i++){
		
			boolean swapped = true;
		
			for(int j = 0;j<arr.length-1-i;j++){
		
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = false;
				}
			}
			if(swapped)
				return arr;
		}
		return arr;
	}
	public static void main(String [] a){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		
		bubblesort(arr);

		for(int i : arr){
			System.out.println(i);
		}
	}
}
