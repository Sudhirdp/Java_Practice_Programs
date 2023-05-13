class StringDemo2{
	public static void main(String args[]){
		String str1="Sudhir";
		String str2="Patil";

		//System.out.println(str1+str2);
		String str3="SudhirPatil";
		String str4=str1+str2; //forms new object on heap

		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));

//		System.out.println(str3.equals(str4)); //equals() method returns true if two objects have same value (where they are stored doesnt matter)
//		System.out.println(str3.hashCode());
//		System.out.println(str4.hashCode());	//hashCode() method returns unique value for objects data, if two or many objects have same values then its hashCode values are same

//		String s1=null;
//		String s2=new String();
//		System.out.println(s1==s2);
	}
}
