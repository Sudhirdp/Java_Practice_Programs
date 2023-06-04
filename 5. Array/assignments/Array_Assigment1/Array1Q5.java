import java.io.*;

class Array1Q5 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array: ");
        int x = Integer.parseInt(br.readLine());
        System.out.println("Enter elements of array");

        //divisible by 5
		int arr[]=new int[x];
		for(int i=0;i<x;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Numbers Divisible by 5 are: ");
		for(int i=0;i<x;i++){
			if(arr[i]%5==0){
				System.out.println(arr[i]);
            }
		}
    }
}