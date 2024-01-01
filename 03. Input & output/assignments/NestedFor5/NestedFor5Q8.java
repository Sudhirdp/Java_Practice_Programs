import java.io.*;
class NestedFor5Q8{

    //    7
//    $
//    @ @
//    & & &
//    # # # #
//    $ $ $ $ $
//    @ @ @ @ @ @
//    & & & & & & &
    static void pattern8(int x){
        for(int i=1;i<=x;i++){
            for(int j=1;j<=i;j++){
                if(i%4==1){
                    System.out.print("$ ");
                } else if(i%4==2){
                    System.out.print("@ ");
                } else if(i%4==3){
                    System.out.print("& ");
                } else{
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int x=Integer.parseInt(br.readLine());
        pattern8(x);
    }
}