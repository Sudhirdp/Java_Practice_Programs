import java.io.*;

public class input2 {
    public static void main(String[] args)throws IOException{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //we can write above line as:
//        InputStreamReader isr=new InputStreamReader(System.in);
//        BufferedReader br2=new BufferedReader(isr);

        String name=br.readLine();
        System.out.println("Enter Name: "+name);

        int num2=Integer.parseInt(br.readLine());
        System.out.println("Jursey Number: "+num2);
        //br.close()            //this will close connection of keyboard (with jvm process/thread) and no more inputs are accepted

        System.out.println("Enter runRate");
        float num3=Float.parseFloat(br.readLine());
        System.out.println("RunRate is: "+num3);
    }
}
