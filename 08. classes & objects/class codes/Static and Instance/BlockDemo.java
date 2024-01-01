class BlockDemo{
	int x=10;

	BlockDemo(){
		System.out.println("In Constructor");
	}

	static{
		System.out.println("Static Block 1");
	}

	{
		System.out.println("Instance Block 1");
	}

	public static void main(String[] args){
		System.out.println("In Main (Before creating object)");
		BlockDemo bd =new BlockDemo();

		System.out.println("In main (After creating object)");
	}

	static{
		System.out.println("Static block 2");
	}

	{
		System.out.println("Instance block 2");
	}
}

/*output=>	java BlockDemo
		Static Block 1
		Static block 2
		In Main (Before creating object)
		Instance Block 1
		Instance block 2
		In Constructor
		In main (After creating object)	*/

//here the sequence of code execution is: 
//static variables > static block > static method > instance variables > instance block > constructor > instance methods

