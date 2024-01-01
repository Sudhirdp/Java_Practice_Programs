//static modifier (in method overriding : static method can not be override , it is limited to that class only)
class Parent{
        static void fun(){
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
//error : overriden method is static
