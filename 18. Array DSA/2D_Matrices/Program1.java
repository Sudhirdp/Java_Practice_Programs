/*
 * Print all elements in 2D matrice Row wise 
 */

import java.util.*;

class Demo{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int arr[][] = new int[N][M];
		for(int i = 0;i<arr.length;i++){
			for(int j = 0;j<arr[0].length;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		rowWisePrint(arr);
		columnWisePrint(arr);
		sumRowWise(arr);
		sumColumnWise(arr);
		sumOfMatrix(arr);
	}
	/*
	 * Printing all Elements of matrix Row Wise
	 */
	static void rowWisePrint(int arr[][]){
		for(int i = 0;i<arr.length;i++){
			for(int j = 0;j<arr[0].length;j++){
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}
	/*
	 * Printing all elements of matrix column wise
	 */
	static void columnWisePrint(int arr[][]){
		for(int i = 0;i<arr[0].length;i++){
			for(int j = 0;j<arr.length;j++){
				System.out.print(arr[j][i]+ " ");
			}
			System.out.println();
		}
	}
	/*
	 * Printing row wise sum of matrix 
	 */
	static void sumRowWise(int arr[][]){
		for(int i = 0;i<arr.length;i++){
			int sum = 0;
			for(int j = 0;j<arr[0].length;j++){
				sum += arr[i][j];
			}
			System.out.println(sum);
		}
	}
	/*
	 * printing row wisw sum of matrix
	 */
	static void sumColumnWise(int arr[][]){
		for(int i = 0;i<arr[0].length;i++){
			int sum = 0;
			for(int j=0;j<arr.length;j++){
				sum += arr[j][i];
			}
			System.out.println(sum);
		}
	}
	/*
	 * print sum of entire matrix
	 */
	static void sumOfMatrix(int arr[][]){
		int sum = 0;
		for(int i =0;i<arr.length;i++){
                        for(int j = 0;j<arr[0].length;j++){
                                sum += arr[i][j];
                        }
                }
		System.out.println(sum);
        }

}

