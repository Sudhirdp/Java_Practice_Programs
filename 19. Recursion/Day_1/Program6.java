class Demo{
	void fun(int n){
		if(n<=1)
			return;
		fun(n-2);
		System.out.println(n);
		fun(n-1);
	}
	public static void main(String [] arg){
		new Demo().fun(5);
	}
}
