import java.io.*;

public class NestedFor6Q8 {
    public static void main(String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter minimum Range: ");
        int min = Integer.parseInt(br.readLine());
        System.out.println(("Enter maximum Range: "));
        int max = Integer.parseInt(br.readLine());

        //print all palindromes between provided range
        for(int i=min;i<max;i++){
            int rev=0;
            for(int j=i;j>0;j/=10){
                rev=(rev*10)+(j%10);
            }
            if(rev==i){
                System.out.println(i);
            }
        }
    }
}