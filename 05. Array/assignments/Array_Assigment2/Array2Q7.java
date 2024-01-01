import java.io.*;

class Array2Q7{
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

        //Write a program to print common elements of an array
		System.out.println("Common elements are: ");
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(arr[i]==arr2[j]){
					System.out.print(arr[i]+" ");
					break;
				}
			}
		}

    }
}