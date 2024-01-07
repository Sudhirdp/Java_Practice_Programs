// Megre 2 sorted stacks
//
import java.util.*;


class Merge{
	Stack<Integer> merge(Stack<Integer> s1,Stack<Integer> s2){

		Stack<Integer> s3 = new Stack<Integer>();

		while(!s1.empty() && !s2.empty()){
			if(s1.peek() > s2.peek()){
				
				s3.push(s1.pop());
			}
			else{
				s3.push(s2.pop());
			}
		}
		while(!s1.empty()){
			s3.push(s1.pop());
		}
		while(!s2.empty()){
			s3.push(s2.pop());
		}
		while(!s3.empty()){
			s1.push(s3.pop());
		}
		return s1;
	}
}
class Client{
	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);

		Stack<Integer> s1 = new Stack<Integer>();
		Stack<Integer> s2 = new Stack<Integer>();

		s1.push(10);
		s1.push(30);
		s1.push(50);
		s1.push(70);

		s2.push(20);
		s2.push(40);
		s2.push(60);
		s2.push(80);

		Merge obj = new Merge();
		Stack<Integer> s3 = obj.merge(s1,s2);

		System.out.println(s3);

	}
}
