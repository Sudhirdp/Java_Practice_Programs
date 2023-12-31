import java.util.*;


class CricPlayer{
	int jerNo = 0;
	String name = null;

	CricPlayer(int jerNo, String name){
		this.jerNo = jerNo;
		this.name = name;
	}
	public void toString(int name,String pName){

	}
}
class HashSetDemo{
	public static void main(String [] args){

		LinkedHashSet hs = new LinkedHashSet();

	     	hs.add(new CricPlayer(7,"Dhoni"));
		hs.add(new CricPlayer(18,"Virat"));
		hs.add(new CricPlayer(45,"Rohit"));

		System.out.println(hs);
	}
}

