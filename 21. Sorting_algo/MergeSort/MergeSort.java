import java.util.*;

class MergeSort{
	public static void mergesorted(int arr[],int start,int mid,int end){
		
		int n1 = mid-start+1;
		int n2 = end - mid;
		
		int[] arr1 = new int[n1];
		int[] arr2 = new int[n2];

		for(int i = 0;i<n1;i++){
			arr1[i] = arr[start+i];
		}
		for(int i = 0;i<n2;i++){
			arr2[i] = arr[mid+1+i];
		}

		int i = 0,j= 0,k=start;

		while(i<n1 && j<n2){
			if(arr1[i]<arr2[j])
				arr[k++]=arr1[i++];
			else
				arr[k++]=arr2[j++];
		}
		while(i<n1)
			arr[k++] = arr1[i++];
		while(j<n2)
			arr[k++] = arr2[j++];

	}
	public static void mergeAlgo(int arr[],int start,int end){
		if(start<end){

			int mid = start+(end-start)/2;
			
			mergeAlgo(arr,start,mid);
			mergeAlgo(arr,mid+1,end);

			mergesorted(arr,start,mid,end);
		}
	}
	public static void main(String [] arg){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		
		mergeAlgo(arr,0,n-1);
		
		for(int i:arr)
			System.out.print(i+"\t");
		System.out.println();
	}
}
