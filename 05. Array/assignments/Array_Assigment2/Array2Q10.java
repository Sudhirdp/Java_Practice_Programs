import java.io.*;

class Array2Q10 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of array: ");
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        //Write a program to print elements whose addition of digits is even
        int temp=0;
		for(int i=0;i<arr.length;i++){
			int x=arr[i];
			int sum=0;
			while(x>0){
				temp=x%10;
				sum+=temp;
				x/=10;
			}
			if(sum%2==0){
				System.out.println(arr[i]);
			}
		}
    }
}