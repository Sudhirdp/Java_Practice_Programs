import java.io.*;

class Array2Q2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of array: ");
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
//Write a program to print count of odd and even number of elements in array
		int codd=0,ceven=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==1){
				codd++;
			} else {
				ceven++;
			}
		}
		System.out.println("Count of even numbers in array is:- "+ceven);
    }
}