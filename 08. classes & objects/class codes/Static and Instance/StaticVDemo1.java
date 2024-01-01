class StaticVDemo1{
	//static variable demo

	static int x=10;
	
	static{
		int y=20;
		//static int z=20;	//error illegal start  of expression
	}

	void fun(){
		//static int a=30;	//error: illegal start of expression
	}

	static void gun(){
		//static int b=40;	//error: illegal start of expression
	}

	StaticVDemo1(){
		//static int c=50;	//erroe: illegal start of expression
		//System.out.println(c);	//identifier expected
	}
	public static void main(String[] args){
		//static int d=60;	//illegal start
		StaticVDemo1 svd=new StaticVDemo1();	
		svd.fun();
		svd.gun();
	}
}
//**java support global static variable. That means static variables can not be 
//declared anywhere other than in class. static variable must be a direct child of class.

// error: class , interface or enum expected is a common error if you have error in such case and 
// you are still trying to call that method (constructor as causes this error).
