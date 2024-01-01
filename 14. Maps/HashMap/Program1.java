import java.util.*;

class HashMapDemo{
	public static void main(String [] args){
		HashSet hs = new HashSet();

		hs.add("Kanha");
		hs.add("Ashish");
		hs.add("Badhe");
		hs.add("Rahul");

		System.out.println(hs);

		HashMap hm = new HashMap();
		hm.put("Kanha","Barclays");
                hm.put("Ashish","Infosys");
                hm.put("Badhe","Tcs");
                hm.put("Rahul","Amazon");

		System.out.println(hm);
	}
}
