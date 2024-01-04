/*
 * Print left daigonal of square matrix
 */


import java.util.*;

class Demo{
        public static void main (String [] args){
                Scanner sc = new Scanner(System.in);

                int N = sc.nextInt();
                
		int arr[][] = new int[N][N];
                for(int i = 0;i<arr.length;i++){
                        for(int j = 0;j<arr[0].length;j++){
                                arr[i][j] = sc.nextInt();
                        }
                }
		leftDaigonal(arr);
		rightDaigonal(arr);
	}
	static void leftDaigonal(int arr[][]){
		for(int i = 0;i<arr.length;i++){
			System.out.println(arr[i][i]);
		}
	}
	static void rightDaigonal(int arr[][]){
		for(int i = 0;i<arr.length;i++){
			System.out.println(arr[i][arr.length-i-1]);
		}
	}
}
