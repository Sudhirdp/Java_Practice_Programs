// Recursion
//

//
// String = 'core2web"
// reverse the string using recursion 
// bew2eroc
//


import java.util.*;


class Demo{
	String reverse(String str){
		char arr[] = str.toCharArray();
		String ret = "";
		for(int i = arr.length-1;i>=0;i--){
			ret = ret + arr[i];
		}
		return ret;
	}
	String rev(String str){
		if(str == null || str.length()<=1)
			return str;
		return rev(str.substring(1)) + str.charAt(0);
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(new Demo().reverse(str));
		System.out.println(new Demo().rev(str));
	}
}
