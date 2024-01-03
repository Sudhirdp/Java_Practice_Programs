//50% optimized code 
//In this code you can see our for loop will move only half the time of num given by user but it will not affect out output as output will be same 
//if the input given by user is 10^18 || then the loop will move for 5*10^17 || means only half the time
//

import java.util.*;
class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();

		System.out.println(fact(num));

	}
	public static int fact(int num){
		int count = 0;
		for(int i = 1;i<=num/2 ;i++){
			if(num%i==0){
				count++;
			}
		}
		return count+1;
	}
}

