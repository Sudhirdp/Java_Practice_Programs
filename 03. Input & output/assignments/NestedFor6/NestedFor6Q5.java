import java.io.*;

public class NestedFor6Q5 {
    public static void main(String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter minimum Range: ");
        int min = Integer.parseInt(br.readLine());
        System.out.println(("Enter maximum Range: "));
        int max = Integer.parseInt(br.readLine());

//perfect  number
        for(int i=min;i<max;i++){
            int sum=0;
            for(int j=1;j<i;j++){
                if(i%j==0){
                    sum+=j;
                }
            }
            if(sum==i){
                System.out.println(i);
            }
        }
    }
}