import java.util.*;

class HashMapDemo{
	public static void main(String [] args){

		HashMap hm = new HashMap();

		hm.put("Kanha","Barclays");
                hm.put("Ashish","Infosys");
                hm.put("Badhe","Tcs");
                hm.put("Rahul","Amazon");

		System.out.println(hm);

		//get
		System.out.println(hm.get("Ashish"));

		//keyset
		System.out.println(hm.keySet());

		//values
		System.out.println(hm.values());

		//entrySet
		System.out.println(hm.entrySet());

	}
}
