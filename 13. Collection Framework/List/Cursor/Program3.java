import java.util.*;

class CursorDemo{
	public static void main(String [] args){
		ArrayList al = new ArrayList();

		al.add("Prashik");
		al.add("Prashanjeet");
		al.add("Ashu");
		al.add("kabir");

		Iterator cursor = al.iterator();

		while(cursor.hasNext()){
			if("Ashu".equals(cursor.next()))
				cursor.remove();
		}
		System.out.println(al);
	}
}



