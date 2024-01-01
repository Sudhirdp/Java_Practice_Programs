class StaticBDemo3{
	static{
		System.out.println("Hello!! World");
		System.exit(0);
	}
	public static void main(String[] args){
		System.out.println("In main");
	}
}
//output=> Hello!! World
//here only the static block is executed which proves that static block is executed before main
//but jvm will first check if there is main method or not (having main method is mandator after java 1.6)
//static block executes and exit without going to main methods
