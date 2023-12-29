//Method hidding concept
class parent{
	static void fun(){
		System.out.println("Parent fun");
	}
}
class Child extends Parent{
	static void fun(){
		System.out.println("Child fun");
	}
}
class Client{
	public static void main(String[] args){
		Parent obj=new Parent();
		obj.fun();

		Child obj2=new Child();
		obj2.fun();

		Paremt obj3=new Child();
		obj3.fun();
	}
}
