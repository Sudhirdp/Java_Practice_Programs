import java.io.*;

class NestedFor5Q3{

//            5 4 3 2 1
//            8 6 4 2
//            9 6 3
//            8 4
//            5
    static void pattern3(int x){
        int y=x;
        for(int i=1;i<=x;i++){
            for(int z=i*y;z>0;z=z-i){
                System.out.print(z+" ");
            }
            y--;
            System.out.println();
        }
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int x=Integer.parseInt(br.readLine());
        pattern3(x);
    }
}