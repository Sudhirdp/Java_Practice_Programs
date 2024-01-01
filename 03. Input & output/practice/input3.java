import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class input3 {
    public static void main(String[] args)throws IOException {

        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));

//        int ch=isr.read();
//        System.out.println(ch);
//
//        String society=br1.readLine();
//        System.out.println(society);

        int x=Integer.parseInt((br1.readLine()));
        System.out.println(x);
        br1.close();

        String society2=br2.readLine();
        System.out.println();
        //due to closing of br1 all connections with jvm are broken

        char ch2=(char)isr.read();
        System.out.println(ch2);
        //this connection of ism is also broken bcz of b1.close()

        //br1,br2,isr connections are closed
        //br.readLine() returns integer
        //isr.read()  returns int
        //for isr.read() to read char we needd to have type casting

//        while reading char from bufferedreader we need to have it at last or need to use br.skip(1) at next like reason read from class notebook
    }
}
