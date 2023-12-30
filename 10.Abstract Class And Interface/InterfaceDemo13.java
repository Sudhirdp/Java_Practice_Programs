interface Demo{
    static void fun(){
        System.out.println("In fun");
    }
}
class DemoChild implements Demo{
    void fun(){
        System.out.println("In DemoChild Fun");
        Demo.fun();
    }
}
public class InterfaceDemo4 {
    public static void main(String[] args){
        DemoChild obj=new DemoChild();
        obj.fun();

        // Demo obj2=new DemoChild();
        // obj2.fun(); //the receiver expression should be replaced with the type qualifier 'Demo'
        Demo.fun();
    }
}
