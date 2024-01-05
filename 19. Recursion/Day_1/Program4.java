// Sum of the digits of the number 
//

import java.util.*;

class Demo{
	int sumOfDigit(int num){
		if(num<=0)
			return 0;

		return num%10 + sumOfDigit(num/10);
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println(new Demo().sumOfDigit(n));
	}
}
