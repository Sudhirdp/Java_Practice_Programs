public class MyReverseDemo {
    static StringBuffer myReverse(String str){
        char[] ch1=str.toCharArray();
        char temp;
        for(int i=0;i<ch1.length/2;i++) {
            temp = ch1[i];
            ch1[i] = ch1[ch1.length - i - 1];
            ch1[ch1.length - i - 1] = temp;
        }
//        System.out.println(ch1);
        String str3=new String(ch1);
        StringBuffer str4=new StringBuffer(String.valueOf(ch1));

        return str4;
    }

    public static void main(String args[]){
        String str1="mohit";

        System.out.println(myReverse(str1));
    }
}
