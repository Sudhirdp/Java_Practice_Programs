import java.util.*;

class Platform implements Comparable{
	String str = null;
	int year = 0;

	Platform(String str,int year){
		this.str= str;
		this.year = year;
	}
	public String toString(){
		return "{" + str + ":" + year + "}";
	}
	public int compareTo(Object obj){
		return this.year - (((Platform)obj).year);
	}
}

class TreeMapDemo{
	public static void main(String[] args){

		SortedMap tm = new TreeMap();

		tm.put(new Platform("Youtube",2005),"Google");
		tm.put(new Platform("Instagram",2010),"Meta");
		tm.put(new Platform("FaceBook",2003),"Meta");
		tm.put(new Platform("ChatGpt",2023),"OpenAI");

		System.out.println(tm);
	}
}


