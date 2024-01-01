abstract class BCCI{
	void rule(){
		System.out.println("Same for All");
	}

	abstract void matchFormat();
}

class Ipl extends BCCI{
	void matchFormat(){
		System.out.println("Only T20");
	}
}

class Client{
	public static void main(String[] args){
	  Ipl ipl2023=new Ipl();
	  ipl2023.rule();
	  ipl2023.matchFormat();
	}
}

