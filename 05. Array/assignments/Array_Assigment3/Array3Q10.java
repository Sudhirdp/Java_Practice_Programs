import java.io.*;

class Array3Q10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of array1:");
        int n = Integer.parseInt(br.readLine());
        int arr1[] = new int[n];

        System.out.println("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(br.readLine());
        }

        //10.Print second min element from array
        int min=arr1[0];
        int min2=arr1[0];
        for(int j=1;j<arr1.length;j++){
            if(min>arr1[j]){
                min=arr1[j];
            }
        }
        for(int i=1;i<arr1.length;i++){
            if(min2>arr1[i] && arr1[i]!=min){
                min2=arr1[i];
            }
        }
        System.out.println("Minimum element of an array is: "+min);
        System.out.println("And the second min element of an array is: "+min2);
    }
}