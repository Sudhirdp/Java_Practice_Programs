//Variable in Java

interface Demo{
	int x=10;
	void fun();
}

class ChildDemo implements Demo{
	public void fun(){
		System.out.println(x);
		System.out.println(Demo.x);
	}

}
class Client{
	public static void main(String[] args){
		Demo obj=new ChildDemo();
		obj.fun();
	}
}


