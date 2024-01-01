class PC{
    PC(){
        System.out.println("IN PC Class");
    }
    void computing(){
        System.out.println("Start, Work, Power-off");
    }
}
class GammingPC extends PC{
    GammingPC(){
        System.out.println("In Gamming PC constructor");
    }
}

class InheritDemo2 {
    public static void main(String[] args){
        GammingPC GPC=new GammingPC();
        GPC.computing();
        // GPC.PC();        //can't find symbol error , constructor is special method which can be called implicitly
    }
}
