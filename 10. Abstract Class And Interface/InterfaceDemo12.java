interface Demo1{
    static void m1(){
        System.out.println("Demo1-m1");
    }
}
interface Demo2{
    static void m1(){
        System.out.println("Demo2-m1");
    }
}
interface Demo3 extends Demo1,Demo2{
    
}
// class InterfaceDemo1 implements Demo1{
//     public static void main(String[] args){
//         // Demo1 obj=new InterfaceDemo1();
//         // obj.m1();
//     }
// }

class InterfaceDemo1 implements Demo3{
    public static void main(String[] args){
        Demo3.m1();
    }
}
//symbol not found 
//static method from the interface cant be inherited