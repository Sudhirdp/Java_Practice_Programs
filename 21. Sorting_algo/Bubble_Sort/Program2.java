// Bubble sort done in recursion 
//

import java.util.*;

class Demo{
	int[] bubblesort(int []arr,int n){
		if(n == 0){
			return arr;
		}
		for(int i = 0;i<n-1;i++){
			if(arr[i]>arr[i+1]){
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		return bubblesort(arr,--n);
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for(int i = 0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		arr = new Demo().bubblesort(arr,arr.length);
		for(int i : arr)
			System.out.println(i);

	}
}
