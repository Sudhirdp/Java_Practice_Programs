 class stringNBuffer2 {
    public static void main(String[] args){
        StringBuffer str1=new StringBuffer("");

        System.out.println(str1.capacity());
        System.out.println(System.identityHashCode(str1));

        StringBuffer str=new StringBuffer("Mohit");

        str= str.append(" Bagalmmmmmmm");
        str=str.append("moji");
        System.out.println(str);
        System.out.println(System.identityHashCode(str));

        System.out.println(str.capacity());

    }
}
