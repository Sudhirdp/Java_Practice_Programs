class Demo{
	void fun(Object obj){
		System.out.println("Object");
	}
	void fun(String str){
		System.out.println("String");
	}
}
class Client{
	public static void main(String[] args){
		Demo obj=new Demo();
		obj.fun("Core2Web");	//String
		obj.fun(new StringBuffer("Core2Web"));	//object
		obj.fun(null);	//String
		//no error in such cases child has a higher priority of getting methods
	}
}
