interface A{
	int x=10;
}
interface B{
	int x=20;
}

class Child implements A,B{
	void fun(){
		System.out.println(x);
		System.out.println(A.x);
		System.out.println(B.x);
	}
}

class Client{
	public static void misn(String[] args){
		Child obj=new Child();
		obj.fun();
	}

}
