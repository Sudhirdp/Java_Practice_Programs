import java.io.*;

class Array3Q5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of array1:");
        int n = Integer.parseInt(br.readLine());
        int arr1[] = new int[n];

        System.out.println("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(br.readLine());
        }

        //Write a program to print perfect number from array with its index
        for(int i=0;i<arr1.length;i++){
            int x=arr1[i],sum=0;
            for(int j=1;j<x;j++){
                if(x%j==0){
                    sum+=j;
                }
            }
            if (sum==x){
                System.out.println("Perfect number "+arr1[i]+" found at "+i);
            }
        }
    }
}