import java.io.*;

class Array3Q3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of array1:");
        int n = Integer.parseInt(br.readLine());
        int arr1[] = new int[n];

        System.out.println("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(br.readLine());
        }

        //Write a program to print all composite numbers(nom prime numbers) from array with their index
        for(int i=0;i<arr1.length;i++){
            int x=arr1[i],count=0;
            for(int j=1;j<=x;j++){
                if(x%j==0){
                    count++;
                }
                if(count>2){
                    break;
                }
            }
            if(count>2){
                System.out.println("Composite number "+arr1[i]+" found at index "+i);
            }
        }
    }
}