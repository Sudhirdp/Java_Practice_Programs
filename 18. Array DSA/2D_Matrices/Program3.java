/*
 * Give a matrix of size N*M
 * Print all the diagonal (R->L)
 * Note row == 0
 * 
 * Input :
 *
 * 1       2       3       4       5       6
 * 7       8       9       10      11      12
 * 13      14      15      16      17      18
 * 19      20      21      22      23      24
 *
 * Output :
 *
 * 6 11 16 21
 * 5 10 15 20
 * 4 9 14 19
 * 3 8 13
 * 2 7
 * 1
 *
 */

import java.util.*;

class Demo{
	public static void main(String []a ){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		int arr[][] = new int[N][M];

		for(int i = 0;i<arr.length;i++){
			for(int j = 0;j<arr[0].length;j++){
				arr[i][j] = sc.nextInt();
			}
		}

		diagonal(arr,N,M);
	}
	/*
	 * TC : O(M*N)
	 * SC : O(1)
	 */
	static void diagonal(int arr[][],int N,int M){
		for(int i = M-1;i>=0;i--){
			int x = 0;
			int j = i;
			while(j>=0 && x<N){
				System.out.print(arr[x][j] +" ");
				x++;
				j--;
			}
			System.out.println();
		}
	}
}


