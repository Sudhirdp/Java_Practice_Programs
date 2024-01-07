import java.util.*;

class Demo{
	int[] insertionsort(int arr[],int n){
		if(n == arr.length-1)
			return arr;
		int ele = arr[n];
		int i = n-1;
		while(i>=0 && arr[i]>ele){
			arr[i+1]=arr[i];
			i--;
		}
		arr[i+1] = ele;
		return insertionsort(arr,++n);
	}
	public static void main(String [] args){
		Scanner sc =  new Scanner(System.in);
                int n = sc.nextInt();
                int [] arr = new int[n];

                for(int i = 0;i<arr.length;i++){
                        arr[i] = sc.nextInt();
                }
		int a = 1;
                
		arr = new Demo().insertionsort(arr,1);
                
		for(int i : arr)
                        System.out.println(i);
	}
}
