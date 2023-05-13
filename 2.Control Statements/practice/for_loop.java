//for(initialization;condition;updation){body}

class for_loop{
    public static void main(String args[]){
        //1. print 1 to N
        // int n=10;
        // for(int i=0;i<n;i++){
        //     System.out.println(i);
        // }

        //2. print odd integers form 1 to n (two alternative ways)
        // int n=10;
        // for(int i=0;i<n;i++){
        //     if(i%2==1){
        //         System.out.println(i);
        //     }
        // } 
        // for(int i=1;i<n;i=i+2){
        //     System.out.println(i);
        // }

        //3.Print factorial of number
        // int n=5;
        // int fact=1;
        // for(int i=1;i<=n;i++){
        //     fact*=i;
        // }
        // System.out.println(fact);

        //4. Print all factors of a given number
        // int n=6;
        // for(int i=1;i<=n;i++){
        //         if(n%i==0){
        //             System.out.println(i);
        //         }
        // }

        //5. print the count of factors of a given number 
        // int n=6 ,count=0;
        // for(int i=1;i<=n;i++){
        //     if(n%i==0){
        //         count++;
        //     }
        // }
        // System.out.println(count);

        //6.Print whether the given number is prime number or not
        // int n=6;
        // int count=0;
        // for(int i=1;i<=n;i++){
        //     if(n%i==0){
        //         count++;
        //     }
        // }
        // if(count==2){
        //     System.out.println("Is a prime number");
        // } else{
        //     System.out.println("Not a prime number");
        // }

        //7.Print whether n is perfect number or not
        //perfect number:- a perfect number is a positive integer that is equal to the sum of its positive divisors(or factors), excluding the number itself
        // int n=4;
        // int sum=0;
        // for(int i=1;i<n;i++){
        //     if(n%i==0){
        //         sum+=i;
        //     }
        // }
        // if(sum==n){
        //     System.out.println("is a perfect number");
        // } else{
        //     System.out.println("Is not perfect number");
        // }

        //8.print whether n is armstrong number or not
        //Armstrong number:-An Armstrong number is a number such that the sum of the n-th power
        //   of its digits is equal to the number itself, where n is the number of digits in the number ex=>153=>(1*1*1)+(5*5*5)+(3*3*3)=153
        //   ex=>25=>(2*2)+(5+5)=34 not armstrong
//         int temp,x=153,sum=0,count=0;
//         for(int y=x;y!=0;y/=10) {
//             count++;
//         }
//         int z=count;
//         for(int n=x;n>0;n/=10){
//             temp=n%10;
//             int mul=1;
//             for(int count2=3;count2>0;count2--){
//                 mul*=temp;
//             }
//             sum+=mul;
//         }
//         if(sum==x){
//             System.out.println("Is armstrong number");
//         } else{
//             System.out.println("Not armstrong number");
//         }

        //9.automorphic number:-an integer whose square ends with the given integer
        //ex 5 square 25, 25 contains 5 so its automorphic
        //ex 76 square is 5776 ,its last digits are 76 ,so its automorphic
//        int n=76,count=0;
//         for(int x=n;x!=0;x/=10){
//             count++;
//         }
//         int sqr=n*n,temp,rev=0;
//        for (int y=1;y<=count;y++){
//            temp=sqr%10;
//            rev=rev*10+temp;
//            sqr/=10;
//        }
//        //int rev3=rev;
//        int rev2=0;
//        for (int y=1;y<=count;y++){
//            temp=rev%10;
//            rev2=rev2*10+temp;
//            rev/=10;
//        }
//        if(rev2==n){
//            System.out.println("Is a automorphic number");
//        } else{
//            System.out.println("Not automorphic");
//        }

        //10.composite number: numbers with more than two factors/ non-prime numbers
//        int n=16,count=0;
//         for(int i=1;i<=n;i++){
//             if(n%i==0){
//                 count++;
//             }
//         }
//        if(count>2){
//            System.out.println("Is a composite number");
//        } else{
//            System.out.println("Not composite number");
//        }

        //11.focaccia number:-
//        int x=0,y=1;
//        for(int i=1;i<=10;i++){
//            System.out.println(x);
//            System.out.println(y);
//            x+=y;
//            y+=x;
//        }

        //12.Strong number:-a number whose sum of all digits' factorial is equal to the number itself
//        int n=145,temp,sum=0;
//
//        for(int x=n;x!=0;x/=10){
//            temp=x%10;
//            int mul=1;
//            for(int i=1;i<=temp;i++){
//                mul*=i;
//            }
//            sum+=mul;
//        }
//        if(sum==n){
//            System.out.println("Is strong number");
//        } else{
//            System.out.println("Not strong number");
//        }

        //Write a program for a number is palindrome or not.
//         int n=2332,temp,rev=0;
//         for(int x=n;x!=0;x/=10){
//             temp=x%10;
//             rev=rev*10+temp;
//         }
//         if(n==rev){
//             System.out.println("Is a palindrome");
//         }

    }
} 