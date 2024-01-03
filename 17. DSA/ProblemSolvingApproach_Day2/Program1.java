//Find the square root of the number 
//In java there is sqrt function in Math class in lang package which is used to find the square root of any number 
// this wil work only for perfect square number
//this code will run n times so it is O(n) complexity

import java.util.*;
class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(root(num));
	}
	public static int root(int num){
		int x = 0;
		int itr = 0;
		for(int i = 1;i<=num;i++){
			itr++;
			if(i*i == num)
				x=i;
		}
		System.out.println(itr);
		return x;
	}
}

