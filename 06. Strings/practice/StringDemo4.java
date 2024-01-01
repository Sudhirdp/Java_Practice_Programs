public class StringDemo4 {
    public static void main(String args[]){
        String str1="Sudhir";
        String str2=new String("Sudhir");
        String str3="Sudhir";

        System.out.println(str1==str3);	//true			(==) compares identityHashCode
        System.out.println(str1==str2);	//false
        System.out.println(str3);

		//System.out.println(str1=str2);	//str1 s reference is change from scp to heap(str5 s address)
		//System.out.println(str1==str3);	//false
		//System.out.println(str1==str2);	//true
    }
}
