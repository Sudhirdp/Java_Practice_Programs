import java.util.*;

class IteratorDemo{
	public static void main(String[] args){
		SortedMap tm = new TreeMap();

		tm.put("Ind","India");
		tm.put("Pak","Pakisthan");
		tm.put("SL","SriLanka");
		tm.put("Aus","Australia");
		tm.put("Ban","Bangldesh");

		System.out.println(tm);

		Set<Map.Entry> data = tm.entrySet();
		Iterator<Map.Entry> itr = data.iterator();

		while(itr.hasNext()){
			Map.Entry abc = itr.next();
			System.out.println(abc.getKey() + ":" + abc.getValue());
		}
	}
}

