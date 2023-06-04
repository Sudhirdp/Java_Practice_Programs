import java.io.*;

class Array2Q9 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of array: ");
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Enter size of Second array: ");
		int m=Integer.parseInt(br.readLine());
		int arr2[]=new int[m];
		System.out.println("Enter elements of Second array: ");
		for(int i=0;i<arr2.length;i++){
			arr2[i]=Integer.parseInt(br.readLine());
		 }

//        Write a program to print merged array of two elements
		int arr3[]=new int[(arr.length+arr2.length)];
		for(int i=0;i<arr.length;i++){
			arr3[i]=arr[i];
		}
		for(int i=0;i<arr2.length;i++){
			arr3[arr.length+i]=arr2[i];
		}
		for(int i=0;i<arr.length+arr2.length;i++){
			System.out.println(arr3[i]);
		}
    }
}