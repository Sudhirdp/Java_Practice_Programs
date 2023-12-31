// Lambda function and a normal method
// lambda function only works if there is only one abstract method in a interface 
// i.e if the interface is funtional interface 
// by using lambda function 1 inner class has been stop from being born which is a big process and space consuming

interface Core2Web {
	void lang();
}
class Demo1{
	public static void m1(){
		Core2Web c2w = new Core2Web(){
			public void lang(){
				System.out.println("method form interface has been override");
			}
		};
		c2w.lang();
	}
}
class Demo2{
	public static void m2(){
		Core2Web c2w = ()->{
			System.out.println("Method overide using lambda function");
		};
		c2w.lang();
	}
}
class Main{
	public static void main(String [] args){
		Demo1.m1();
		Demo2.m2();
	}
}


