// print 1 10 n numbers using recursion
//
import java.util.*;
class Demo{

	// here we have given recursive call to the function 
	// and this is non tail recusrion because the 
	// function call is not the last thing in method 
	// so it is non tail recursion
	
	void recursion(int n){
		if(n==0)
			return;
		recursion(n-1);
		System.out.println(n);
	}
	public static void main(String [] arg){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		(new Demo()).recursion(n);
	}
}
