import java.util.*;

class Demo{
	static int [] mergesorted(int arr1[],int n1,int[] arr2,int n2){
		int arr[] = new int[n1+n2];
		int i = 0,j=0,k=0;
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

		return arr;
	}
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int arr1[] = new int[n1];
	
		for(int i = 0;i<n1;i++){
			arr1[i] = sc.nextInt();
		}

		int n2 = sc.nextInt();
                int arr2[] = new int[n2];

		for(int i = 0;i<n2;i++){
			arr2[i] = sc.nextInt();
		}

		int arr[] = mergesorted(arr1,n1,arr2,n2);
		
		for(int i:arr)
			System.out.println(i);
	}
}
