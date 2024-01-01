import java.io.*;

public class NestedFor6Q3 {
    public static void main(String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter minimum Range: ");
        int min = Integer.parseInt(br.readLine());
        System.out.println(("Enter maximum Range: "));
        int max = Integer.parseInt(br.readLine());
        //take range as input from user and print squares between that range
        for(int i=min;i<max;i++){
            System.out.println(i*i);
            if(i*i>=max){
                break;
            }
        }
    }
}