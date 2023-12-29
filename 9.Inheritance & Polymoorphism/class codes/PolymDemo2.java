class Parent{
    Parent(){
        System.out.println("In Parent");
    }
    void property(){
        System.out.println("Gold, Flat , House");
    }
    void marry(){
        System.out.println("Relatives girl (Selected by family)");
    }
}
class Child extends Parent{
    Child(){
        System.out.println("In Child");
    }
    void marry(){
        System.out.println("Girls of childs Choice");
    }
}

public class PolymDemo2 {
    public static void main(String[] args){
        Child obj=new Child();
        obj.property();
        obj.marry();
        //here childs marry method will override the parents marry method
    }
}
