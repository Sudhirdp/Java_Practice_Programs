class inheritanceDemo{
	inheritanceDemo(){
		System.out.println("In parent class");
	}
}
class inheritanceDemo2 extends inheritanceDemo{
	inheritanceDemo2(){
		System.out.println("In child class");
	}

	public static void main(String[] args){
		inheritanceDemo2 obj=new inheritanceDemo2();
	}
}
class main{
	public static void main(String[] args){
		inheritanceDemo2 obj1=new inheritanceDemo2();
		//actual and formal argument lists differ in length
	}
}
