class Parent{
	Object fun(){
		Object obj=new Object();
		system.out.println("In parent object");
		return obj;
	}
}
class Child extends Parent{
	String fun(){
		String str=new String("lol");
		System.out.println("In Child");
		return Str;
	}
}
class Client{
	public static void main(String[] args){
		Parent p=new Parent();
		p.fun();
	}
}
