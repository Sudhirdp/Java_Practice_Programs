/*
 * Que 2 :
 * Array Rotation
 * given an array of size N and an integer B we have to return the same array after rotating it B times toward the right
 *
 * Constraint :
 * 1<= N <= 10^9
 * 1<= A <= 10^9
 * 1<= B <= 10^9
 *
 * Ex :
 * Input : [1,2,3,4]
 * 	B : 2
 * Output : [3,4,1,2]
 *
 * Ex :
 * Input : [2,5,6]
 * 	B : 1
 * Output : [6,2,5]
 *
 */

import java.util.*;
class Demo{
	public static void main(String []a){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		for(int i = 0;i<N;i++){
			arr[i] = sc.nextInt();
		}
		int B = sc.nextInt();

		arr = arrayRotation(arr,N,B);
		for(int i : arr){
			System.out.println(i);
		}
	}
	static int[] arrayRotation(int [] arr,int N,int B){
		
		for(int i = 0;i<B;i++){
			for(int j= N-1;j>=0;j--){
				int temp = arr[j];
				try{
				arr[j] = arr[j-1];
				arr[j-1] = temp;	
				}catch(ArrayIndexOutOfBoundsException ie){
				
				}	
			}
		}
		return arr;	
	}
}
