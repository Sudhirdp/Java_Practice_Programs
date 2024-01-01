import java.util.*;

class Platform{
	String name = null;
	int year = 0;

	Platform(String name,int year){
		this.name = name;
		this.year = year;
	}
	public String toString(){
		return "{"+name +":" + year +"}";
	}
	
}

class SortByName implements Comparator{							//When we have to sort the map by many variables in a user defined class we will use Comparator interface and 
	public int compare(Object obj1,Object obj2){					// compare methd form comparator interface
		return ((Platform)obj1).name.compareTo(((Platform)obj2).name);		// here we have created sort by name which will sort thr treemap by name ,Simmillarly
	}
}
class SortByYear implements Comparator{							// this class is created so that we can also also sort the tree map having key of user defined class
	public int compare(Object obj1, Object obj2){					// here we have sorted by year
		return ((Platform)obj1).year - (((Platform)obj2).year);
	}
}

class TreeMapDemo{
	public static void main(String [] args){
		TreeMap tm = new TreeMap(new SortByName());				// TreeMap has the constructor as TreeMap(Object obj) we can use that to sort our treemap by the class 
	
		tm.put(new Platform("Instagram",2010),"Meta");
		tm.put(new Platform("Youtube",2005),"Google");
		tm.put(new Platform("Facebook",2003),"Meta");
		tm.put(new Platform("Incubator",2023),"Biencaps");

		System.out.println(tm);							// we cannot use Collections class because that only works on collection interface 

		TreeMap tm1 = new TreeMap(new SortByYear());				// So we have to use that cunstructor to sort and give the object of the class by which we want to sort

		tm1.put(new Platform("Instagram",2010),"Meta");
                tm1.put(new Platform("Youtube",2005),"Google");
                tm1.put(new Platform("Facebook",2003),"Meta");
                tm1.put(new Platform("Incubator",2023),"Biencaps");

		System.out.println(tm1);

	}
}


