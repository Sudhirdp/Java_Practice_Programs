//take input from user a and b and find the diff between them inclusively
import java.util.*;

class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(diff1(a,b));
		System.out.println(diff2(a,b));
	}
	static int diff1(int a ,int b){
		int count = 0;
		int itr = 0;
		for(int i = a;i<=b;i++){
			count++;
			itr++;
		}
		System.out.println("itr : "+itr);
		return count;
	}
	static int diff2(int a,int b){
		System.out.println("Zero iteration ");
		return b-a+1;
	}
}	
