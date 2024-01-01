class Match{
	void matchType(){
		System.out.println("T20/Oneday/Test");
	}
}
class IPL extends Match{
	void matchType(){
		System.out.println("T20");
	}
}
class TestMatch extends Match{
	void matchType(){
		System.out.println("Test");
	}
}
class Client{
	public static void main(String[] args){
		Match obj=new IPL();
		obj.matchType();

		Match obj2=new TestMatch();
		obj2.matchType();
	}
}
