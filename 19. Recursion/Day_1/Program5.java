// Double Recursion
//

class Demo{
	static int flag = 0;
	int fun(int n){
		flag++;
		if(n<=1)
			return 1;
		return fun(n-2)+fun(n-1);
	}

	public static void main(String [] args){
		flag++;
		System.out.println(new Demo().fun(5));
		System.out.println("Number of stackframe pushed : "+flag);
	}
}
