import jdk.dynalink.beans.StaticClass;

public class MyInsertStr {

    static String myInsert(StringBuffer sbr, int x, String str){
        String str1=new String(sbr);

        char[] ch1=str1.toCharArray();
        char[] ch2=str.toCharArray();
        char ch3[]=new char[ch1.length+ch2.length];
        int count=0;
        for(int i=0;i<x;i++){
            ch3[i]=ch1[i];
            count++;
        }
        for(int i=x,j=0;i<ch2.length+x;i++,j++){
            ch3[i]=ch2[j];
        }
        for(int i=count+ch2.length,j=count;i<ch3.length;i++,j++){
            ch3[i]=ch1[j];
        }
    String str3=new String(ch3);
        return str3;
    }

    public static void main(String[] args){

        StringBuffer str1=new StringBuffer("Mohit ");
        String str2="Sudhir Patil";

        System.out.println(myInsert(str1,6,str2));
    }
}
