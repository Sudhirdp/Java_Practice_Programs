//sum of n numbers 
//
import java.util.*;

class Demo{
	int sumOfN(int n){
		if(n == 0)
			return 0;
		return n+ sumOfN(--n);
	}
	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(new Demo().sumOfN(n));
	}
}
