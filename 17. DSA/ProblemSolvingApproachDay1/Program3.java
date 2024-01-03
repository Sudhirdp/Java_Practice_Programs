//90% optimized code 
//in this code if the input is 10^18 code will move sqrt of 10^18 times so it will be 10^9 
// hence time to complete code is 10^9/10^8 == 10 sec 
// so this is most optimized code as the same code would have taken 317 years to complete where as this is taking 10 sec
// so the device does not matter for ur code to run fast you need to develop your coding skill to make your code run fast 
import java.util.*;

class Demo{
	public static void main(String []a ){
		Scanner sc = new Scanner(System.in);
		long num = sc.nextInt();
		System.out.println(fact(num));
	}
	public static int fact(long num){
		int count = 0;
		for(int i = 1; i*i<num;i++){
			if(num%i==0){
				if(i==num/i){
					count++;
				}
				else 
					count+=2;
			}
		}
		return count;
	}
}

