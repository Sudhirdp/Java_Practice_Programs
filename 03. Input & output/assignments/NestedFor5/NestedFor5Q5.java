import java.io.*;
class NestedFor5Q5{
    //       input=5
//       0
//       1  1
//       2  3  5
//       8  13  21  34
    static void pattern5(int x){
        int p=0,q=1,temp;
        for(int i=1;i<x;i++){
            for(int j=1;j<=i;j++){
                System.out.print(p+"  ");
                temp=p;
                p+=q;
                q=temp;
            }
            System.out.println();
        }
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int x=Integer.parseInt(br.readLine());
        pattern5(x);
    }
}