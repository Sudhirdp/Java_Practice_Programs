
import java.util.*;

class SortedMapDemo{
	public static void main(String [] args){
		SortedMap tm = new TreeMap();

		tm.put("Ind","India");
		tm.put("Pak","Pakisthan");
		tm.put("SL","SriLanka");
		tm.put("Aus","Australia");
		tm.put("Ban","Bangldesh");

		System.out.println(tm);
		
		System.out.println(tm.subMap("Aus","Pak"));	// It will not include Pak

		System.out.println(tm.headMap("Ind"));		//It will print all before Ind and will not include Ind

		System.out.println(tm.tailMap("Ind"));		// It will print all after Ind including Ind

		System.out.println(tm.firstKey());		//it will print the first key

		System.out.println(tm.lastKey());	 	// it will print last key

		System.out.println(tm.keySet());

		System.out.println(tm.values());

	}
}

