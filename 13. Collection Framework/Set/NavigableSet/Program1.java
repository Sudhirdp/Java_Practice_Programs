import java.util.*;

class NavigableSetDemo{
	public static void main(String []args){
		NavigableSet<Integer> nb = new TreeSet<Integer>();

		nb.add(10);
		nb.add(30);
		nb.add(24);
		nb.add(14);
		nb.add(27);

/*
  public abstract E lower(E);
  public abstract E floor(E);
  public abstract E ceiling(E);
  public abstract E higher(E);
  public abstract E pollFirst();
  public abstract E pollLast();
  public abstract java.util.Iterator<E> iterator();
  public abstract java.util.NavigableSet<E> descendingSet();
  public abstract java.util.Iterator<E> descendingIterator();
  public abstract java.util.NavigableSet<E> subSet(E, boolean, E, boolean);
  public abstract java.util.NavigableSet<E> headSet(E, boolean);
  public abstract java.util.NavigableSet<E> tailSet(E, boolean);
  public abstract java.util.SortedSet<E> subSet(E, E);
  public abstract java.util.SortedSet<E> headSet(E);
  public abstract java.util.SortedSet<E> tailSet(E);

 */
		System.out.println(nb);

		System.out.println(nb.lower(24));

		System.out.println(nb.floor(24));

		System.out.println(nb.ceiling(24));

		System.out.println(nb.higher(24));

		System.out.println(nb.pollFirst());

		System.out.println(nb.pollLast());

		System.out.println(nb.descendingSet());
		
		System.out.println(nb.iterator());
		
		System.out.println(nb.subSet(10,false,24,true));


	}
}

