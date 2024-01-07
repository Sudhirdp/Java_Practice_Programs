import java.util.*;

class RevString{
	
	String reverseString(String str){
	
		Stack<Character> s = new Stack<Character>();
	
		for(int top = 0;top<str.length();top++){
			s.push(str.charAt(top));
		}
	
		String ret = "";
	
		while(!s.empty()){
			ret = ret + s.pop();
		}
	
		return ret;
	}
}
class Client{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		RevString obj = new RevString();

		System.out.println(obj.reverseString(str));

	}
}
