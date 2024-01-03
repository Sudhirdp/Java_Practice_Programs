//Take input from user int num and add all numbers from 1 to num
import java.util.*;

class Demo{
	public static void main(String [] ars){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(sum1(num));
		System.out.println(sum2(num));
	}
	static int sum1(int num){
		int sum = 0;
		int itr = 0;
		for(int i = 1;i<=num;i++){
			sum+=i;
			itr++;
		}
		System.out.println("No of iterations brute force" + itr );
		return sum;
	}
	static int sum2(int num){
		int sum = 0;
		int itr = 0;
		sum = (num*(num+1))/2;
		System.out.println("No of iteration in my approach littel optimised "+itr);
		System.out.println("fastest as the output is given by zero iteration ie constant ");
		return sum;
	}
}
