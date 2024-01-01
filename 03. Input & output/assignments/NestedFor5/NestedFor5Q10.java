import java.io.*;
class NestedFor5Q10{

    //    Entered min: 2
//    Entered Max: 11
//    2 3 5 7 11
    static void pattern10(int min ,int max){
        System.out.println("Entered min: "+min);
        System.out.println("Entered Max: "+max);
        if(min>max){
            System.out.println("Invalid inputs min is greater than max");
        }
        for(int i=min;i<=max;i++){
            int fact=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    fact+=1;
                }
                if(fact>2){
                    break;
                }
            }
            if(fact==2){
                System.out.print(i+" ");
            }

        }
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int x=Integer.parseInt(br.readLine());
        int y=Integer.parseInt(br.readLine());
        pattern10(x,y);
    }
}