public class StringDemo1 {
   public static void main(String args[]){
        String str1="Core2Web";     //takes memory in string constant pool , scp is also present in heap
        String str2=new String("Core2Web");     //object is created and takes memory in heap area

        char str3[]={'C','o','r','e','2','W','e','b'};

        System.out.println(str1);       //heap(scp)
        System.out.println(str2);       //heap
        System.out.println(str3);       //heap(IntegerCache)

        String str4="Core2Web";         //heap(scp)
        String str5=new String("Core2Web");     //new obj in heap
        char str6[]={'C','o','r','e','2','W','e','b'};

        System.out.println(System.identityHashCode(str1));      //string constant pull has its reference
        System.out.println(System.identityHashCode(str2));      //new object is formed so it has new object is every time
        System.out.println(System.identityHashCode(str3));      //as it is a string of characters its actual data lies in IntegerCache
        System.out.println(System.identityHashCode(str4));      //string constant pull has its referenced, no extra memory required
        System.out.println(System.identityHashCode(str5));      //new object is formed so it has new object is every time
        System.out.println(System.identityHashCode(str6));      //different
    }
}
