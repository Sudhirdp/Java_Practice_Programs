import java.io.*;
class NestedFor5Q1{

//        E5 D4 C3 B2 A1
//        A1 B2 C3 D4 E5
//        E5 D4 C3 B2 A1
//        A1 B2 C3 D4 E5
//        E5 D4 C3 B2 A1
    static void pattern1(int x,char ch){
        int rows=x,y=x;
        int x1=1;
        char ch1='A';
        for(int i=1;i<=rows;i++){
            if(i%2==0){
                ch1='A';
                y=1;
            } else{
                ch1=ch;
                y=x;
            }
            for(int j=1;j<=rows;j++){
                if(i%2==0){
                    System.out.print(ch1++ +""+y++ +" ");
                } else{
                    System.out.print(ch1-- +""+y-- +" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int x=Integer.parseInt(br.readLine());
        int y=Integer.parseInt(br.readLine());
        char ch=(char)br.read();
        br.skip(1);
        pattern1(x,ch);
        //input :- 5 5 E
    }
}