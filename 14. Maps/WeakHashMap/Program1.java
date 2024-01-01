import java.util.*;

class Demo{
	String str = null;
	Demo(String sts){
		this.str = str;
	}
	public String toString(){
		return str;
	}
	public void finalize(){
		System.out.println("Notify");
	}
}
class GcDemo{
	public static void main(String []args){
		Demo obj1 = new Demo("Prashik");
		System.out.println(obj1);

		obj1 = null;

		System.gc();

		System.out.println("In  main");

	}
}



