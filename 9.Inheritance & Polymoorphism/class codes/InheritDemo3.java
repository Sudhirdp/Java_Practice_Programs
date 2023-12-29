class Parent{
    int x=10;
    static int y=20;
    private int k=0;
    Parent(){
        System.out.println("IN Parent constructor");
    }
    void accessP(){
        System.out.println("Parent Instance Method");
    }
    static void anyMeth(){
        System.out.println("Parents static method");
    }
    static{
        System.out.println("Parents static block");
    }
}

class Child extends Parent{
    int z=30;
    Child(){
        System.out.println("In Child Constructor");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        // System.out.println(k);       //not accessible
        //due to inheritance all variables & methods (except private mtehods and variables) of parent are accessible to child class
    }
    static{
        System.out.println("Child Static Block");
    }
}

public class InheritDemo3 {
    public static void main(String[] args){
        Child obj=new Child();
        obj.accessP();
        obj.anyMeth();
        //here chil object will implicity call for child constructor which contains first
        // like invoke special(i.e. super()) which calls parent constructor and again parent constructor 
        //has super in it which calls objects contructor.
    }
}

//first static parent and then static child block will be executed because childs special str. first contains address to
//special structure of parent class. which initializesstatic var of parents executes static block of parent and then it goes for 
//childs static block .  