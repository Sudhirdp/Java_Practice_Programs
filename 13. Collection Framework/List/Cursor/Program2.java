import java.util.*;

class CursorDemo{
	public static void main(String [] args){
		ArrayList al = new ArrayList();

		al.add(10);
		al.add(20.5f);
		al.add(30.5);
		al.add("Prashik");

		for(var data :al){
			System.out.println(data);
			System.out.println(data.getClass().getName());

		}

	}
}

