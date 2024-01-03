//it this code the loop will move root(n) times (ie if the input is 100 then 10 tiems) 
//so here we have reduced iteration form 100 to 10 so this is 90% faster code ass compared to code before
//this is O(root(n)) complexity

import java.util.*;

class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(root(num));
	}
	static int root(int num){
		int ret = 0;
		int i = 1;
		int itr = 0;
		while(i*i<=num){
			itr++;
			if(i*i==num){
				ret = i;
			}
			i++;
		}
		System.out.println(itr);
		return ret;
	}
}

