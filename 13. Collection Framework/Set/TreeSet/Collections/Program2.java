import java.util.*;


class Employee{
	String name = null;
	int sal = 0; 
	Employee(String name , int sal){
		this.name = name;
		this.sal = sal;
	}
	public String toString(){
		return "{" + name + "," + sal + "}";
	}
}
class SortByName implements Comparator<Employee>{
	public int compare(Employee obj1, Employee obj2){
		return obj1.name.compareTo(obj2.name);
	}
}
/*class SortBySal implements Comparator<Employee>{
	public int compare(Employee obj1, Employee obj2){
		return obj1.sal.compareTo(obj2.sal);
	}
}*/

class SortDemo{
	public static void main(String[] args){
		ArrayList al = new ArrayList();

		al.add(new Employee("Raju",98000));
		al.add(new Employee("Jay",68000));
		al.add(new Employee("Karan", 150000));
		al.add(new Employee("Savan", 34000));
		
		System.out.println(al);
		Collections.sort(al, new SortByName());

		System.out.println(al);

//		Collections.sort(al,new SortBySal());
		System.out.println(al);

	}
}

