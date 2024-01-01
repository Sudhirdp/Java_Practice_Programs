import java.io.*;

class Array2Q8 {
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

        //Write a program to print uncommon elements between two arrays
		System.out.println("uncommon elements of array are: ");
		for(int i=0;i<arr.length;i++){
			int common=0;
			for(int j=0;j<arr2.length;j++){
				if(arr[i]==arr2[j]){
					common++;
				}
			}
			if(common==0){
				System.out.println(arr[i]);
			}
		}
		for(int i=0;i<arr2.length;i++){
			int common=0;
			for(int j=0;j<arr.length;j++){
				if(arr2[i]==arr[j]){
					common++;
				}
			}
			if(common==0){
				System.out.println(arr2[i]);
			}
		}

    }
}