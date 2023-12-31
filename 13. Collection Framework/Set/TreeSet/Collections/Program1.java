import java.util.*;

class SortDemo{
	public static void main(String [] args){
		ArrayList<String> al = new ArrayList<String>();

		al.add("Maitri");
		al.add("Prashanjit");
		al.add("Ashu");
		al.add("Kabir");

		System.out.println(al);

		Collections.sort(al);

		System.out.println(al);
	}
}

