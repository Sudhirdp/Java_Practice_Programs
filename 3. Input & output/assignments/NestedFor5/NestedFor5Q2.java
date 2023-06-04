import java.io.*;
class NestedFor5Q2{

//            #===
//            =#==
//            ==#=
//            ===#
    static void pattern2(int x){
        for(int i=1;i<=x;i++){
            for(int j=1;j<=x;j++){
                if(i==j){
                    System.out.print('#');
                }else{
                    System.out.print('=');
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int x=Integer.parseInt(br.readLine());
        pattern2(x);
    }
}