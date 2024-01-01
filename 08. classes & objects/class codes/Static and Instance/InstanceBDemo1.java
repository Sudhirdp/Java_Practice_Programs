class InstanceBDemo1{
	//Instance Block Demo
	int x=10;

	InstanceBDemo1(){
		System.out.println("Constructor");
	}

	{	//instance block
		System.out.println("Instance block 1");
	}

	public static void main(String[] args){
		
		InstanceBDemo1 IBD=new InstanceBDemo1();
		//after object is created constructor(special instance method) is called here automatically
		System.out.println("Main");
	}
	{
		System.out.println("Instance block 2");
	}
}
//output=> Instance block 1
//	   Instance block 2
//	   Constructor
//	   Main
//
//as soon as the main is ready to start execution instance block will be executed first
//ans after that main methods has object so constructor will be called and executed and
//then the remaining code will be executed

