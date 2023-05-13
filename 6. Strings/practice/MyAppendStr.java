import java.sql.SQLOutput;

public class MyAppendStr {

    static String myAppend(String str1,String str2){
        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();
        char[] ch3=new char[ch1.length+ ch2.length];

        for(int i=0;i<ch1.length;i++){
            ch3[i]=ch1[i];
        }
        for(int i=0;i< ch2.length;i++){
            ch3[ch1.length+i]=ch2[i];

        }
        String str3=new String(ch3);
        return str3;
    }

    public static void main(String args[]){
        String str1="Mohit";
        String str2="Pawar";

        System.out.println(myAppend(str1,str2));
    }
}