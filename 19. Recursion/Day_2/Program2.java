// Fibonacci series 
//

import java.util.*;

class Demo{
	static int itr = 0;
	int fibo(int n){
		itr++;
		if(n <=1){
			return n;
		}
		return fibo(n-1)+fibo(n-2);
	}

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(new Demo().fibo(n));
		System.out.println(itr);
	}
}
