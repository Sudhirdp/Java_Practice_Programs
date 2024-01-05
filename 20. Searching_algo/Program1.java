// check the number given by user in present in array or not if present return the index 
// else print its not present in the array 
//
//
import java.util.*;

class Demo{

	int check(int arr[],int x){
		for(int i = 0;i<arr.length;i++){
			if(x== arr[i])
				return i;
		}
		return -1;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		int ret = new Demo().check(arr,x);
		if(ret==-1)
			System.out.println("Does not exist");
		else
			System.out.println(ret);

	}
}
