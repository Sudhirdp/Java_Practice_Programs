import java.io.*;

public class NestedFor6Q4 {
    public static void main(String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter minimum Range: ");
        int min = Integer.parseInt(br.readLine());
        System.out.println(("Enter maximum Range: "));
        int max = Integer.parseInt(br.readLine());
//perfect cubes
        for(int i=min;i<max;i++){
            System.out.println(i*i*i);
            if(i*i*i>=max){
                break;
            }
        }
    }
}