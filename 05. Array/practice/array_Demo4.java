public class array_Demo4 {
    public static void main(String args[]){
        int arr[];
        arr=new int[]{90,40,5,34};
        String arr2[]=new String[4];
        int x=00;
        arr2[0]="name4";
        arr2[1]="123";
        //System.out.println(arr2);
        // [Ljava.lang.String;@7699a589 is address of array arr2

        Character ch[]=new Character[]{'a','b','z','y'};
//        System.out.println(ch);
        //System.out.println(arr);//[Ljava.lang.Character;@58372a00

        char ch3[]=new char[]{'a','b','z','y'};
//        System.out.println(ch3);      //abzy

        boolean bl[]=new boolean[]{true,false,true,true,false};
        boolean bl4[]={true,false,true,true,false};
        boolean bl5[]={true,false,true,true,false};
        boolean bl3[]=new boolean[]{true,false,true,true,false};
        boolean bl2[]=new boolean[]{true,false};
        //System.out.println(bl);//[Z@2c7b84de

        byte bt[]=new byte[]{1,'a',2};
        byte bt2[]=new byte[]{5,4,1};
        //System.out.println(bt);//[B@3fee733d

        // System.out.println(System.identityHashCode(bt[0]));
        // System.out.println(System.identityHashCode(bt2[2]));//both will be same as because of integer cache
        
        // System.out.println(System.identityHashCode(bt[1]));
        // System.out.println(System.identityHashCode(ch[0]));//different as data type is different

        // System.out.println("lol");
//        System.out.println(System.identityHashCode(bl[0]));
//         System.out.println(System.identityHashCode(bt[1]));//different as data type is different

//        System.out.println(System.identityHashCode(bl));        //despite having same elements in array, arrays id are different
//        System.out.println(System.identityHashCode(bl3));       //because they form object every time
//        System.out.println(System.identityHashCode(bl4));
//        System.out.println(System.identityHashCode(bl5));


        //concept of integer cache work only for integers upto 1byte
//        for(int y:arr){
//            System.out.println(y);
//        }        //for each loop
//        for(char zh : ch){
//            System.out.println(zh);
//        }

        int arr3[]={2,5,6,7,8};
        int arr4[]={2,5,6,7,8};
        int arr5[]=new int[]{2,5,6,7,8};
//        System.out.println(System.identityHashCode(arr3));          //despite having same elements in array, arrays id are different
//        System.out.println(System.identityHashCode(arr4));          //because they form object every time
//        System.out.println(System.identityHashCode(arr5));

//        arrayFun(arr);
        array_Demo4 obj= new array_Demo4();
//        obj.arrayChanger(arr);//array can be changed from another function
        
    }
    //      passing array to a function
        static void arrayFun(int arr[]){
            for(int x:arr){
                System.out.println(x);
            }
        }

        void arrayChanger(int []arr){
            arr[0]=50;
            for(int x:arr){
                System.out.println(x);
            }
        }
 
}
