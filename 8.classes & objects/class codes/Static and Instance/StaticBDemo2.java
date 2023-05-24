class Demo{
	static{
		System.out.println("Static block 1");
	}
	public static void main(String [] args){
		System.out.println("In Demo Main");
	}
}

class Client{
	
	static{
		System.out.println("Static block 2");
	}
	
	public static void main(String[] args){
		System.out.println("In Client Main");
		Demo obj =new Demo();
		// here the object of Demo class is created so static block of Demo class will be executed.
	}
	
	static{
		System.out.println("Static block 3");
	}
}
// output of java Demo=>
// Static block1
// In Demo Main
//
// Output of java Client=>
// Static block 2
// Static block 3
// In client Main
// Static block 1
