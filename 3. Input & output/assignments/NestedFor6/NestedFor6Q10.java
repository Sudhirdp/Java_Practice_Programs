import java.io.*;

public class NestedFor6Q10 {
    public static void main(String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter minimum Range: ");
        int min = Integer.parseInt(br.readLine());
        System.out.println(("Enter maximum Range: "));
        int max = Integer.parseInt(br.readLine());

        //armstrong number
        for(int l=min;l<max;l++){
            int count=0;
            for(int i=l;i>0;i/=10){
                count++;
            }
            int sum=0;
            for(int i=l;i>0;i/=10){
                int temp=i%10,mul=1;
                for(int j=1;j<=count;j++){
                    mul*=temp;
                }
                sum+=mul;
            }
            if(l==sum){
                System.out.println(l);
            }
        }
    }
}