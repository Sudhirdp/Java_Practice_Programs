import java.io.*;

class Array3Q6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of array1:");
        int n = Integer.parseInt(br.readLine());
        int arr1[] = new int[n];

        System.out.println("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(br.readLine());
        }

        //Write a program to print palindrome numbers from array with its index
        for(int i=0;i<arr1.length;i++){
            int x=arr1[i],rev=0,temp=0;
            while(x>0){
                temp=x%10;
                rev=(rev*10)+temp;
                x/=10;
            }
            if(rev==arr1[i]){
                System.out.println("Palindrome number "+arr1[i]+" found at index "+i);
            }
        }
    }
}