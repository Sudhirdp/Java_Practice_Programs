import java.io.*;
class NestedFor5Q7{

    public static void main(String[] args)throws IOException{

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int x=Integer.parseInt(br.readLine());
        int sum=0;
        for(int i=1;i<=x;i++){
            sum+=i;
        }
        char ch=(char)('A'+sum-1);
//        System.out.println(ch);
        for (int i=1;i<=x;i++){
            for(int j=1;j<=i;j++){
                if(i%2==1){
                    System.out.print(ch+" ");
                } else{
                    System.out.print(sum+" ");
                }
                sum--;
                ch--;
            }
            System.out.println();
        }
    }
}