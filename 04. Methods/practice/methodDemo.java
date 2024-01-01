public class methodDemo {
    public static void main(String[] args){
        gun();

        //fun();// non-static method fun() cannot be referenced from a static context
        //fun must be static for it to be running in main method

        //run();  //missing return statement

        //dun();
//        method dun in class methodDemo cannot be applied to given types;
//        required: int
//        found:    no arguments
//        reason: actual and formal argument lists differ in length

//        num(4);  //incompatible types: unexpected return value
    }
    static void gun(){
        System.out.println("Inside gun function / method");
    }
    void fun(){
        System.out.println("Inside fun function/method");
    }
//    static int run(){
//        System.out.println("inside run");
//    }

    static void dun(int x){
        System.out.println("lol");
    }
    static void num(int y){
//        return y;
    }



}
