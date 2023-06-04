import java.io.*;

public class NestedFor6Q9 {
    public static void main(String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter minimum Range: ");
        int min = Integer.parseInt(br.readLine());
        System.out.println(("Enter maximum Range: "));
        int max = Integer.parseInt(br.readLine());

        //strong numbers between range
        for(int i=min;i<max;i++){
            int sum=0;
            for(int j=i;j>0;j/=10){
                int temp=j%10,mul=1;
                for(int k=1;k<=temp;k++){
                    mul*=k;
                }
                sum+=mul;
            }
            if(i==sum){
                System.out.println(i);
            }
        }

    }
}