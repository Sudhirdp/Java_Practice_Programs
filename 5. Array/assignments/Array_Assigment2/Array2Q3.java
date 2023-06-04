import java.io.*;

class Array2Q3 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of array: ");
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
//sum of odd and sum of even numbers
		int osum=0,esum=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==1){
				osum+=arr[i];
			} else{
				esum+=arr[i];
			}
		}
		System.out.println("Sum of odd numbers of array is: "+osum);
		System.out.println("Sum of even numbers of an array is: "+esum);

    }
}