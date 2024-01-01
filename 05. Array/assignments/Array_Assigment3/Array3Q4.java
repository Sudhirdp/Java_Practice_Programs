import java.io.*;

class Array3Q4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of array1:");
        int n = Integer.parseInt(br.readLine());
        int arr1[] = new int[n];

        System.out.println("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(br.readLine());
        }

        //Write a program to print prime number from array with corresponding index
        for(int j=0;j<n;j++){
            int count=0,x=arr1[j];
            for(int i=1;i<x;i++){
                if(x%i==0){
                    count++;
                }
                if(count>=2){
                    break;
                }
            }
            if(count==1){
                System.out.println("Prime number "+x+" found at index "+j);
            }
        }
    }
}