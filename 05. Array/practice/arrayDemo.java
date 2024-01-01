import java.io.*;

public class arrayDemo {
    public static void main(String[] args)throws IOException{
		//args is also an array ,it is String class array it has no elements in it
//		for(int i=0;i<args.length;i++){
//            System.out.println(args[i]);
//        }
//        System.out.println(args.length);



		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        //arrayDemo1 obj=new arrayDemo1();
		//obj.array1(n);


    }

    void array1(int n) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int[] arr1=new int[n];
	
	for(int i=0;i<n;i++){
		arr1[i]=Integer.parseInt(br.readLine());
	}
	System.out.println("arr printing");
	for(int i=0;i<n;i++){
		System.out.println(arr1[i]);
	}
	
    }
}
