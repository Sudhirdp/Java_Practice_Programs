import java.io.*;

class Array3Q2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of array1:");
        int n = Integer.parseInt(br.readLine());
        int arr1[] = new int[n];

        System.out.println("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(br.readLine());
        }

        //Write a program to reverse every element of array
        for(int i=0;i<arr1.length;i++){
            int rev=0;
            for(int x=arr1[i];x>0;x/=10){
                int temp=x%10;
                rev=(rev*10)+temp;
            }
        System.out.println("Revered elements of array are: ");
            System.out.println(rev);
        }
    }
}