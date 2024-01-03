// 0% optimized code if the input is 10^18 then this code will take 317 years to complete 
// if the input it 100 then for loop will move 100 times 
// and all the platform assumes that for 1 iteration (ie for moving once in for loop) the time taken is 1/(10^8) sec
// so if the input is 10^18 || (10^18)/(10^8) == 10^10 || 10^10 == 317 years  || 115740 days || 2777777.777778 hours || 
// 1 day == 86400 sec


import java.util.*;

class Demo{
	public static void main(String [] agr){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(fact(num));
	}
	public static int fact(int num){
		int count = 0;
		for(int i = 1;i<=num;i++){
			if(num%i==0){
				count++;
			}
		}
		return count;	
	}
}
