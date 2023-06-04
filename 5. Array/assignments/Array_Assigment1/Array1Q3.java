import java.io.*;

class Array1Q3 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array: ");
        int x = Integer.parseInt(br.readLine());
        System.out.println("Enter elements of array");

        //product of even numbers only
		int mul=1;
		int arr[]=new int[x];
		for(int i=0;i<x;i++){
			arr[i]=Integer.parseInt(br.readLine());
			if(arr[i]%2==0){
				mul*=arr[i];
			}
		}
		System.out.println("Mul of even numbers: "+mul);
    }
}