class Demo3{
	Demo3(int x){
		System.out.println("In constr1");
	}
}
class Demo4{
	public static void main(String[] args){
		//Demo3 obj=new Demo3(); 	//gives error because we created different constructor and here default constructor won't be form
		System.out.println("In Main");
	}
}
