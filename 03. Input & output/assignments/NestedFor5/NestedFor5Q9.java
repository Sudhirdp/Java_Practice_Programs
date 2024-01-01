import java.io.*;

class NestedFor5Q9{

    //print sum of factorials of digits
    static void pattern9(int x){
        int sum=0;
        for(int i=x;i>0;i/=10){
            int temp=i%10;
            int mul=1;
            for(int j=1;j<=temp;j++){
                mul*=j;
            }
            sum+=mul;
        }
        System.out.println(sum);
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int x=Integer.parseInt(br.readLine());
        pattern9(x);
    }
}