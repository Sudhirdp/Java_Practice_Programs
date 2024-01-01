class stringNBuffer5{
    public static void main(String[] args){
        String str1="Mohit";
        String str2=new String("Pawar" );
        StringBuffer str3=new StringBuffer("Patil");

        //str1.appned(str2); append method belong to StringBuffer class and conacat belon to string class
        //str1.concat(str3);  Incompatable datatype str3 argument is a StringBuffer so it cannot coverted to string
        //StringBuffer str4=str1.concat(str2); //Incompatable data type String cannot converted to String Buffer
        //String only as return typr String

        String str4=str1.concat(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);


        //String str5=str3.append(str2);   Incompatable datatype StringBuffer to String
         StringBuffer str5=str3.append(str2);
         System.out.println(str3);

        StringBuffer str6= str3.append(str3);

        System.out.println(str5);

    }
}






