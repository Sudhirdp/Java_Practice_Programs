import java.io.*;
class NestedFor5Q4{


//    Entered min: 2
//    Entered max: 11
//    2 4 6 8 10
//    3 5 7 9 11
    static void pattern4(int x,int y){
        System.out.println("Entered min: "+x);
        System.out.println("Entered max: "+y);
        for(int i=x;i<=y;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        for(int i=x;i<=y;i++){
            if(i%2==1){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int x=Integer.parseInt(br.readLine());
        int y=Integer.parseInt(br.readLine());
        pattern4(x,y);
    }
}