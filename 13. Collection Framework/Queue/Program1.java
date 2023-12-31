import java.util.*;

class PriorityQueueDemo{
	public static void main(String [] args){
		PriorityQueue pq = new PriorityQueue();

		pq.offer(10);
		pq.offer(40);
		pq.offer(90);
		pq.offer(70);
		pq.offer(30);

		System.out.println(pq);

		System.out.println(pq.peek());

		System.out.println(pq.poll());

	}
}


