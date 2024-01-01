//Hashtable is a child of Dictionary class as well as Map interface
//Dictionary is directly child of Object
//it uses hashid and a bucket to sort the data size of bucket is 11
import java.util.*;

class HashtableDemo{
	public static void main(String [] args){
		Hashtable ht = new Hashtable();

		ht.put(10,"Sachin");
		ht.put(7,"MSD");
		ht.put(18,"Virat");
		ht.put(45,"Rohit");
		ht.put(1,"KLRahul");
		
		System.out.println(ht);
	}
}

