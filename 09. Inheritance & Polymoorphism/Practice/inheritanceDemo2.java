class Parent{
	int x=10;
	Parent(){
		System.out.println("In parent constructor");
	}
	void access(){
		System.out.println("Parent Instance");
	}
}
class Child extend Parent{
	int y=20;
	Child(){
		System.out.println("In Child constructor");
		System.out.println(x);
		System.out.println(y);
	}
}
class Client{
	public static void main(String[] args){
		Child obj=new Child();
		obj.access();
	}
}
