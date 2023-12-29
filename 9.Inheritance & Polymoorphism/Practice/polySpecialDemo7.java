class Parent{
        private void fun(){
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
//error private access modifier
//parent method is private so it is not accessible in any class.
