import java.util.*;

class IdentityHashMapDemo{
	public static void main(String []args){

		IdentityHashMap hm = new IdentityHashMap();

		hm.put(new Integer(10),"Barclays");
                hm.put(new Integer(10),"Infosys");
                hm.put(new Integer(10),"Tcs");
                hm.put(new Integer(10),"Amazon");

		System.out.println(hm);
	}
}

