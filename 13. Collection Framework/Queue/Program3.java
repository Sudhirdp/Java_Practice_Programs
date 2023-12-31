import java.util.*;

class Project implements Comparable{
	String name = null;
	int teamSize = 0;
	int duration = 0;

	Project(String name,int teamSize, int duration){
		this.name = name;
		this.teamSize = teamSize;
		this.duration = duration;
	}
	public String toString(){
		return "{"+name+":"+teamSize+":"+duration+"}";
	}
	public int compareTo(Object obj){
		return (this.name).compareTo(((Project)obj).name);
	}
}
class PriorityQueueDemo{
	public static void main(String [] args){
		PriorityQueue pq = new PriorityQueue();

		pq.offer(new Project("Chess",3,2));
		pq.offer(new Project("Application",4,9));
		pq.offer(new Project("Software",7,3));

		System.out.println(pq);
	}
}


