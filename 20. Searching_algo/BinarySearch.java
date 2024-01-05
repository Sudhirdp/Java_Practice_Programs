/*
 * Binary Search :
 * it is a algorithm to find the number in a sirted array 
 * TC : O(logN)
 */
import java.util.*;

class Demo{
	int binary(int arr[],int search,int start,int end){
		if(start>end)
			return -1;
		int mid = (start+end)/2;

		if(arr[mid]==search)
			return mid;
		else if(arr[mid]>search)
			mid = end-1;
		else 
			mid = start+1;
		return binary(arr,search,start,end);
	}
	int nobinary(int arr[],int search){
		int start = 0;
		int end = arr.length-1;
		while(start<end){
			int mid = (start+end)/2;
			if(arr[mid] == search)
				return mid;
			if(arr[mid]>search)
				mid = end-1;
			else
				mid = start+1;
		}
		return -1;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int arr [] = new int[x];
		for(int i = 0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		int search = sc.nextInt();
		System.out.println(new Demo().nobinary(arr,search));
		System.out.println(new Demo().binary(arr,search,0,arr.length-1));
	}
}
