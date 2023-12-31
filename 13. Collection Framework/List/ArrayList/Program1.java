import java.util.*;

class ArrayListDemo extends ArrayList{
        public static void main(String []args){
                ArrayListDemo al = new ArrayListDemo();

                al.add(20);
                al.add("Prashik");
                al.add(107.5f);
                al.add(107.5);
                al.add(10);

                System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.contains("Prashik"));
		System.out.println(al.indexOf(107.5));
		System.out.println(al.lastIndexOf(107.5));
		System.out.println(al.get(1));
		al.add(2,"Wankhade");
		System.out.println(al);

		ArrayList al2 = new ArrayList();

		al2.add(111);
		al2.add(122);
		al2.add(123);

		System.out.println(al.addAll(al2));
		System.out.println(al);

		System.out.println(al.addAll(3,al2));
		System.out.println(al);

		System.out.println(al.remove(7));
		System.out.println(al);

		al.removeRange(4,6);
		System.out.println(al);

		al.clear();
		System.out.println(al);

        }
}
