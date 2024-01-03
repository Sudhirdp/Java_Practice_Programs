// this is faster than root(n) complexity this is log(n) complexity 
import java.util.*;

class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(root(num));
	}
	static int root(int num){
		int start = 1;
		int end = num;
		int mid = 0;
		int itr = 0;
		while(start<=end){
			itr++;
			mid=(start+end)/2;
			if(mid*mid == num){
				return mid;
			}
			else if(mid*mid<end)
				end = mid-1;
			else
				start = mid+1;
		}
		System.out.println(itr);
		return mid;
	}
}

