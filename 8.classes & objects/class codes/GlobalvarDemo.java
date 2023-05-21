class GlobalvarDemo{
	int x=10;
	static int y=20;

	static void fun(){
		int l=30;
		int m=40;
	}


	public static void main(String[] args){
		int a=50;
		int b=60;
		//See the byte code, static int y goes in static block ,int x is global so it gets positiion in constructor 
		// but until the object is formed the constructor has no position that means indirectly global variable x has no memory
		
		
	}
}
