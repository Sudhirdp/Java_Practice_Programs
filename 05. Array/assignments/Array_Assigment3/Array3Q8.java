import java.io.*;

class Array3Q8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of array1:");
        int n = Integer.parseInt(br.readLine());
        int arr1[] = new int[n];

        System.out.println("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(br.readLine());
        }

        //8.Write a program to print Armstrong numbers from array with its index
        for(int l=1;l< arr1.length;l++){
            int count=0;
            for(int i=arr1[l];i>0;i/=10){
                count++;
            }
            int sum=0;
            for(int i=arr1[l];i>0;i/=10){
                int temp=i%10,mul=1;
                for(int j=1;j<=count;j++){
                    mul*=temp;
                }
                sum+=mul;
            }
            if(arr1[l]==sum){
                System.out.println("armstrong number "+arr1[l]+" found at index "+l);
            }
        }
    }
}