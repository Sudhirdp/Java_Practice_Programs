// Iterator 
//
import java.util.*;

class IteratorDemo{
	public static void main(String [] args){
		ArrayList al = new ArrayList();

		al.add("Prashik");
		al.add("Haridasji");
		al.add("Wankhade");

		Iterator obj = al.iterator();

		while(obj.hasNext()){
			if("Wankhade".equals(obj.next()))
				obj.remove();
		}
		System.out.println(al);
	}
}

