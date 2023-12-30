interface Demo{
	void gun();
	default void fun(){
		System.out.println("In Fun Demo");
       }
}

class DemoChild implements Demo{
	public void gun(){
		System.out.println("In gun-DemoChild");
	}
}

class Client{
	public static void main(String[] args){
		Demo obj=new DemoChild();
		obj.fun();
		obj.gun();
	}
}

