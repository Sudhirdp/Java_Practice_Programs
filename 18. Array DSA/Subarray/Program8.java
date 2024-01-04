/*
 * Maximum Sum Subarray
 *
 * Given an integer array of size N find the contingous subarray ( Containing atleast one number)
 * which has the largest sum and returns the subarray
 *
 * Input : [-2,1,-3,4,-1,2,1,-5,4]
 * Output : [4,-1,2,1]
 * Explanation : [4,-1,2,1] == 6
 *
 */

import java.util.*;

class Demo{
        public static void main(String []a ){
                Scanner sc = new Scanner(System.in);

                int N = sc.nextInt();

                int [] arr = new int[N];
                for(int i = 0;i<N;i++){
                        arr[i] = sc.nextInt();
                }
                subarrayMaxSum(arr,N);
        }
	/*
	 * TC : O(N)
	 * SC : O(1)
	 */

	static void subarrayMaxSum(int arr[],int N){
                int sum = 0;
                int maxSum = Integer.MIN_VALUE;
		int s = 0;
		int e = 0;
		int x = 0;
                for(int i = 0;i<arr.length;i++){
                        if(sum==0)
				x = i;
			sum = sum + arr[i];

                        if(maxSum<sum){
                                maxSum = sum;
				s = x;
				e = i;
			}

                        if(sum<0)
                                sum = 0;
                }
		for(int i = s;i<=e;i++){
			System.out.println(arr[i]);
		}
        }
}
