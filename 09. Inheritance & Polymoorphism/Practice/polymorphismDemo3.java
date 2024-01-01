class Demo{
	void fun(int x){
		System.out.println(x);
	}
	void fun(float y){
		System.out.println(y);
	}
	void fun(Demo obj){
		System.out.println("In Demo Para");
		System.out.println(obj);
	}
	public static void main(string[] args){
		Demo obj=new Demo();
		obj.fun(10);
		obj.fun(10.5);

		Demo obj1=new Demo();
		obj1.fun(obj);
	}
	//all fun methods have different method signatures so all fun are valid
}
