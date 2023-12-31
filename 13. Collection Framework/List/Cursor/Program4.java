import java.util.*;

class CursorDemo{
	public static void main(String[] args){
		LinkedList ll = new LinkedList();

		ll.add("Prashik");
		ll.add("Prashanjeet");
		ll.add("Ashu");
		ll.add("Kabir");

		ListIterator litr = ll.listIterator();

		while(litr.hasNext()){
			System.out.println(litr.next());
		}
		while(litr.hasPrevious()){
			System.out.println(litr.previous());
		}
	}
}


