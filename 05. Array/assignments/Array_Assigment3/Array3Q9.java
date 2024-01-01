import java.io.*;

class Array3Q9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of array1:");
        int n = Integer.parseInt(br.readLine());
        int arr1[] = new int[n];

        System.out.println("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(br.readLine());
        }

        //9.Print second max element from a given array
        int max=arr1[0];
        int max2=arr1[0];
        for(int j=1;j<arr1.length;j++){
            if(max<arr1[j]){
                max=arr1[j];
            }
        }
        for(int i=1;i<arr1.length;i++){
            if(max2<arr1[i] && arr1[i]!=max){
                max2=arr1[i];
            }
        }
        System.out.println("Maximum element of an array is: "+max);
        System.out.println("And the second max element of an array is: "+max2);

        //Write a program to print Automorphic numbers from array with its index
//        for (int i=0;i< arr1.length;i++){
//            int x=arr1[i];
//            int sqr=arr1[i]*arr1[i],rev=0,rev2=0;
//            for(int j=arr1[i],y=sqr;j>0;j/=10,y/=10){
//                rev=(rev*10)+(j%10);
//                rev2=(rev2*10)+(y%10);
//            }
//            if(rev==rev2){
//                System.out.println("Armstrong number "+arr1[i]+" found at index "+i);
//            }
//        }
    }
}