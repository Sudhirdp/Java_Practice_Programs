import java.io.*;

class ArrayAssignment3 {
    public static void main(String[] args)throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of array1:");
        int n=Integer.parseInt(br.readLine());
        int arr1[]=new int[n];

        System.out.println("Enter elements of array: ");
        for(int i=0;i<n;i++){
            arr1[i]=Integer.parseInt(br.readLine());
        }

        //Write a program to print count of digits of each element in an array
//        for(int i=0;i<arr1.length;i++){
//            int x=arr1[i],count=0;
//            while(x>0){
//                count++;
//                x/=10;
//            }
//        System.out.println("Count of digits of each element of array are: ");
//            System.out.println(count);
//        }

        //Write a program to reverse every element of array
//        for(int i=0;i<arr1.length;i++){
//            int rev=0;
//            for(int x=arr1[i];x>0;x/=10){
//                int temp=x%10;
//                rev=(rev*10)+temp;
//            }
//        System.out.println("Revered elements of array are: ");
//            System.out.println(rev);
//        }

        //Write a program to print all composite numbers(nom prime numbers) from array with their index
//        for(int i=0;i<arr1.length;i++){
//            int x=arr1[i],count=0;
//            for(int j=1;j<=x;j++){
//                if(x%j==0){
//                    count++;
//                }
//                if(count>2){
//                    break;
//                }
//            }
//            if(count>2){
//                System.out.println("Composite number "+arr1[i]+" found at index "+i);
//            }
//        }

        //Write a program to print prime number from array with corresponding index
//        for(int j=0;j<n;j++){
//            int count=0,x=arr1[j];
//            for(int i=1;i<x;i++){
//                if(x%i==0){
//                    count++;
//                }
//                if(count>=2){
//                    break;
//                }
//            }
//            if(count==1){
//                System.out.println("Prime number "+x+" found at index "+j);
//            }
//        }

        //Write a program to print perfect number from array with its index
//        for(int i=0;i<arr1.length;i++){
//            int x=arr1[i],sum=0;
//            for(int j=1;j<x;j++){
//                if(x%j==0){
//                    sum+=j;
//                }
//            }
//            if (sum==x){
//                System.out.println("Perfect number "+arr1[i]+" found at "+i);
//            }
//        }

        //Write a program to print palindrome numbers from array with its index
//        for(int i=0;i<arr1.length;i++){
//            int x=arr1[i],rev=0,temp=0;
//            while(x>0){
//                temp=x%10;
//                rev=(rev*10)+temp;
//                x/=10;
//            }
//            if(rev==arr1[i]){
//                System.out.println("Palindrome number "+arr1[i]+" found at index "+i);
//            }
//        }

        //Write a program to print strong number present in array  with its index
//        for(int i=0;i<arr1.length;i++){
//            int x=arr1[i],temp=0,sum=0;
//            while(x>0){
//                temp=x%10;
//                int fact=1;
//                for(int j=temp;j>0;j--){
//                    fact*=j;
//                }
//                sum+=fact;
//                x/=10;
//            }
//            if(sum==arr1[i]){
//                System.out.println("Strong number "+arr1[i]+" found at "+i);
//            }
//        }

        //Write a program to print Automorphic numbers from array with its index
//        for (int i=0;i< arr1.length;i++){
//            int x=arr1[i];
//            int sqr=arr1[i]*arr1[i],rev=0,rev2=0;
//            for(int j=arr1[i],y=sqr;j>0;j/=10,y/=10){
//                rev=(rev*10)+(j%10);
//                rev2=(rev2*10)+(y%10);
//            }
//            if(rev==rev2){
//                System.out.println("Armstrong number "+arr1[i]+" found at index "+i);
//            }
//        }

        //Write a program to print Armstrong numbers from array with its index
//        for(int l=1;l< arr1.length;l++){
//            int count=0;
//            for(int i=arr1[l];i>0;i/=10){
//                count++;
//            }
//            int sum=0;
//            for(int i=arr1[l];i>0;i/=10){
//                int temp=i%10,mul=1;
//                for(int j=1;j<=count;j++){
//                    mul*=temp;
//                }
//                sum+=mul;
//            }
//            if(arr1[l]==sum){
//                System.out.println("armstrong number "+arr1[l]+" found at index "+l);
//            }
//        }

        //Print second max element from a given array
//            int max=arr1[0];
//            int max2=arr1[0];
//            for(int j=1;j<arr1.length;j++){
//                if(max<arr1[j]){
//                    max=arr1[j];
//                }
//            }
//            for(int i=1;i<arr1.length;i++){
//                if(max2<arr1[i] && arr1[i]!=max){
//                    max2=arr1[i];
//                }
//            }
//            System.out.println("Maximum element of an array is: "+max);
//            System.out.println("And the second max element of an array is: "+max2);

        //Print second min element from array
//        int min=arr1[0];
//        int min2=arr1[0];
//        for(int j=1;j<arr1.length;j++){
//            if(min>arr1[j]){
//                min=arr1[j];
//            }
//        }
//        for(int i=1;i<arr1.length;i++){
//            if(min2>arr1[i] && arr1[i]!=min){
//                min2=arr1[i];
//            }
//        }
//        System.out.println("Minimum element of an array is: "+min);
//        System.out.println("And the second min element of an array is: "+min2);
    }
}
