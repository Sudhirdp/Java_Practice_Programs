 class stringNBuffer4 {
    public static void main(String[] args){
        String str1="Shashi";
        String str2=new String("Bagal");
        StringBuffer str3=new StringBuffer("Core2Web");

         System.out.println(str3);
         System.out.println(System.identityHashCode(str3));

        //str1.append(str3);  append method belong to class StringBuffer and concate method belong to class String
        StringBuffer str4=str3.append(str1);

        System.out.println(str3);
        System.out.println(System.identityHashCode(str3));

        System.out.println(str4);
        System.out.println(System.identityHashCode(str4));



    }
}
