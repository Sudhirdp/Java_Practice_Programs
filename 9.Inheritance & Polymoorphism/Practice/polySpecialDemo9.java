//final modifier (in method overriding : final method can not be override)
class Parent{
        final void fun(){
                System.out.println("Parent fun");
        }
}
class Child extends Parent{
        void fun(){
                System.out.println("Child fun");
        }
}
class Client{
        public static void main(String[] args){
                Parent obj=new Child();
                obj.fun();
        }
}
//error : overriden method is final
