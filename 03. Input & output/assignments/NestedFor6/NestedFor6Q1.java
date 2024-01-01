import java.io.*;

public class NestedFor6Q1 {
    public static void main(String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter minimum Range: ");
        int min = Integer.parseInt(br.readLine());
        System.out.println(("Enter maximum Range: "));
        int max = Integer.parseInt(br.readLine());
//print numbers and count of numbers divisible by 5 and even between provided range
        int count=0;
        for(int i=min;i<=max;i++){
            if(i%5==0 && i%2==0){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Count of even divisible by 5 numbers is: "+count);

    }
}