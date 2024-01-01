import java.io.*;

public class jagged_array {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Rows: ");
        int p=Integer.parseInt(br.readLine());
        int arr3[][]=new int[p][];
        System.out.println("Enter the columns: ");
        for(int i=0;i<p;i++){
            int q=Integer.parseInt(br.readLine());
            arr3[i]=new int[q];
        }
        System.out.println("Enter the elements: ");
        for(int[] x:arr3){
            for(int y:x){
                y=Integer.parseInt(br.readLine());
            }
        }
	
	//System.out.println(arr3[1][1]);

        /*System.out.println("Output: ");
        for(int[] x:arr3){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }*/
    }
}
