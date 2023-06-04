import java.io.*;

public class NestedFor6Q2 {
    public static void main(String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter minimum Range: ");
        int min = Integer.parseInt(br.readLine());
        System.out.println(("Enter maximum Range: "));
        int max = Integer.parseInt(br.readLine());
//take range from user and print composite numbers
        for(int i=min;i<=max;i++){
            int count=0;
            for(int j=1;j<i;j++){
                if(i%j==0){
                    count++;
                }
                if(count>1){
                    break;
                }
            }
            if(count>=2){
                System.out.println(i);
            }
        }
    }
}