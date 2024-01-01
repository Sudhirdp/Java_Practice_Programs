class stringNBuffer12 {
    public static void main(String[] args){
        String str1="Core2web";
        StringBuffer sb2=new StringBuffer(str1);

        str1=sb2.reverse().toString();
        System.out.println(str1);
    }
}
