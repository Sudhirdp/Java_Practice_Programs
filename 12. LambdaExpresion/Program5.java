//forEach Iterator 

import java.util.*;

class ForEachDemo{
	public static void main(String [] args){
		ArrayList al = new ArrayList();
		al.add(30);
		al.add(10);
		al.add(40);
		al.add(20);

		System.out.println(al);

		al.forEach((data)->System.out.println(data));

	}
}

