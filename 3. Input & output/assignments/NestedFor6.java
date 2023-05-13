import java.io.*;

public class NestedFor6 {
    public static void main(String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter minimum Range: ");
        int min = Integer.parseInt(br.readLine());
        System.out.println(("Enter maximum Range: "));
        int max = Integer.parseInt(br.readLine());

        //print numbers and count of numbers divisible by 5 and even between provided range
//        int count=0;
//        for(int i=min;i<=max;i++){
//            if(i%5==0 && i%2==0){
//                System.out.println(i);
//                count++;
//            }
//        }
//        System.out.println("Count of even divisible by 5 numbers is: "+count);

        //take range from user and print composite numbers
//        for(int i=min;i<=max;i++){
//            int count=0;
//            for(int j=1;j<i;j++){
//                if(i%j==0){
//                    count++;
//                }
//                if(count>1){
//                    break;
//                }
//            }
//            if(count>=2){
//                System.out.println(i);
//            }
//        }

        //take range as input from user and print squares between that range
//        for(int i=min;i<max;i++){
//            System.out.println(i*i);
//            if(i*i>=max){
//                break;
//            }
//        }

        //perfect cubes
//        for(int i=min;i<max;i++){
//            System.out.println(i*i*i);
//            if(i*i*i>=max){
//                break;
//            }
//        }

        //perfect  number
//        for(int i=min;i<max;i++){
//            int sum=0;
//            for(int j=1;j<i;j++){
//                if(i%j==0){
//                    sum+=j;
//                }
//            }
//            if(sum==i){
//                System.out.println(i);
//            }
//        }

        //take 5 numbers and print count of digits in these numbers
//        for(int i=1;i<=5;i++){
//            System.out.println("Eneter numbers: ");
//            int x=Integer.parseInt(br.readLine()),count=0;
//            for(int j=x;j>0;j/=10){
//                count++;
//            }
//            System.out.println("Digit count in "+x+" is "+count);
//        }

        //print reverse of all numbers
//        for(int i=min;i<max;i++){
//            int rev=0;
//            for(int j=i;j>0;j/=10){
//                rev=(rev*10)+(j%10);
//            }
//            System.out.println(rev);
//        }

        //print all palindromes between provided range
//        for(int i=min;i<max;i++){
//            int rev=0;
//            for(int j=i;j>0;j/=10){
//                rev=(rev*10)+(j%10);
//            }
//            if(rev==i){
//                System.out.println(i);
//            }
//        }

        //strong numbers between range
//        for(int i=min;i<max;i++){
//            int sum=0;
//            for(int j=i;j>0;j/=10){
//                int temp=j%10,mul=1;
//                for(int k=1;k<=temp;k++){
//                    mul*=k;
//                }
//                sum+=mul;
//            }
//            if(i==sum){
//                System.out.println(i);
//            }
//        }

        //armstrong number
//        for(int l=min;l<max;l++){
//            int count=0;
//            for(int i=l;i>0;i/=10){
//                count++;
//            }
//            int sum=0;
//            for(int i=l;i>0;i/=10){
//                int temp=i%10,mul=1;
//                for(int j=1;j<=count;j++){
//                    mul*=temp;
//                }
//                sum+=mul;
//            }
//            if(l==sum){
//                System.out.println(l);
//            }
//        }
    }
}
