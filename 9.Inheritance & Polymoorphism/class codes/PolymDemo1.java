
// Each method has its method signature in method table and will be checked at compile time 
//no two methods should have same method signature. method signature contains methodname(param).
//In overlaoding return type doesn't matter in overriding return type matters 

//overloading => it means to have to methods of same name but different method signature in same class

class PolymDemo1 {

    void fun(int x){
        System.out.println(x);
    }
    void fun(float y){
        System.out.println(y);
    }
    void fun(PolymDemo1 obj){
        System.out.println("In PolyDemo1 para");
        System.out.println(obj);
    }
    public static void main(String[] args){
        PolymDemo1 obj1=new PolymDemo1();
        obj1.fun(10);
        obj1.fun(10.5f);

        PolymDemo1 obj2=new PolymDemo1();
        obj2.fun(obj1);
    }
}
