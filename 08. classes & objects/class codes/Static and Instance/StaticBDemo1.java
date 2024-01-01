class StaticBDemo1{
	//Static block example
	int x=10;
	static int y=20;
	static{
		System.out.println("Inside Static Block 1");
	}
	public static void main(String args[]){
		StaticBDemo1 obj=new StaticBDemo1();
		System.out.println("In Main");
		System.out.println(obj.x);
	}
	static{
		System.out.println("Inside Static block 2");
		System.out.println(y);
	}

	/* Output=>
	 * Inside Static Block 1
	 * Inside static block 2
	 * 20
	 * In Main
	 * 10
	*/

	//here the static block will bw exectuted first as its stack comes in java stack even before main
	//static variables are initialized first then the static block is exxectuted and it gets popped 
	//and the main method comes in stack 
	//
	//static block is build like this because its purpose is to setup some prerequisites or run some 
	//codebefore main and other methods
}
