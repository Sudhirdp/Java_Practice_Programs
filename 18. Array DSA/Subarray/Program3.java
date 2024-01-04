/*
 * Given an array of size N 
 * print all the elements in given subarray from start to the end 
 *
 * int arr [] = new []{-2,1,-3,4,-1,2,1,-5,4}
 *
 * start = 3
 * end = 7
 *
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
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		printEle(arr,start,end);
		
	}
	static void printEle(int arr[],int start,int end){

		for(int i = start;i<=end;i++){
			System.out.println(arr[i]);
		}
	}
}
