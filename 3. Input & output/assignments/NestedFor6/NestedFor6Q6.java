import java.io.*;

public class NestedFor6Q6 {
    public static void main(String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //take 5 numbers and print count of digits in these numbers
        for(int i=1;i<=5;i++){
            System.out.println("Eneter numbers: ");
            int x=Integer.parseInt(br.readLine()),count=0;
            for(int j=x;j>0;j/=10){
                count++;
            }
            System.out.println("Digit count in "+x+" is "+count);
        }
    }
}