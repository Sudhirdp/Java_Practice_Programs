class Parent{
        void fun(){
                System.out.println("Parent fun");
        }
}
class Child extends Parent{
        private void fun(){
                System.out.println("Child fun");
        }
}
class Client{
        public static void main(String[] args){
                Parent obj=new Child();
                obj.fun();
        }
}
//error : attempting to assign weaker privillages was package
