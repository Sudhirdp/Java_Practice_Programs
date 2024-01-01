class Demo{
	void fun(int x,float y){
		System.out.println("Int-float para");
	}
	void fun(float x,int y){
		System.out.println("float-int para");
	}
}
class Client{
	public static void main(String[] args){
		Demo obj=new Demo();
		obj.fun(10,10);	//err: ambigous call oc method
	}
}
