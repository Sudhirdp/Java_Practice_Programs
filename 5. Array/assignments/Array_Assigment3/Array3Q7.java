import java.io.*;

class Array3Q7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of array1:");
        int n = Integer.parseInt(br.readLine());
        int arr1[] = new int[n];

        System.out.println("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(br.readLine());
        }

        //7.Write a program to print strong number present in array  with its index
        for(int i=0;i<arr1.length;i++){
            int x=arr1[i],temp=0,sum=0;
            while(x>0){
                temp=x%10;
                int fact=1;
                for(int j=temp;j>0;j--){
                    fact*=j;
                }
                sum+=fact;
                x/=10;
            }
            if(sum==arr1[i]){
                System.out.println("Strong number "+arr1[i]+" found at "+i);
            }
        }
    }
}