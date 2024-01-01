//Write a program to check pythagorus triplet or not

class Program9{
    public static void main(String[] args){
        int a=3;int b=4;int c=5;;
        
        if(a*a==b*b+c*c || b*b==a*a+c*c || c*c==b*b+a*a){
            System.out.println("It is a pythagorous triplet");
        }
        else{
            System.out.println("It is not pythagorous triplet");
        }
    }
}
