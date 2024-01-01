//method 1=public synchronized StringBuffer append(String str);


class stringNBuffer8{
    public static void main(String[] args){
        StringBuffer str1=new StringBuffer("Mohit");
        String str2="Pawar";

        StringBuffer str3=str1.append(str2);

        System.out.println(str1);
        System.out.println(str3);
    }
}