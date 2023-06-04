//Program to find maximum between three number
public class Program6 {
    public static void main(String[] args) {
        int num1=1;
        int num2=2;
        int num3=3;
        if(num1>num2 && num1>num3)
        System.out.println(num1+" "+"is maximum number between"+" "+num1+","+num2+","+num3);
        if(num2>num1 && num2>num3)
        System.out.println(num2+" "+" is maximum number between"+" " +num1+","+num2+","+num3 );
        else 
        System.out.println(num3+" "+ "is maximum number between"+" "+num1+","+num2+","+num3);
        if(num1>num2 && num1==num3)
        System.out.println(num1+" "+"is greater than"+" "+num2+"and equal to"+" "+num3);
        if(num2>num1 && num2==num3)
        System.out.println(num2+" "+"is greater than"+" "+num3+"and equal to"+" "+num1);
        else 
        System.out.println(num3+" "+"is greater than"+" "+num1+"and equal to"+" "+num2);
    }
    
}

