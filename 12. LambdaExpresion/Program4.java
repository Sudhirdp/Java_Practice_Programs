//Lambda Function with Comparator 
//Compaarator has many method but only 1 method is abstrat which is compare
//and if your think of equals method then we will get its body from Object class so the only abstract method here is Compare();
//

import java.util.*;

class Employee{
	String name ;
	int id ;
	Employee(int id,String name){
		this.name = name;
		this.id = id ;
	}
	public String toString(){
		return "{" + name+ " : " + id + "}";
	}
}

class ComparatorDemo{
	public static void main(String [] args){
		ArrayList al = new ArrayList();
		al.add(new Employee(15,"Rahul"));
		al.add(new Employee(19,"Kanha"));
		al.add(new Employee(22,"Ashish"));

		Collections.sort(al,(Object obj1,Object obj2)->{
			return ((Employee)obj1).name.compareTo(((Employee)obj2).name);
		}
		);

		System.out.println(al);
	}
}


