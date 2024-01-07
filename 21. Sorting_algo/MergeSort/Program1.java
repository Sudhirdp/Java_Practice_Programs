import java.util.*;

class Demo{
	static void merge(int [] arr,int start,int end){
		if(start<end){
			int mid = start+(end-start)/2;

			System.out.println("Start : " + start+" Mid : "+ mid+ " End : "+end);

			merge(arr,start,mid);
			merge(arr,mid+1,end);
		}
	}
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];
		for(int i = 0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		merge(arr,0,arr.length-1);
	}
}
