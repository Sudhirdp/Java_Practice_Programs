class Parent{
	Parent(){
		System.out.prinln("Parent cons");
	}
	void fun(){
		System.out.println("In parent fun");
	}
}
class Child extends Parent{
	Child(){
		System.out.println("Child const");
	}
	void fun(int x){
		System.out.println("In Child Fun");
	}
}
class Client{
	public static void main(String[] args){
		Parent obj=new Child();
		obj.fun();
	}
}
