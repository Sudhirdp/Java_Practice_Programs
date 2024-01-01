public class stringNBuffer13 {
    static String MyReverse(String str1){
        char[] arr= str1.toCharArray();
        String ans=" ";
        for(int i= arr.length-1;i>0;i--){
            ans=ans+arr[i];
        }
        return ans;
    }

    public static void main(String[] args){
        StringBuffer sb=new StringBuffer("Shashi");
        String str2=MyReverse(sb.toString());
        System.out.println(str2);
    }
}
