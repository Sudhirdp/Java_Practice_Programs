class Demo1{
	int x=10;
	static int y=20;
	private String str="Sudhir";
	public static String str2="lol";

	static void fun(){
		System.out.println(y);
		//System.out.println(str);	//nonstatic var x cant be referenced from a static context
		//wee can not access static var and methods in java
	}
	void fun2(){
		System.out.println(x);
		System.out.println(y);
	}
}

class Demo2{
	public static void main(String args[]){
		Demo1 obj=new Demo1();

		obj.fun();
		System.out.println(obj.x);
		System.out.println(obj.y);
		//System.out.println(obj.str);	//can not access private outside class
		
		obj.fun2();
		System.out.println(obj.x);
		System.out.println(obj.y);

		//Demo1.str;	//private Static var and methods are accesible for that class only 
		Demo1.fun();	//we can access static methods and variables using class names and objects	
		//Demo1.fun2();	//Static var x cant referenced by 
		
		//if we make changes in static var then those changes will aply to all objects but if we make changes in instance variables they remian same for other objects
		//each object has its own set of copy of instance variables and each object can make changes for its own .

		Demo1 obj2=new Demo1();

		obj.x=20;
		obj.y=30;
		
		System.out.println("After changes");

		obj.fun();	//30
		obj2.fun();	//30
		Demo1.fun();	//30

		obj.fun2();	//20 30
		obj2.fun2();	//10 20
		
		System.out.println(Demo1.str2);	//lol
		System.out.println(obj.str2);	//lol

		obj2.str2="hahaha";
		Demo1.str2="hehehe";
		//both the changes can be done 

		System.out.println(Demo1.str2);	//hehehe
	}
}
