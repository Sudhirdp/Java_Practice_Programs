class AccessMod1{
	static int x=10;
	public int y=20;
	private int z=30;

	void fun1(){
		System.out.println(x +" "+ y +" "+ z);
	}

	static void fun2(){
		System.out.println(x);	//non-static variablees can not be refrenced here
	}

	public static void main(String args[]){
		
		AccessMod1 am=new AccessMod1();
		am.fun1();
		am.fun2();
		System.out.println(am.x);
		System.out.println(am.y);
		System.out.println(am.z);
	}
}

class AccessMod2{
	public static void main(String args[]){

		AccessMod1 am1=new AccessMod1();	//we can make two object with same name but in different class
		//AccessMod1 am1=new AccessMod1();	//you cant make object of same name in same class
		am1.fun1();	//10 20 30
		am1.fun2();	//10

		System.out.println(am1.x);	//10
		System.out.println(am1.y);	//20
		//System.out.println(am1.z);	//z is private
	}
}
