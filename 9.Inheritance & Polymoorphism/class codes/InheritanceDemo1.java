class ICC{
    ICC(){
        System.out.println("In ICC constructor");
    }
    void parentMeth(){
        System.out.println("Parents property is accesible to child");
    }
}

class BCCI extends ICC{     //bcci=>child       ICC=>Parent
    BCCI(){
        System.out.println("In BCCI Constructor");
    }
    void childMeth(){
        System.out.println("Childs Method");
    }
}

class InheritanceDemo1{
    public static void main(String[] args){
        BCCI obj1=new BCCI();   //here parents constructor is called first
        obj1.parentMeth();
        obj1.childMeth();
    }
}
