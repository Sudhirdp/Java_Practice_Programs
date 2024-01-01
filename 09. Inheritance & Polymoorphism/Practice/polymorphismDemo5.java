class Parent{
	Parent(){
		System.out.println("Parent Constructor");
	}
	void fun(){
		System.out.println("In fun");
	}
}
class Child extends Parent{
	child(){
		System.out.println("Child Constructor");
	}
	void fun(){
		System.out.println("In gun");
	}
}
class Client{
	public static void main(String[] args){
		Child obj1=new Child();
		obj1.fun();
		obj1.gun();

		Parent obj2=new Parent();
		obj2.fun();
		obj2.gun();	//error can not find symbol

		Parent obj3=new Child();	//Applicable
		Child obj4=new Child();		//Not Applicable
	}
}
