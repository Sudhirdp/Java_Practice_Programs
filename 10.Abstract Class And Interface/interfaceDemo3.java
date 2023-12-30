interface Demo1{
        static void m1(){
		System.out.println("In Demo1-m1");
	}
}

interface  Demo2{ 
	static  void m1(){
		System.out.println("In Demo2-m2");
	}
}
interface Demo3 extends Demo1,Demo2{

}

class DemoChild implements Demo3{
    /* public void fun(){
         	System.out.println("In DemoChild ");
      	}*/
}
class Client{
	public static void main(String[] args){
	 Demo1 obj=new DemoChild();
		Demo1.m1();
	}
}


