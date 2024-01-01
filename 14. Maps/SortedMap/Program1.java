//Sorted Map
//
import java.util.*;

class TreeMapDemo{
	public static void main(String [] args){
		SortedMap tm = new TreeMap();		//treemap adds all the data in sorted manner by the alphabetical order

		tm.put("Ind","India");
		tm.put("Pak","Pakisthan");
		tm.put("SL","SriLanka");
		tm.put("Aus","Australia");
		tm.put("Ban","Bangldesh");

		System.out.println(tm);
	}
}

