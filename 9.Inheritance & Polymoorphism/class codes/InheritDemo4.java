class Parent{
    int x=10;
    static int y=20;
    Parent(){
        System.out.println("Parent");
    }
}
class Child extends Parent{
    int x=100;
    static int y=200;
    Child(){
        System.out.println("Child");
    }
    void access(){
        System.out.println(super.x);
        System.out.println(super.y);
        System.out.println(x);
        System.out.println(y);
        
    }
}

public class InheritDemo4 {
    public static void main(String[] args){
        Child obj=new Child();
        obj.access();
    }
}
//if both parent and child contains vaariables of same name then to access parents variable we use super keyword