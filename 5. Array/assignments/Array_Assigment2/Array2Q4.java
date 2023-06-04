import java.io.*;

class Array2Q4 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of array: ");
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
//To search element of an array and return it with its index
		int se=Integer.parseInt(br.readLine());
		for(int i=0;i<arr.length;i++){
			if(arr[i]==se){
				System.out.println(arr[i]+" Found at index "+i);
				break;
			}
		}
    }
}