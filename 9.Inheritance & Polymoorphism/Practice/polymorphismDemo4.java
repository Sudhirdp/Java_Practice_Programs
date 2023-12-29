//overriding
class Parent{
	Parent(){
		System.out.println("Parent constructor");
	}
	void property(){
		System.out.println("Home ,Car ,Gold");
	}
	void marry(){
		System.out.println("family decided girl");
	}
}
class Child extends Parent{
	Child(){
		System.out.println("Child Constructor");
	}
	void marry(){
		System.out.println("GF");
	}
}
class Client{
	public static void main(String[] args){
		Child obj=new Child();
		obj.property();
		obj.marry();
	}
}
