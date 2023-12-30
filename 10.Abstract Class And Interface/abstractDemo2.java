abstract class Parent{
	void career(){
		System.out.println("Deoctor");
	}

	abstract void marry();
}
class Child extends Parent{
	void marry(){
		System.out.println("aaa");
	}
}
class Client{
	public static void main(String[] args){
	Parent obj=new Child();
        obj.career();
	obj.marry();

	}
}
