import java.io.*;
class NestedFor5Q6{

    //    check whether the given char are same or not
    static void pattern6(char ch,char ch2){
        if(ch==ch2){
            System.out.println("Similar chars "+ch);
        } else{
            int diff=(int)ch2-ch;
            System.out.println(" they defer "+diff);
        }
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        char ch=(char)br.read();
        br.skip(1);
        char ch2=(char)br.read();
        br.skip(1);
        pattern6(ch,ch2);
    }
}