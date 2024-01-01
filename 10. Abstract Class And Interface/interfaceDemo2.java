interface Demo{
	void fun();
	void gun();
}
abstract class DemoChild implements Demo{
	public void gun(){
		System.out.println("In Gun ");
	}
}

class DemoChild1 extends DemoChild{
	
		public void fun(){
			System.out.println("In fun");
		}
}

class Client{
	public static void main(String[] args){
		Demo obj=new DemoChild1();
		obj.fun();
		obj.gun();
	}
}

