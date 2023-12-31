import java.util.*;

class DequeDemo{
	public static void main(String [] args){
		Deque q = new ArrayDeque();

		q.offer(10);
		q.offer(40);
		q.offer(20);
		q.offer(30);

		System.out.println(q);

		q.offerFirst(60);

		q.offerLast(90);
		System.out.println(q);
		q.pollFirst();
		q.pollLast();
		System.out.println(q);
		
		System.out.println(q.peekFirst());
		System.out.println(q.peekLast());

		Iterator itr = q.iterator();

		while(itr.hasNext()){
			System.out.println(itr.next());
		}

		Iterator itr1 = q.iterator();

		while(itr1.hasNext()){
			System.out.println(itr1.next());
		}
	}
}
