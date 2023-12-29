class Parent{
	Parent(){
		System.out.println("Parent Cons");
	}
	void fun(){
		System.out.println("in parent fun");
	}
}
class Child extends Parent{
	Child(){
		System.out.println("Child Const");
	}
	void fun(){
		System.out.println("In Child Fun");
	}
}
class Child{
	public static void main(String[] args){
		Parent obj =new Child();
		obj.fun();
	}
}
