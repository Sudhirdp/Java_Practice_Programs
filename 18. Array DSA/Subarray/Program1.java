/*
 * Find the len of shortest subarray containing both maximum and minumum element
 */

import java.io.*;

class Demo{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int arr[] = new int[n];

		for(int i = 0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println(ShortestSubarray(arr,n));

	}

	static int ShortestSubarray(int arr[],int n ){
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int len = Integer.MAX_VALUE;

		for(int i=0;i<arr.length;i++){
			if(arr[i] >max)
				max = arr[i];
			if(arr[i]<min)
				min = arr[i];
		}
		if(max==min)
			return 1;
		for(int i =0;i<arr.length;i++){
			if(arr[i]==max){
				for(int j = i+1;j<n;j++){
					if(arr[j]==min && len>j-i+1){
						len = j-i+1;
						break;
					}
				}
			}
			if(arr[i] == min){
				for(int j = i+1;j<n;j++){
					if(arr[j]==max && len>j-i+1){
						len = j-i+1;
						break;
					}
				}
			}
		}
		return len;
	}
}
