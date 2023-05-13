import java.io.*;
class NestedFor5 {

//        E5 D4 C3 B2 A1
//        A1 B2 C3 D4 E5
//        E5 D4 C3 B2 A1
//        A1 B2 C3 D4 E5
//        E5 D4 C3 B2 A1
    static void pattern1(int x,char ch){
        int rows=x,y=x;
        int x1=1;
        char ch1='A';
        for(int i=1;i<=rows;i++){
            if(i%2==0){
                ch1='A';
                y=1;
            } else{
                ch1=ch;
                y=x;
            }
            for(int j=1;j<=rows;j++){
                if(i%2==0){
                    System.out.print(ch1++ +""+y++ +" ");
                } else{
                    System.out.print(ch1-- +""+y-- +" ");
                }
            }
            System.out.println();
        }
    }

//            #===
//            =#==
//            ==#=
//            ===#
    static void pattern2(int x){
        for(int i=1;i<=x;i++){
            for(int j=1;j<=x;j++){
                if(i==j){
                    System.out.print('#');
                }else{
                    System.out.print('=');
                }
            }
            System.out.println();
        }
    }

//            5 4 3 2 1
//            8 6 4 2
//            9 6 3
//            8 4
//            5
    static void pattern3(int x){
        int y=x;
        for(int i=1;i<=x;i++){
//            int z=i*y;
            for(int z=i*y;z>0;z=z-i){
                System.out.print(z+" ");
            }
            y--;
            System.out.println();
        }
    }

//    Entered min: 2
//    Entered max: 11
//    2 4 6 8 10
//    3 5 7 9 11
    static void pattern4(int x,int y){
        System.out.println("Entered min: "+x);
        System.out.println("Entered max: "+y);
        for(int i=x;i<=y;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        for(int i=x;i<=y;i++){
            if(i%2==1){
                System.out.print(i+" ");
            }
        }
    }
//       input=5
//       0
//       1  1
//       2  3  5
//       8  13  21  34
    static void pattern5(int x){
        int p=0,q=1,temp;
        for(int i=1;i<x;i++){
            for(int j=1;j<=i;j++){
                System.out.print(p+"  ");
                temp=p;
                p+=q;
                q=temp;
            }
            System.out.println();
        }
    }

//    check whether the given char are same or not
    static void pattern6(char ch,char ch2){
        if(ch==ch2){
            System.out.println("Similar chars "+ch);
        } else{
            int diff=(int)ch2-ch;
            System.out.println(diff);
        }
    }

//    7
//    $
//    @ @
//    & & &
//    # # # #
//    $ $ $ $ $
//    @ @ @ @ @ @
//    & & & & & & &
    static void pattern8(int x){
        for(int i=1;i<=x;i++){
            for(int j=1;j<=i;j++){
                if(i%4==1){
                    System.out.print("$ ");
                } else if(i%4==2){
                    System.out.print("@ ");
                } else if(i%4==3){
                    System.out.print("& ");
                } else{
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }

    //print sum of factorials of digits
    static void pattern9(int x){
        int sum=0;
        for(int i=x;i>0;i/=10){
            int temp=i%10;
            int mul=1;
            for(int j=1;j<=temp;j++){
                mul*=j;
            }
            sum+=mul;
        }
        System.out.println(sum);
    }

//    Entered min: 2
//    Entered Max: 11
//    2 3 5 7 11
    static void pattern10(int min ,int max){
        System.out.println("Entered min: "+min);
        System.out.println("Entered Max: "+max);
        if(min>max){
            System.out.println("Invalid inputs min is greater than max");
        }
        for(int i=min;i<=max;i++){
            int fact=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    fact+=1;
                }
                if(fact>2){
                    break;
                }
            }
            if(fact==2){
                System.out.print(i+" ");
            }

        }
    }

    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int x=Integer.parseInt(br.readLine());
        int y=Integer.parseInt(br.readLine());
//        char ch=(char)br.read();
//        br.skip(1);
//        char ch2=(char)br.read();
//        br.skip(1);
//        pattern1(x,ch);
//        pattern2(x);
//        pattern3(x);
//        pattern4(x,y);
//        pattern5(x);
//        pattern6(ch,ch2);
//        pattern8(x);
//        pattern9(x);
//        pattern10(x,y);
    }
}

