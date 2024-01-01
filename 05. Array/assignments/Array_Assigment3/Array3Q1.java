import java.io.*;

class Array3Q1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of array1:");
        int n = Integer.parseInt(br.readLine());
        int arr1[] = new int[n];

        System.out.println("Enter elements of array: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Integer.parseInt(br.readLine());
        }

        //Write a program to print count of digits of each element in an array
        for(int i=0;i<arr1.length;i++){
            int x=arr1[i],count=0;
            while(x>0){
                count++;
                x/=10;
            }
            System.out.print("Count of digits of element of array are: ");
            System.out.println(count);
        }
    }
}