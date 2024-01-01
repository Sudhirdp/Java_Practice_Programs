import java.util.*;
public class arrayPractice {
    void pairs(int []array){
        System.out.println("Pairs of elements are: ");
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                System.out.print("("+array[i]+","+array[j]+"), ");
            }
            System.out.println();
        }
    }

    void subArray(int array[]){
        for(int i=0;i<array.length;i++){
            String srt=""+array[i];
            for(int j=i;j<array.length;j++){
                if(j==i){
                    System.out.print("("+array[i]+")");
                } else {
                    srt+=","+array[j];
                    System.out.print(",("+srt+")");
                }
            }
            System.out.println();
        }
    }

    void maxSubarraySum(int arr[]){
        int temp=arr[1];
        int temp2=0;
        int sum=arr[1];
        for(int i=0;i<arr.length;i++){
            sum=arr[i];
            for(int j=i+1;j<arr.length;j++){
                sum+=j;
                if(temp<sum){
                    temp=sum;
                    System.out.println(sum);
                }
            }
            if(temp2<temp){
                temp2=temp;
                System.out.println(temp);
            }
        }
        System.out.println(temp2);
    }
    void mxSum(int arr[]){
        int []sum = new int[arr.length];
        for(int i =0; i<arr.length;i++)
        {
            for(int j =0; j<arr.length; j++){

                 sum[i] += arr[j];

            }
            sum[i] = sum[i]-arr[i];
        }

        for(int i=0;i<sum.length;i++){
            System.out.print(sum[i]+" ");
        }
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        arrayPractice ap=new arrayPractice();
        System.out.println("Enter the size of array: ");
        int size=sc.nextInt();

        int [] arr=new int[size];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

//        ap.pairs(arr);
//        ap.subArray(arr);
//        ap.maxSubarraySum(arr);
        ap.mxSum(arr);
    }
}
