import java.util.*;
class Demo{

	int partation(int arr[],int start,int end){
		int pivot = arr[end];
		int j = start-1;

		for(int i = start;i<end;i++){
			if(arr[i]<=pivot){
				j++;
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				}
		}
		j++;
		int temp = arr[end];
		arr[end] = arr[j];
		arr[j] = temp;
		return j;
	}
	void quickSort(int arr[],int start,int end){
		if(start<end){
			int pivot = partation(arr,start,end);

			quickSort(arr,start,pivot-1);
			quickSort(arr,pivot+1,end);
		}
	}
	public static void main(String [] a){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];
		for(int i = 0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		new Demo().quickSort(arr,0,n-1);
		System.out.println(Arrays.toString(arr));
	}
}
