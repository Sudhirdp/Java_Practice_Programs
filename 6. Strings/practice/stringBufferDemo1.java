public class stringBufferDemo1 {
    public static void main(String[] args){

//        StringBuffer br=new StringBuffer("Priyaka ki ma ki chut");
//        StringBuffer br1=new StringBuffer();
//        StringBuffer br2=new StringBuffer(100);

        String str1="priyanka";
        String str2="maka";
        StringBuffer str3=new StringBuffer("bhosda");
        String str5=new String(str3);
        System.out.println(str5);

        StringBuffer str4=str3.append(str3);
//        System.out.println(str3);
//        System.out.println(str4);

        System.out.println(str3.insert(2,"1111"));


//        str3.append(str2);
//        System.out.println(str3);

    }
}
