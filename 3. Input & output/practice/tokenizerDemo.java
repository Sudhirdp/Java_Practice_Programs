import java.io.*;
import java.util.*;
import java.util.regex.PatternSyntaxException;

public class tokenizerDemo {
    public static void main(String[] args)throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Info : ProductName Batch Quantity Cost  ");
        String info=br.readLine();

//        StringTokenizer st=new StringTokenizer(info," ");
//        String productName=st.nextToken();
//        char batch= st.nextToken().charAt(0);
//        int quantity=Integer.parseInt(st.nextToken());
//        float cost=Float.parseFloat(st.nextToken());
//
//        System.out.println("Product Name: "+productName);
//        System.out.println("Batch of Product: "+batch);
//        System.out.println("Quantity : \t"+quantity);
//        System.out.println("Cost per product: "+cost);

        String[] results=info.split("\\s");
//        for (int i=0;i< results.length;i++){
//            System.out.println(results[i]);
//        }

//        StringTokenizer st=new StringTokenizer(info," ");
//        st.countTokens();
//        while (st.hasMoreTokens()){
//            System.out.println(st.nextToken());
//        }


    }
}
